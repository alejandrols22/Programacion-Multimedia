package com.multimedia.clase_16_01_24_ciclovida_ejercicio3.ejercicio.ejercicios




import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.clase_16_01_24_ciclovida_ejercicio3.R

class ActivityC : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
        Log.d("CicloVidaC", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("CicloVidaC", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("CicloVidaC", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("CicloVidaC", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("CicloVidaC", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("CicloVidaC", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("CicloVidaC", "onDestroy")
    }



    fun irAActividadD(view: View) {
        val intent = Intent(this, ActivityD::class.java)
        startActivity(intent)
    }
}
