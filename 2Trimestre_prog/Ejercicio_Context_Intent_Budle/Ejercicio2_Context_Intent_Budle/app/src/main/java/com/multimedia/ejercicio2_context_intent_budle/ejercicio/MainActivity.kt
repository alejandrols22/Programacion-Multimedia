package com.multimedia.ejercicio2_context_intent_budle.ejercicio

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.ejercicio2_context_intent_budle.R


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun irAOtraActividad(view: View) {
        val nombre = "John"
        val edad = 25


        // Crear un Intent y adjuntar datos directamente
        val intent = Intent(this, OtraActividad::class.java)
            .putExtra("nombre", nombre)
            .putExtra("edad", edad)


        // Iniciar OtraActividad
        startActivity(intent)
    }
}
