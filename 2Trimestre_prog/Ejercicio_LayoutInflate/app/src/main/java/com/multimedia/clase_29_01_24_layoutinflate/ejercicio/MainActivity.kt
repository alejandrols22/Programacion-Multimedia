package com.multimedia.clase_29_01_24_layoutinflate.ejercicio

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.clase_29_01_24_layoutinflate.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflar el diseño XML
        val rootView: View = LayoutInflater.from(this).inflate(R.layout.activity_main, null)

        // Obtener referencia al TextView inflado
        val textView: TextView = rootView.findViewById(R.id.textView)

        // Configurar cualquier acción adicional si es necesario
        // ...

        // Establecer la vista inflada en la actividad
        setContentView(rootView)
    }
}
