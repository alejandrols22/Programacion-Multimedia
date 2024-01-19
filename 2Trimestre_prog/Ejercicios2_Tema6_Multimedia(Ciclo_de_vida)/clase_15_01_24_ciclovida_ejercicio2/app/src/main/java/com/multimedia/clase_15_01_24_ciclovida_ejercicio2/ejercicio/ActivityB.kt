package com.multimedia.clase_15_01_24_ciclovida_ejercicio2.ejercicio

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.clase_15_01_24_ciclovida_ejercicio2.R

class ActivityB : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        Log.d("ActivityBLifecycle", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("ActivityBLifecycle", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ActivityBLifecycle", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ActivityBLifecycle", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ActivityBLifecycle", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("ActivityBLifecycle", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ActivityBLifecycle", "onDestroy")
    }

    fun closeActivityB(view: View) {
        finish()
    }
}
