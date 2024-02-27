package com.multimedia.ejercicio4tema9.ejercicio



import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.ejercicio4tema9.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Encuentra el ImageView en el layout
        val imageView = findViewById<ImageView>(R.id.imageView)

        // Cargar la animación desde un archivo XML
        val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.slide_in)

        // Aplicar la animación al ImageView
        imageView.startAnimation(animation)
    }
}
