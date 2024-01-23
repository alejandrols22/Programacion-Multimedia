package com.multimedia.clase_19_01_24.ejercicios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.multimedia.clase_19_01_24.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import androidx.cardview.widget.CardView
import com.google.android.material.slider.RangeSlider

class Ejercicio2Vector : AppCompatActivity() {

    private lateinit var tvIngresos: TextView
    private lateinit var tvAnos: TextView
    private lateinit var rangeSlider: RangeSlider
    private val incrementoDeIngresos = 100
    private var ultimoCardViewClicado: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio2_vector)


        tvIngresos = findViewById(R.id.tvIngresos)
        tvAnos = findViewById(R.id.tvAnos)
        rangeSlider = findViewById(R.id.rsEdad)


        val cardView1 = findViewById<CardView>(R.id.cardView1)
        val cardView2 = findViewById<CardView>(R.id.cardView2)
        val cardView3 = findViewById<CardView>(R.id.cardView3)
        val cardView4 = findViewById<CardView>(R.id.cardView4)

        cardView1.setOnClickListener { updateLastClickedCardView("cardView1") }
        cardView2.setOnClickListener { updateLastClickedCardView("cardView2") }
        cardView3.setOnClickListener { updateLastClickedCardView("cardView3") }
        cardView4.setOnClickListener { updateLastClickedCardView("cardView4") }


        val btnMayor = findViewById<FloatingActionButton>(R.id.btnMayor)
        val btnMenor = findViewById<FloatingActionButton>(R.id.btnMenor)
        val btnAceptar = findViewById<Button>(R.id.btnAceptar)

        btnMayor.setOnClickListener { aumentarIngresos() }
        btnMenor.setOnClickListener { disminuirIngresos() }
        btnAceptar.setOnClickListener { onBotonDentroCardViewClick() }


        rangeSlider.addOnChangeListener { _, value, _ ->
            tvAnos.text = "${value.toInt()} años"
        }
    }

    private fun updateLastClickedCardView(cardViewId: String) {
        ultimoCardViewClicado = cardViewId
    }

    private fun aumentarIngresos() {
        val valorActual = tvIngresos.text.toString().toInt()
        val nuevoValor = valorActual + incrementoDeIngresos
        if (nuevoValor <= Int.MAX_VALUE) {
            tvIngresos.text = nuevoValor.toString()
        }
    }

    private fun disminuirIngresos() {
        val valorActual = tvIngresos.text.toString().toInt()
        val nuevoValor = valorActual - incrementoDeIngresos
        if (nuevoValor >= 0) {
            tvIngresos.text = nuevoValor.toString()
        }
    }

    private fun onBotonDentroCardViewClick() {
        val intent = Intent(this, ResultadoEjercicio2Vector::class.java)
        val ingresos = tvIngresos.text.toString().toInt()
        val edad = rangeSlider.values[0].toInt()
        intent.putExtra("ingresos", ingresos)
        intent.putExtra("edad", edad)
        intent.putExtra("ultimoCardViewClicado", ultimoCardViewClicado)
        startActivity(intent)
    }
}
