package com.multimedia.ejercicio2tema9.ejercicio

import com.multimedia.ejercicio2tema9.R
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.VideoView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoView: VideoView = findViewById(R.id.video_view)
        val mediaController = android.widget.MediaController(this)
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)

        val buttonPlayVideo1: Button = findViewById(R.id.button_play_video1)


        buttonPlayVideo1.setOnClickListener {
            playVideo(R.raw.video1, videoView)
        }


    }

    private fun playVideo(videoResId: Int, videoView: VideoView) {
        val videoPath = "android.resource://$packageName/$videoResId"
        val videoUri = Uri.parse(videoPath)
        videoView.setVideoURI(videoUri)
        videoView.start()
    }
}
