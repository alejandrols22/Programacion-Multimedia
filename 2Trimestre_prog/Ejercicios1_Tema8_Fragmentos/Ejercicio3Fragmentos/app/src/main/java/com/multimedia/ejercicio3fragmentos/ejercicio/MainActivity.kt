package com.multimedia.ejercicio3fragmentos.ejercicio



import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.ejercicio3fragmentos.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Mostrar el diálogo cuando se inicia la actividad
        val dialogFragment = MyAlertDialogFragment()
        dialogFragment.show(supportFragmentManager, "MyAlertDialogFragment")
    }
}
