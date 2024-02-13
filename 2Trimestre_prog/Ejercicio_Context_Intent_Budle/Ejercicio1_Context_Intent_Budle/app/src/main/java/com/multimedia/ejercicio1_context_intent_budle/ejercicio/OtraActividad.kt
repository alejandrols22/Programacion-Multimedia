package com.multimedia.ejercicio1_context_intent_budle.ejercicio

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.ejercicio1_context_intent_budle.R

class OtraActividad : AppCompatActivity() {

    private lateinit var tvNombre: TextView
    private lateinit var tvEdad: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otra)

        // Inicializar las vistas
        tvNombre = findViewById(R.id.tvNombre)
        tvEdad = findViewById(R.id.tvEdad)

        // Obtener datos del Intent
        val bundle = intent.extras
        val nombre = bundle?.getString("nombre")
        val edad = bundle?.getInt("edad")

        // Mostrar datos en la interfaz de usuario
        tvNombre.text = "Nombre: $nombre"
        tvEdad.text = "Edad: $edad años"
    }
}
