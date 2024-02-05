package com.multimedia.ejercicio1

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import java.io.BufferedReader
import java.io.File
import java.io.InputStreamReader


class Almacenamiento2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almacenamiento2)

        val btnLeerArchivo: Button = findViewById(R.id.btnLeerArchivo)

        btnLeerArchivo.setOnClickListener {
            leerArchivo()
        }
    }

    private fun leerArchivo() {
        try {
            val fileName = "Alberto el grande"
            val file = File(filesDir, fileName)
            if (file.exists()) {
                // Proceed with reading the file
            } else {
                Log.e("Error", "File does not exist")
            }
            // Abrir un BufferedReader para leer el archivo
            val br = BufferedReader(InputStreamReader(openFileInput(fileName)))

            // Leer la primera línea del archivo
            val texto = br.readLine()

            // Cerrar el BufferedReader
            br.close()

            Log.d("Éxito", "Contenido del archivo: $texto")


        } catch (e: Exception) {
            Log.e("Error", "Error al leer el archivo: " + e.message)
        }
    }
}
