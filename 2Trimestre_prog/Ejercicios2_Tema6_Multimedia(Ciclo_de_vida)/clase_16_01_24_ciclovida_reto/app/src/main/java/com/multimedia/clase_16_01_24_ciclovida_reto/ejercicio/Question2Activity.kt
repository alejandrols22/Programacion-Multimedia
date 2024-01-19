package com.multimedia.clase_16_01_24_ciclovida_reto.ejercicio

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.clase_16_01_24_ciclovida_reto.R

class Question2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question2)
    }

    fun comprobarRespuesta(view: View) {
        when (view.id) {
            R.id.btnRespuestaCorrecta2 -> {
                Toast.makeText(this, "¡Respuesta correcta!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, Question3Activity::class.java)
                startActivity(intent)
            }
            else -> {
                Toast.makeText(this, "Respuesta incorrecta. Intenta de nuevo.", Toast.LENGTH_SHORT).show()
                finish()
            }
        }
    }
}
