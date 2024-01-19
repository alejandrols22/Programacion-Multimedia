package com.multimedia.clase_16_01_24_ciclovida_ejercicio3.ejercicio.ejercicios



import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.clase_16_01_24_ciclovida_ejercicio3.R




class ActivityA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        Log.d("CicloVidaA", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("CicloVidaA", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("CicloVidaA", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("CicloVidaA", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("CicloVidaA", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("CicloVidaA", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("CicloVidaA", "onDestroy")
    }

    fun irAActividadB(view: View) {
        val intent = Intent(this, ActivityB::class.java)
        startActivity(intent)
    }
}
