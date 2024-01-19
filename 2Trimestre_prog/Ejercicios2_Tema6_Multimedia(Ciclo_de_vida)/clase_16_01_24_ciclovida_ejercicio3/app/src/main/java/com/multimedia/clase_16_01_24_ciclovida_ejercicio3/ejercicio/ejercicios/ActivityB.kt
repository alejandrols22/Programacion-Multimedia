package com.multimedia.clase_16_01_24_ciclovida_ejercicio3.ejercicio.ejercicios




import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.clase_16_01_24_ciclovida_ejercicio3.R


class ActivityB : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        Log.d("CicloVidaB", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("CicloVidaB", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("CicloVidaB", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("CicloVidaB", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("CicloVidaB", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("CicloVidaB", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("CicloVidaB", "onDestroy")
    }



    fun irAActividadC(view: View) {
        val intent = Intent(this, ActivityC::class.java)
        startActivity(intent)
    }
}
