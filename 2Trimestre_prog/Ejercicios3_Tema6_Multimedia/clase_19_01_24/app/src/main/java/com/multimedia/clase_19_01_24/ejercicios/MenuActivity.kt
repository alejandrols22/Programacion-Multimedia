package com.multimedia.clase_19_01_24.ejercicios

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.clase_19_01_24.R


class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        // Botón para el Ejercicio 1 (Login)
        val botonEjercicio1 = findViewById<Button>(R.id.buttonEjercicio1)
        botonEjercicio1.setOnClickListener {
            val intent = Intent(this, Ejercicio1UsuarioLogin::class.java)
            startActivity(intent)
        }

        // Botón para el Ejercicio 2 (Vector)
        val botonEjercicio2 = findViewById<Button>(R.id.buttonEjercicio2)
        botonEjercicio2.setOnClickListener {
            val intent = Intent(this, Ejercicio2Vector::class.java)
            startActivity(intent)
        }

        // Botón para el Ejercicio 3 (Vector 2)
        val botonEjercicio3 = findViewById<Button>(R.id.buttonEjercicio3)
        botonEjercicio3.setOnClickListener {
            val intent = Intent(this, Ejercicio3Vector2::class.java)
            startActivity(intent)
        }
    }
}



