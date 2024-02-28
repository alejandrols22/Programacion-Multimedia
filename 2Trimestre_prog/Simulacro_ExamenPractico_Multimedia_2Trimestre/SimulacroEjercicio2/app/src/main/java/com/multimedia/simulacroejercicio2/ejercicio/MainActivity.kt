package com.multimedia.simulacroejercicio2.ejercicio

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.Window
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.simulacroejercicio2.R

class MainActivity : AppCompatActivity() {
    private val logTag = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Botones para reproducir videos
        val btnVideo1 = findViewById<Button>(R.id.btnVideo1)
        val btnVideo2 = findViewById<Button>(R.id.btnVideo2)
        val btnVideo3 = findViewById<Button>(R.id.btnVideo3)

        // Botones para las animaciones
        val btnAnimation1 = findViewById<Button>(R.id.btnAnimation1)
        val btnAnimation2 = findViewById<Button>(R.id.btnAnimation2)
        val btnAnimation3 = findViewById<Button>(R.id.btnAnimation3)

        // Botones para otras funcionalidades
        val btnCaptureName = findViewById<Button>(R.id.btnCaptureName)
        val btnDatePicker = findViewById<Button>(R.id.btnDatePicker)
        val btnTimePicker = findViewById<Button>(R.id.btnTimePicker)


        val btnShowDialog = findViewById<Button>(R.id.btnShowDialog)

        // Encuentra el botón por su ID
        val btnOpenCardViewActivity = findViewById<Button>(R.id.btnOpenCardViewActivity)

        // Configura el OnClickListener para el botón
        btnOpenCardViewActivity.setOnClickListener {
            // Crea un Intent para abrir CardViewActivity
            val intent = Intent(this, CardViewActivity::class.java)
            // Inicia la actividad
            startActivity(intent)
        }
        // Eventos onClick para cada botón de video
        btnVideo1.setOnClickListener {
            Log.d(logTag, "Video 1 seleccionado")
            Toast.makeText(this, "Reproduciendo Video 1...", Toast.LENGTH_SHORT).show()
            startVideoActivity(R.raw.video1)
        }

        btnVideo2.setOnClickListener {
            Log.d(logTag, "Video 2 seleccionado")
            Toast.makeText(this, "Reproduciendo Video 2...", Toast.LENGTH_SHORT).show()
            startVideoActivity(R.raw.video2)
        }

        btnVideo3.setOnClickListener {
            Log.d(logTag, "Video 3 seleccionado")
            Toast.makeText(this, "Reproduciendo Video 3...", Toast.LENGTH_SHORT).show()
            startVideoActivity(R.raw.video3)
        }

        // Eventos onClick para cada botón de animación
        btnAnimation1.setOnClickListener {
            Log.d(logTag, "Animación 1 seleccionada")
            Toast.makeText(this, "Mostrando Animación 1...", Toast.LENGTH_SHORT).show()
            startAnimationActivity(1)
        }

        btnAnimation2.setOnClickListener {
            Log.d(logTag, "Animación 2 seleccionada")
            Toast.makeText(this, "Mostrando Animación 2...", Toast.LENGTH_SHORT).show()
            startAnimationActivity(2)
        }

        btnAnimation3.setOnClickListener {
            Log.d(logTag, "Animación 3 seleccionada")
            Toast.makeText(this, "Mostrando Animación 3...", Toast.LENGTH_SHORT).show()
            startAnimationActivity(3)
        }

        // Configura los eventos onClick para las otras actividades
        btnCaptureName.setOnClickListener {
            Log.d(logTag, "Captura de nombre seleccionada")
            Toast.makeText(this, "Capturando nombre del usuario...", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, CaptureNameActivity::class.java)
            startActivity(intent)
        }

        btnDatePicker.setOnClickListener {
            Log.d(logTag, "Selector de fecha seleccionado")
            Toast.makeText(this, "Seleccionando fecha...", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, DatePickerActivity::class.java)
            startActivity(intent)
        }

        btnTimePicker.setOnClickListener {
            Log.d(logTag, "Selector de hora seleccionado")
            Toast.makeText(this, "Seleccionando hora...", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, TimePickerActivity::class.java)
            startActivity(intent)
        }

        btnShowDialog.setOnClickListener {
            showDialogWithLayoutInflater()
        }
    }

    private fun showDialogWithLayoutInflater() {
        // Crear un Dialog
        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)

        // Usar LayoutInflater para inflar el diseño del diálogo personalizado
        val dialogView = LayoutInflater.from(this).inflate(R.layout.dialog_custom, null)
        dialog.setContentView(dialogView)


        dialog.setCancelable(true)

        // Mostrar el diálogo
        dialog.show()
    }

    private fun startVideoActivity(videoResId: Int) {
        val intent = Intent(this, VideoActivity::class.java).apply {
            putExtra("VIDEO_ID", videoResId)
        }
        startActivity(intent)
    }

    private fun startAnimationActivity(animationNumber: Int) {
        val intent = Intent(this, AnimationActivity::class.java).apply {
            putExtra("ANIMATION_NUMBER", animationNumber)
        }
        startActivity(intent)
    }
}
