package com.multimedia.ejercicio3


import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.ejercicio1.R
import java.io.BufferedReader
import java.io.InputStreamReader

class Almacenamiento3Activity : AppCompatActivity() {
    private var tvContenidoArchivo: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almacenamiento3)
        tvContenidoArchivo = findViewById<TextView>(R.id.tvContenidoArchivo)
        val btnLeerArchivo = findViewById<Button>(R.id.btnLeerArchivo)
        btnLeerArchivo.setOnClickListener { v: View? -> leerArchivo() }
    }

    private fun leerArchivo() {
        try {
            val fileName = "Alberto el grande"

            // Abrir un BufferedReader para leer el archivo
            val br = BufferedReader(InputStreamReader(openFileInput(fileName)))

            // Leer el contenido completo del archivo
            val textoCompleto = StringBuilder()
            var linea: String?
            while (br.readLine().also { linea = it } != null) {
                textoCompleto.append(linea).append("\n")
            }

            // Cerrar el BufferedReader
            br.close()

            // Mostrar el contenido en el TextView
            tvContenidoArchivo!!.text = textoCompleto.toString()
            Log.d("Éxito", "Contenido del archivo mostrado en TextView")
        } catch (e: Exception) {
            Log.e("Error", "Error al leer el archivo: " + e.message)
            tvContenidoArchivo!!.text = "Error al leer el archivo: " + e.message
        }
    }
}
