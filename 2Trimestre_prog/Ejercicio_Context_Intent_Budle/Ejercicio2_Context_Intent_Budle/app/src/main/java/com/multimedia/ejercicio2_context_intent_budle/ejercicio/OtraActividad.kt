package com.multimedia.ejercicio2_context_intent_budle.ejercicio

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.ejercicio2_context_intent_budle.R

class OtraActividad : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otra_actividad)

        // Obtener las vistas usando findViewById
        val tvNombre: TextView = findViewById(R.id.tvNombre)
        val tvEdad: TextView = findViewById(R.id.tvEdad)

        // Obtener datos directamente del Intent
        val nombre = intent.getStringExtra("nombre")
        val edad = intent.getIntExtra("edad", 0)

        // Mostrar datos en la interfaz de usuario
        tvNombre.text = "Nombre: $nombre"
        tvEdad.text = "Edad: $edad años"
    }
}
