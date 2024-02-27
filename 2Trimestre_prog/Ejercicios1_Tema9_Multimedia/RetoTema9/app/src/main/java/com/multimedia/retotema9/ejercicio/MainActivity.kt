package com.multimedia.retotema9.ejercicio

import com.multimedia.retotema9.R
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageViewDesplazamiento = findViewById<ImageView>(R.id.imageViewDesplazamiento)
        val imageViewRotacion = findViewById<ImageView>(R.id.imageViewRotacion)
        val imageViewEscala = findViewById<ImageView>(R.id.imageViewEscala)
        val imageViewTransparencia = findViewById<ImageView>(R.id.imageViewTransparencia)

        imageViewDesplazamiento.startAnimation(AnimationUtils.loadAnimation(this, R.anim.desplazamiento))
        imageViewRotacion.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotacion))
        imageViewEscala.startAnimation(AnimationUtils.loadAnimation(this, R.anim.escala))
        imageViewTransparencia.startAnimation(AnimationUtils.loadAnimation(this, R.anim.transparencia))
    }
}
