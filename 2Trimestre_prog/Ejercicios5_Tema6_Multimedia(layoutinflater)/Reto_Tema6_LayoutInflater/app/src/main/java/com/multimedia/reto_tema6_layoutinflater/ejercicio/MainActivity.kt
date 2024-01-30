package com.multimedia.reto_tema6_layoutinflater.ejercicio


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.reto_tema6_layoutinflater.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val botonVerGaleria = findViewById<Button>(R.id.btnVerGaleria)
        botonVerGaleria.setOnClickListener {
            val intent = Intent(
                this@MainActivity,
                GalleryActivity::class.java
            )
            startActivity(intent)
        }
    }
}

