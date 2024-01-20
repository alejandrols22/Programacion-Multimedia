package com.multimedia.clase_19_01_24.ejercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.SeekBar
import android.widget.TextView
import com.multimedia.clase_19_01_24.R

class Ejercicio3Vector2 : AppCompatActivity() {


        private lateinit var tvTemperatura: TextView
        private lateinit var tvHumedad: TextView
        private lateinit var sbTemperatura: SeekBar
        private lateinit var sbHumedad: SeekBar
        private lateinit var ivTermometro: ImageView
        private lateinit var ivGotas: ImageView

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_ejercicio3_vector2)

            // Enlazamos las vistas con sus respectivos IDs
            tvTemperatura = findViewById(R.id.tvTemperatura)
            tvHumedad = findViewById(R.id.tvHumedad)
            sbTemperatura = findViewById(R.id.sbTemperatura)
            sbHumedad = findViewById(R.id.sbHumedad)
            ivTermometro = findViewById(R.id.ivTermometro)
            ivGotas = findViewById(R.id.ivGotas)

            // Configuramos el listener para el SeekBar de la temperatura
            sbTemperatura.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                    tvTemperatura.text = getString(R.string.temperatura_format, progress)
                }

                override fun onStartTrackingTouch(seekBar: SeekBar) {}
                override fun onStopTrackingTouch(seekBar: SeekBar) {}
            })

            // Configuramos el listener para el SeekBar de la humedad
            sbHumedad.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                    tvHumedad.text = getString(R.string.humedad_format, progress)
                }

                override fun onStartTrackingTouch(seekBar: SeekBar) {}
                override fun onStopTrackingTouch(seekBar: SeekBar) {}
            })
        }
    }
