package com.multimedia.clase_12_01_24_ejercicio7.ejercicios


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.util.*
import com.multimedia.clase_12_01_24_ejercicio7.R

class ResultadoEjercicio7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(
            savedInstanceState
        )
        setContentView(R.layout.activity_resultado_ejercicio7)

        val tvSaludo = findViewById<TextView>(R.id.tvSaludo)
        val tvDetalles = findViewById<TextView>(R.id.tvDetalles)

        val nombre = intent.getStringExtra("EXTRA_NOMBRE").orEmpty()
        val apellido = intent.getStringExtra("EXTRA_APELLIDO").orEmpty()
        val curso = intent.getStringExtra("EXTRA_CURSO").orEmpty()
        val asignatura = intent.getStringExtra("EXTRA_ASIGNATURA").orEmpty()
        val nota = intent.getStringExtra("EXTRA_NOTA").orEmpty()

        tvSaludo.text = "Hola $nombre"
        tvDetalles.text =
            "Detalles:\nApellidos: $apellido\nCurso: $curso\nAsignatura: $asignatura\nNota: $nota"
    }
}


