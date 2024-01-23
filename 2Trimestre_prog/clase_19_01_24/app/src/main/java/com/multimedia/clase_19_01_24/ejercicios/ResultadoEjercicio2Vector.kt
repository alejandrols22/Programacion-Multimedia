package com.multimedia.clase_19_01_24.ejercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.multimedia.clase_19_01_24.R

class ResultadoEjercicio2Vector : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_ejercicio2_vector)

        val ingresos = intent.getIntExtra("ingresos", 0)
        val edad = intent.getIntExtra("edad", 0)
        val ultimoCardViewClicado = intent.getStringExtra("ultimoCardViewClicado") ?: ""

        val tvIngresosResultado = findViewById<TextView>(R.id.tvIngresosResultado)
        val tvEdad = findViewById<TextView>(R.id.tvEdadResultado)
        val tvUltimoCardView = findViewById<TextView>(R.id.tvUltimoCardView)

        tvIngresosResultado.text = "Ingresos al mes: $ingresos"
        tvEdad.text = "Edad: $edad"
        tvUltimoCardView.text = "Último CardView pulsado: $ultimoCardViewClicado"
    }
}
