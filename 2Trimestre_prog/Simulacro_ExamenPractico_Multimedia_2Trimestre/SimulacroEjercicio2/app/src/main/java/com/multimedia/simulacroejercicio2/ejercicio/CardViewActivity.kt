package com.multimedia.simulacroejercicio2.ejercicio

import com.multimedia.simulacroejercicio2.R
import android.os.Bundle
import android.widget.NumberPicker
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class CardViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_view)

        // Configurar NumberPicker
        val numberPicker = findViewById<NumberPicker>(R.id.numberPicker).apply {
            minValue = 0 // Valor mínimo
            maxValue = 100 // Valor máximo
            setOnValueChangedListener { _, _, newVal ->
                // Mostrar un Toast con la edad seleccionada
                Toast.makeText(this@CardViewActivity, "Edad seleccionada: $newVal", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
