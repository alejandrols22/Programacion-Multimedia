package com.multimedia.clase_29_01_24_layoutinflate_ejercicio3.ejercicio3


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.clase_29_01_24_layoutinflate_ejercicio3.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        // Inflar el diseño XML de la actividad principal
        val rootView: View = LayoutInflater.from(this).inflate(R.layout.activity_main, null)
        setContentView(rootView)


        // Obtener referencia al botón en la actividad principal
        val btnGoToImages = findViewById<Button>(R.id.btnGoToImages)


        // Configurar el clic del botón para ir a la actividad de imágenes
        btnGoToImages.setOnClickListener { // Iniciar la actividad de imágenes
            val intent = Intent(
                this@MainActivity,
                ImagesActivity::class.java
            )
            startActivity(intent)
        }
    }
}

