package com.multimedia.clase_15_01_24_ciclovida.ejercicio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.multimedia.clase_15_01_24_ciclovida.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d("Ciclo de vida", "SecondActivity - onCreate")
    }


    override fun onStart() {
        super.onStart()

        Log.d("Ciclo de vida", "SecondActivity - onStart")
        Log.d("Ciclo de vida", "secondActivity, onStart de nuevo")

    }

    override fun onResume() {
        super.onResume()
        Log.d("ciclo de vida", "SecondActivity - onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ciclo de vida", "SecondActivity - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ciclo de vida", "SecondActivity - onStop")


    }

    override fun onRestart() {
        super.onRestart()
        Log.d("ciclo de vida", "SecondActivity - onRestart")


    }


    override fun onDestroy() {
        super.onDestroy()
        Log.d("ciclo de vida", "SecondActivity - onDestroy")

    }

    fun goToSecondActivity(view: View) {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }

}