package com.multimedia.clase_22_01_24.ejercicios

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.clase_22_01_24.R
import java.util.Locale

class MainActivity : AppCompatActivity() {
    private var seekBarAltura: SeekBar? = null
    private var textViewAlturaValue: TextView? = null
    private var textViewPesoValue: TextView? = null
    private var textViewEdadValue: TextView? = null
    private var altura = 120 // valor inicial para la altura en cm
    private var peso = 70 // valor inicial para el peso en kg
    private var edad = 30 // valor inicial para la edad en años

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicialización de vistas
        seekBarAltura = findViewById(R.id.seekBarAltura)
        textViewAlturaValue = findViewById(R.id.textViewAlturaValue)
        textViewPesoValue = findViewById(R.id.textViewPesoValue)
        textViewEdadValue = findViewById(R.id.textViewEdadValue)

        // Configurar SeekBar para la altura
        configurarSeekBarAltura()

        // Configurar botones de incremento y decremento para peso y edad
        configurarBotones()

        // Botón para calcular el IMC
        val botonCalcular = findViewById<Button>(R.id.botonCalcular)
        botonCalcular.setOnClickListener { calcularIMC() }
    }

    private fun configurarSeekBarAltura() {
        seekBarAltura!!.max = 250
        seekBarAltura!!.progress = altura
        textViewAlturaValue!!.text = String.format(Locale.getDefault(), "%d cm", altura)
        seekBarAltura!!.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                altura = progress
                textViewAlturaValue!!.text = String.format(Locale.getDefault(), "%d cm", altura)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {

            }
        })
    }

    private fun configurarBotones() {
        findViewById<View>(R.id.buttonDecrementarPeso).setOnClickListener {
            cambiarPeso(-1)
        }
        findViewById<View>(R.id.buttonIncrementarPeso).setOnClickListener {
            cambiarPeso(1)
        }
        findViewById<View>(R.id.buttonDecrementarEdad).setOnClickListener {
            cambiarEdad(-1)
        }
        findViewById<View>(R.id.buttonIncrementarEdad).setOnClickListener {
            cambiarEdad(1)
        }
    }

    private fun cambiarPeso(cambio: Int) {
        peso += cambio
        if (peso < 0) peso = 0 // evitar peso negativo
        textViewPesoValue!!.text = String.format(Locale.getDefault(), "%d kg", peso)
    }

    private fun cambiarEdad(cambio: Int) {
        edad += cambio
        if (edad < 0) edad = 0 // evitar edad negativa
        textViewEdadValue!!.text = String.format(Locale.getDefault(), "%d años", edad)
    }

    private fun calcularIMC() {
        val intent = Intent(this, ResultadoActivity::class.java)
        intent.putExtra("PESO", peso.toDouble())
        intent.putExtra("ALTURA", altura.toDouble())
        startActivity(intent)
    }
}
