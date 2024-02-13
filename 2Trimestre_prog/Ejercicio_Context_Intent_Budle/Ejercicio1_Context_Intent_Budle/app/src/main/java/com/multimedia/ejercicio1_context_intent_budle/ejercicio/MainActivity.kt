package com.multimedia.ejercicio1_context_intent_budle.ejercicio

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.ejercicio1_context_intent_budle.R


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun irAOtraActividad(view: View) {
        val nombre = "John"
        val edad = 25


        // Crear un Intent para ir a OtraActividad
        val intent = Intent(this, OtraActividad::class.java)


        // Crear un Bundle para enviar datos
        val bundle = Bundle().apply {
            putString("nombre", nombre)
            putInt("edad", edad)
        }


        // Adjuntar el Bundle al Intent
        intent.putExtras(bundle)


        // Iniciar OtraActividad
        startActivity(intent)
    }
}
