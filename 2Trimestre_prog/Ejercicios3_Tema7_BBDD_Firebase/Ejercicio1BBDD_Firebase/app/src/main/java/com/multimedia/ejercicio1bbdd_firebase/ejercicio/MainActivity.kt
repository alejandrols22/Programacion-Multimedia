package com.multimedia.ejercicio1bbdd_firebase.ejercicio

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.ejercicio1bbdd_firebase.R

class MainActivity : AppCompatActivity() {

    private lateinit var tvMuestraNombre: TextView
    private lateinit var etNombre: EditText
    private lateinit var btnAgregar: Button
    private lateinit var btnTodos: Button
    private lateinit var databaseHelper: DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        databaseHelper = DatabaseHelper(this)

        tvMuestraNombre = findViewById(R.id.tvMuestraNombre)
        etNombre = findViewById(R.id.etNombre)
        btnAgregar = findViewById(R.id.btnAgregar)
        btnTodos = findViewById(R.id.btnTodos)

        btnAgregar.setOnClickListener {
            val nombre = etNombre.text.toString()
            databaseHelper.addName(nombre)
            etNombre.text.clear()
            tvMuestraNombre.text = "Nombre agregado: $nombre"
        }

        btnTodos.setOnClickListener {
            val cursor = databaseHelper.getAllNames()
            val nombres = StringBuilder()
            while (cursor.moveToNext()) {
                val nombre = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_NAME))
                nombres.append("$nombre\n")
            }
            cursor.close()
            tvMuestraNombre.text = nombres.toString()
        }
    }
}
