package com.multimedia.clase_12_01_24_ejercicio7.ejercicios


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.util.*
import com.multimedia.clase_12_01_24_ejercicio7.R

class ResultadoEjercicio7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_ejercicio7)
        val tvResult = findViewById<TextView>(R.id.tvResult)
        val nombre: String = intent.extras?.getString("EXTRA_NAME").orEmpty()
        tvResult.text = "Hola $nombre"
        val apellido: String = intent.extras?.getString("EXTRA_NAME").orEmpty()
        tvResult.text = "Hola $apellido"
        val curso: String = intent.extras?.getString("EXTRA_NAME").orEmpty()
        tvResult.text = "Hola $curso"
        val asignatura: String = intent.extras?.getString("EXTRA_NAME").orEmpty()
        tvResult.text = "Hola $asignatura"
        val nota: String = intent.extras?.getString("EXTRA_NAME").orEmpty()
        tvResult.text = "Hola $nota"
    }
}