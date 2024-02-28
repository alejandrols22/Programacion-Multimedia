package com.multimedia.simulacroejercicio2.ejercicio


import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.simulacroejercicio2.R

class VideoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        // Obtener el VideoView
        val videoView = findViewById<VideoView>(R.id.videoView)

        // Obtener el ID del recurso de video desde el Intent
        val videoResId = intent.getIntExtra("VIDEO_ID", -1)

        if (videoResId != -1) {
            // Configurar el URI del video y iniciar la reproducción
            val videoUri = Uri.parse("android.resource://$packageName/$videoResId")
            videoView.setVideoURI(videoUri)
            videoView.start()

            // Opcional: Agregar un MediaController
            val mediaController = android.widget.MediaController(this)
            mediaController.setAnchorView(videoView)
            videoView.setMediaController(mediaController)
        } else {
            // Mostrar un mensaje si no se encuentra el ID del recurso
            Toast.makeText(this, "Error al cargar el video.", Toast.LENGTH_SHORT).show()
        }
    }
}
