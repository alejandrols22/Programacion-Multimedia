package com.multimedia.ejercicio2_bbdd.ejercicio


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.ejercicio2_bbdd.R

class MainActivity : AppCompatActivity() {

    private lateinit var etNombre: EditText
    private lateinit var etContraseña: EditText // EditText para la contraseña
    private lateinit var btnAgregar: Button
    private lateinit var btnMostrar: Button
    private lateinit var tvMuestraNombre: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicialización de las vistas
        etNombre = findViewById(R.id.etNombre)
        etContraseña = findViewById(R.id.etContraseña) // Inicialización del EditText de contraseña
        btnAgregar = findViewById(R.id.btnAgregar)
        btnMostrar = findViewById(R.id.btnMostrar)
        tvMuestraNombre = findViewById(R.id.tvMuestraNombre)

        val dataManager = DataManager(this)

        btnAgregar.setOnClickListener {
            val nombre = etNombre.text.toString()
            val contraseña = etContraseña.text.toString()
            if (nombre.isNotEmpty() && contraseña.isNotEmpty()) {
                dataManager.agregarNombreYContraseña(nombre, contraseña)
                etNombre.text.clear()
                etContraseña.text.clear() // Limpiar el campo de contraseña después de agregar
            }
        }

        btnMostrar.setOnClickListener {
            val registros = dataManager.obtenerTodosLosNombresYContraseñas()
            tvMuestraNombre.text = registros
        }
    }
}

