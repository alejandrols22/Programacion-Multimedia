package com.multimedia.clase_16_01_24_ciclovida_ejercicio3.ejercicio.ejercicios



import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.clase_16_01_24_ciclovida_ejercicio3.R


class ActivityD : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d)
        Log.d("CicloVidaD", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("CicloVidaD", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("CicloVidaD", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("CicloVidaD", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("CicloVidaD", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("CicloVidaD", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("CicloVidaD", "onDestroy")
    }
}
