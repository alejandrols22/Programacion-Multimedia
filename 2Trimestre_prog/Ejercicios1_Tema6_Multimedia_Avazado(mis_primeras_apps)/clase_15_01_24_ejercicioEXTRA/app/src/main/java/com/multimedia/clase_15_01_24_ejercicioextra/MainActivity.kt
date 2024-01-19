package com.multimedia.clase_15_01_24_ejercicioextra

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var textVista: TextView
    private var operacion: Char = ' '
    private var numeroActual = StringBuilder()
    private var primerOperador = 0.0
    private var segundoOperador = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textVista = findViewById(R.id.textViewDisplay)

        // Define la lógica para cada botón numérico y de operación
        val botones = listOf(
            R.id.boton0, R.id.boton1, R.id.boton2, R.id.boton3,
            R.id.boton4, R.id.boton5, R.id.boton6, R.id.boton7,
            R.id.boton8, R.id.boton9, R.id.botonPunto, R.id.botonSuma,
            R.id.botonResta, R.id.botonMultiplicar, R.id.botonDividir,
            R.id.botonIgual, R.id.botonBorrar
        )

        botones.forEach { botonId ->
            findViewById<Button>(botonId).setOnClickListener { buttonClicked(it) }
        }
    }

    private fun buttonClicked(view: View) {
        when (view.id) {
            R.id.botonBorrar -> resetCalculator()
            R.id.botonIgual -> calculateResult()
            R.id.botonSuma, R.id.botonResta, R.id.botonMultiplicar, R.id.botonDividir -> {
                operacion = (view as Button).text.first()
                primerOperador = numeroActual.toString().toDoubleOrNull() ?: 0.0
                numeroActual.clear()
            }
            else -> {
                val number = (view as Button).text
                numeroActual.append(number)
                textVista.text = numeroActual
            }
        }
    }

    private fun resetCalculator() {
        numeroActual.clear()
        primerOperador = 0.0
        segundoOperador = 0.0
        operacion = ' '
        textVista.text = "0"
    }

    private fun calculateResult() {
        segundoOperador = numeroActual.toString().toDoubleOrNull() ?: 0.0
        val result = when (operacion) {
            '+' -> primerOperador + segundoOperador
            '-' -> primerOperador - segundoOperador
            '*' -> primerOperador * segundoOperador
            '/' -> if (segundoOperador != 0.0) primerOperador / segundoOperador else Double.NaN
            else -> 0.0
        }
        textVista.text = result.toString()
        numeroActual.clear()
        numeroActual.append(result)
    }
}
