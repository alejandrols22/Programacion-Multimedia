package com.multimedia.clase_22_01_24.ejercicios


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.clase_22_01_24.R
import java.util.Locale





class ResultadoActivity : AppCompatActivity() {
    private var textViewClasificacionIMC: TextView? = null
    private var textViewValorIMC: TextView? = null
    private var textViewDescripcionIMC: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        // Vincula las vistas del layout
        textViewClasificacionIMC = findViewById(R.id.textViewClasificacionIMC)
        textViewValorIMC = findViewById(R.id.textViewValorIMC)
        textViewDescripcionIMC = findViewById(R.id.textViewDescripcionIMC)

        // Supongamos que estos valores vienen de la otra actividad donde el usuario los ingresó
        val peso = 70.0 // Peso en kilogramos
        val altura = 170.0 // Altura en centímetros

        // Calcula el IMC
        val imc = calcularIMC(peso, altura)

        // Actualiza la UI con el IMC y la clasificación
        mostrarResultados(imc)

        // Configurar el botón RE-CALCULAR
        val botonReCalcular = findViewById<Button>(R.id.botonRECalcular)
        botonReCalcular.setOnClickListener {
            volverAMainActivity()
        }
    }

    private fun calcularIMC(peso: Double, altura: Double): Double {
        val alturaEnMetros = altura / 100 // Altura en metros
        return peso / (alturaEnMetros * alturaEnMetros) // Fórmula del IMC
    }

    private fun mostrarResultados(imc: Double) {
        val valorIMC = String.format(Locale.getDefault(), "%.2f", imc)
        textViewValorIMC!!.text = valorIMC

        val clasificacion: String
        val descripcion: String

        when {
            imc < 18.5 -> {
                clasificacion = "Bajo peso"
                descripcion = "Estás por debajo del peso normal."
            }
            imc <= 24.9 -> {
                clasificacion = "Peso normal"
                descripcion = "Estás en tu peso normal."
            }
            imc <= 29.9 -> {
                clasificacion = "Sobrepeso"
                descripcion = "Estás ligeramente por encima de tu peso normal."
            }
            imc <= 34.9 -> {
                clasificacion = "Obesidad (Grado 1)"
                descripcion = "Es recomendable que empieces a cuidarte más."
            }
            imc <= 39.9 -> {
                clasificacion = "Obesidad (Grado 2)"
                descripcion = "Es importante considerar un cambio de hábitos."
            }
            else -> {
                clasificacion = "Obesidad extrema (Grado 3)"
                descripcion = "Debes acudir urgentemente al hospital."
            }
        }

        textViewClasificacionIMC!!.text = clasificacion
        textViewDescripcionIMC!!.text = descripcion
    }

    private fun volverAMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish() // Opcional: Cierra esta actividad
    }
}
