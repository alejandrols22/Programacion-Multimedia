package com.multimedia.ejercicio2tema9.ejercicio


import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.VideoView
import com.multimedia.ejercicio2tema9.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoView: VideoView = findViewById(R.id.video_view)
        val mediaController = android.widget.MediaController(this)
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)

        val buttonPlayVideo1: Button = findViewById(R.id.button_play_video1)
        val buttonPlayVideo2: Button = findViewById(R.id.button_play_video2)
        val buttonPlayVideo3: Button = findViewById(R.id.button_play_video3)
        val buttonPlayVideo4: Button = findViewById(R.id.button_play_video4)

        buttonPlayVideo1.setOnClickListener {
            playVideo(R.raw.video1, videoView)
        }

        buttonPlayVideo2.setOnClickListener {
            playVideo(R.raw.video2, videoView)
        }

        buttonPlayVideo3.setOnClickListener {
            playVideo(R.raw.video3, videoView)
        }

        buttonPlayVideo4.setOnClickListener {
            playVideo(R.raw.video4, videoView)
        }
    }

    private fun playVideo(videoResId: Int, videoView: VideoView) {
        val videoPath = "android.resource://$packageName/$videoResId"
        val videoUri = Uri.parse(videoPath)
        videoView.setVideoURI(videoUri)
        videoView.start()
    }
}
