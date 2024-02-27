package com.multimedia.ejercicio4fragmentos.ejercicio

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.ejercicio4fragmentos.R

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Mostrar el diálogo cuando se inicia la actividad
        val dialogFragment = MyTimePickerDialogFragment()
        dialogFragment.show(supportFragmentManager, "MyTimePickerDialogFragment")
    }
}
