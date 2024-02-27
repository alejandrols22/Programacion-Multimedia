package com.multimedia.simulacroejercicio2.ejercicio



import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.simulacroejercicio2.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Obtener las instancias de los botones
        val btnVideos = findViewById<Button>(R.id.btnVideos)
        val btnAnimations = findViewById<Button>(R.id.btnAnimations)
        val btnCaptureName = findViewById<Button>(R.id.btnCaptureName)

        // Configurar el evento onClick para Ver Videos
        btnVideos.setOnClickListener {
            // Aquí iría el código para iniciar la actividad de videos
            Toast.makeText(this, "Mostrando videos...", Toast.LENGTH_SHORT).show()
        }

        // Configurar el evento onClick para Ver Animaciones
        btnAnimations.setOnClickListener {
            // Aquí iría el código para iniciar la actividad de animaciones
            Toast.makeText(this, "Mostrando animaciones...", Toast.LENGTH_SHORT).show()
        }

        // Configurar el evento onClick para Capturar Nombre
        btnCaptureName.setOnClickListener {
            // Aquí iría el código para capturar el nombre del usuario
            Toast.makeText(this, "Capturando nombre del usuario...", Toast.LENGTH_SHORT).show()
        }
    }
}
