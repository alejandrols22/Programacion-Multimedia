package com.multimedia.clase_15_01_24_ciclovida_ejercicio2.ejercicio

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.clase_15_01_24_ciclovida_ejercicio2.R

class ActivityA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity)
        Log.d("ActivityALifecycle", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("ActivityALifecycle", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ActivityALifecycle", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ActivityALifecycle", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ActivityALifecycle", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("ActivityALifecycle", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ActivityALifecycle", "onDestroy")
    }

    fun openActivityB(view: View) {
        val intent = Intent(this, ActivityB::class.java)
        startActivity(intent)
    }
}
