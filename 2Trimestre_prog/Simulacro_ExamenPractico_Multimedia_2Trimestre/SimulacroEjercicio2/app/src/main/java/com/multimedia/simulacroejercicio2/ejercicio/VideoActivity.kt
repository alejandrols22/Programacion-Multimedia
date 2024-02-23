package com.multimedia.simulacroejercicio2.ejercicio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.multimedia.simulacroejercicio2.R

class VideoActivity : AppCompatActivity() {

    private lateinit var videoView: VideoView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoResId = intent.getIntExtra("videoResId", 0)
        videoView = findViewById(R.id.videoView)
        playVideo(videoResId)
    }

    private fun playVideo(videoResId: Int) {
        val uri = Uri.parse("android.resource://$packageName/$videoResId")
        videoView.setVideoURI(uri)
        videoView.start()
    }
}
