package com.multimedia.clase_15_01_24_ejercicio1.ejercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.multimedia.clase_15_01_24_ejercicio1.R

class ResultadoEjercicio1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_ejercicio1)

        val resultado = intent.getDoubleExtra("RESULTADO", 0.0)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        tvResultado.text = "El resultado es: $resultado"
    }
}
