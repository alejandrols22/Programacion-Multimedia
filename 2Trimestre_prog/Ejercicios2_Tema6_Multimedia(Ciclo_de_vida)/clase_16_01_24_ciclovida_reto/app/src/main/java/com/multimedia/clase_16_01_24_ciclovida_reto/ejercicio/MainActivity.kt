package com.multimedia.clase_16_01_24_ciclovida_reto.ejercicio

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.clase_16_01_24_ciclovida_reto.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("CicloVida", "MainActivity - onCreate")
    }

    fun iniciarTrivia(view: View) {
        val intent = Intent(this, Question1Activity::class.java)
        startActivity(intent)

    }
}
