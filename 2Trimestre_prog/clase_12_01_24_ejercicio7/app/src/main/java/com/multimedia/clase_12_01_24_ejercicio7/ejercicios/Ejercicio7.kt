package com.multimedia.clase_12_01_24_ejercicio7.ejercicios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.multimedia.clase_12_01_24_ejercicio7.R

class Ejercicio7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio7)
        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)
        val etNombre = findViewById<AppCompatEditText>(R.id.etNombre)
        val etApellido = findViewById<AppCompatEditText>(R.id.etApellido)
        val etCurso = findViewById<AppCompatEditText>(R.id.etCurso)
        val etAsignatura = findViewById<AppCompatEditText>(R.id.etAsignatura)
        val etNota = findViewById<AppCompatEditText>(R.id.etNota)

        val nombre = etNombre.text.toString()
        val apellido = etApellido.text.toString()
        val curso = etCurso.text.toString()
        val asignatura = etAsignatura.text.toString()
        val nota = etNota.text.toString()

        btnStart.setOnClickListener {

            val intent = Intent(this, ResultadoEjercicio7::class.java)
            intent.putExtra("EXTRA_NOMBRE", nombre)
            intent.putExtra("EXTRA_APELLIDO", apellido)
            intent.putExtra("EXTRA_CURSO", curso)
            intent.putExtra("EXTRA_ASIGNATURA", asignatura)
            intent.putExtra("EXTRA_NOTA", nota)
            startActivity(intent)

        }

            if (nombre.isNotEmpty()) {
                val intent = Intent(this, ResultadoEjercicio7::class.java)
                intent.putExtra("EXTRA_NAME", nombre)
                startActivity(intent)
            }

            if (apellido.isNotEmpty()) {
                val intent = Intent(this, ResultadoEjercicio7::class.java)
                intent.putExtra("EXTRA_NAME", apellido)
                startActivity(intent)
            }

            if (curso.isNotEmpty()) {
                val intent = Intent(this, ResultadoEjercicio7::class.java)
                intent.putExtra("EXTRA_NAME", curso)
                startActivity(intent)
            }

            if (asignatura.isNotEmpty()) {
                val intent = Intent(this, ResultadoEjercicio7::class.java)
                intent.putExtra("EXTRA_NAME", asignatura)
                startActivity(intent)
            }

            if (nota.isNotEmpty()) {
                val intent = Intent(this, ResultadoEjercicio7::class.java)
                intent.putExtra("EXTRA_NAME", nota)
                startActivity(intent)
            }


        }







    }

