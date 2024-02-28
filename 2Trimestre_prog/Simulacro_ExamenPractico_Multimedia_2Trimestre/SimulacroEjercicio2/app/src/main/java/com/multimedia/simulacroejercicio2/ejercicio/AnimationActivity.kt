package com.multimedia.simulacroejercicio2.ejercicio


import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.animation.AccelerateDecelerateInterpolator
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.simulacroejercicio2.R

class AnimationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)

        val imageView = findViewById<ImageView>(R.id.imageViewToAnimate)
        val animationNumber = intent.getIntExtra("ANIMATION_NUMBER", -1)

        when (animationNumber) {
            1 -> animateFadeIn(imageView)
            2 -> animateRotate(imageView)
            3 -> animateScale(imageView)
            else -> finish() // Cierra la actividad si no hay una animación válida
        }
    }

    private fun animateFadeIn(view: ImageView) {
        view.alpha = 0f
        view.animate().alpha(1f).setDuration(3000).setInterpolator(AccelerateDecelerateInterpolator()).start()
    }

    private fun animateRotate(view: ImageView) {
        ObjectAnimator.ofFloat(view, "rotation", 0f, 360f).apply {
            duration = 3000
            interpolator = AccelerateDecelerateInterpolator()
            start()
        }
    }

    private fun animateScale(view: ImageView) {
        ObjectAnimator.ofFloat(view, "scaleX", 1f, 2f).apply {
            duration = 3000
            repeatCount = 1
            repeatMode = ObjectAnimator.REVERSE
        }.start()
        ObjectAnimator.ofFloat(view, "scaleY", 1f, 2f).apply {
            duration = 3000
            repeatCount = 1
            repeatMode = ObjectAnimator.REVERSE
        }.start()
    }
}
