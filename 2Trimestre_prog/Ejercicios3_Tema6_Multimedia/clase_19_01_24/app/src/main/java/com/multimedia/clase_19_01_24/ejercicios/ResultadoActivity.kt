package com.multimedia.clase_19_01_24.ejercicios

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.clase_19_01_24.R

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        // Recibe los datos del intent
        val datosRecibidos = intent.getStringExtra("datos")

        // Encuentra el TextView y establece el texto
        val textViewResultado = findViewById<TextView>(R.id.textViewResultado)
        textViewResultado.text = datosRecibidos

        // Botón para volver al menú principal
        val botonVolver = findViewById<Button>(R.id.botonVolver)
        botonVolver.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
    }
}
