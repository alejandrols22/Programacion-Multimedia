package com.multimedia.ejercicio1_bbdd.ejercicio


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.ejercicio1_bbdd.R

class MainActivity : AppCompatActivity() {

    private lateinit var etNombre: EditText
    private lateinit var etApellidos: EditText
    private lateinit var etDNI: EditText
    private lateinit var etEdad: EditText
    private lateinit var etCurso: EditText
    private lateinit var btnAgregar: Button
    private lateinit var btnMostrarTodos: Button
    private lateinit var tvResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNombre = findViewById(R.id.etNombre)
        etApellidos = findViewById(R.id.etApellidos)
        etDNI = findViewById(R.id.etDNI)
        etEdad = findViewById(R.id.etEdad)
        etCurso = findViewById(R.id.etCurso)
        btnAgregar = findViewById(R.id.btnAgregar)
        btnMostrarTodos = findViewById(R.id.btnMostrarTodos)
        tvResultado = findViewById(R.id.tvResultado)

        val dataManager = DataManager(this)

        btnAgregar.setOnClickListener {
            val nombre = etNombre.text.toString()
            val apellidos = etApellidos.text.toString()
            val dni = etDNI.text.toString()
            val edad = etEdad.text.toString().toIntOrNull() ?: 0
            val curso = etCurso.text.toString()

            if (nombre.isNotEmpty() && apellidos.isNotEmpty() && dni.isNotEmpty() && edad > 0 && curso.isNotEmpty()) {
                dataManager.agregarAlumno(nombre, apellidos, dni, edad, curso)
                etNombre.text.clear()
                etApellidos.text.clear()
                etDNI.text.clear()
                etEdad.text.clear()
                etCurso.text.clear()
            }
        }

        btnMostrarTodos.setOnClickListener {
            val alumnos = dataManager.obtenerTodosLosAlumnos()
            tvResultado.text = alumnos
        }
    }
}
