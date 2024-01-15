package com.multimedia.clase_15_01_24_ejercicio1.ejercicios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.multimedia.clase_15_01_24_ejercicio1.R


    class Ejercicio1<Button : View?> : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_ejercicio1)

            val etOperador1 = findViewById<EditText>(R.id.etOperador1)
            val etOperador2 = findViewById<EditText>(R.id.etOperador2)

            val btnSumar = findViewById<Button>(R.id.btnSumar)
            val btnRestar = findViewById<Button>(R.id.btnRestar)
            val btnMultiplicar = findViewById<Button>(R.id.btnMultiplicar)
            val btnDividir = findViewById<Button>(R.id.btnDividir)


            if (btnSumar != null) {
                btnSumar.setOnClickListener {
                    val resultado = calcularResultado(etOperador1.text.toString(), etOperador2.text.toString(), "sumar")
                    iniciarActividadResultado(resultado)
                }
            }

            if (btnRestar != null) {
                btnRestar.setOnClickListener {
                    val resultado = calcularResultado(etOperador1.text.toString(), etOperador2.text.toString(), "restar")
                    iniciarActividadResultado(resultado)
                }
            }

            if (btnMultiplicar != null) {
                btnMultiplicar.setOnClickListener {
                    val resultado = calcularResultado(etOperador1.text.toString(), etOperador2.text.toString(), "multiplicar")
                    iniciarActividadResultado(resultado)
                }
            }

            if (btnDividir != null) {
                btnDividir.setOnClickListener {
                    val resultado = calcularResultado(etOperador1.text.toString(), etOperador2.text.toString(), "dividir")
                    iniciarActividadResultado(resultado)
                }
            }

        }

        private fun calcularResultado(op1: String, op2: String, operacion: String): Double {
            val num1 = op1.toDoubleOrNull() ?: 0.0
            val num2 = op2.toDoubleOrNull() ?: 0.0

            return when (operacion) {
                "sumar" -> num1 + num2
                "restar" -> num1 - num2
                "multiplicar" -> num1 * num2
                "dividir" -> if (num2 != 0.0) num1 / num2 else 0.0
                else -> 0.0
            }
        }

        private fun iniciarActividadResultado(resultado: Double) {
            val intent = Intent(this, ResultadoEjercicio1::class.java)
            intent.putExtra("RESULTADO", resultado)
            startActivity(intent)
        }
    }
