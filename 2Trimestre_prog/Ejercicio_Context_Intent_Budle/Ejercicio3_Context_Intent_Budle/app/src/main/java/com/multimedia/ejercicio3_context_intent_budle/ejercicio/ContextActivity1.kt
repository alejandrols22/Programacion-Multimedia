package com.multimedia.ejercicio3_context_intent_budle.ejercicio


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.ejercicio3_context_intent_budle.R


class ContextActivity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_context1)

        val btnMostrarMensaje: Button = findViewById(R.id.btnMostrarMensaje)
        val btnIrAOtraActividad: Button = findViewById(R.id.btnIrAOtraActividad)

        btnMostrarMensaje.setOnClickListener {
            mostrarMensaje()
        }

        btnIrAOtraActividad.setOnClickListener {
            irAOtraActividad()
        }
    }

    private fun mostrarMensaje() {
        Toast.makeText(this, "¡Hola desde el contexto!", Toast.LENGTH_SHORT).show()
        Log.d("ContextActivity1", "Hola iniciando la segunda actividad")
    }

    private fun irAOtraActividad() {
        val intent = Intent(this, OtroActivity::class.java)
        startActivity(intent)
    }
}
