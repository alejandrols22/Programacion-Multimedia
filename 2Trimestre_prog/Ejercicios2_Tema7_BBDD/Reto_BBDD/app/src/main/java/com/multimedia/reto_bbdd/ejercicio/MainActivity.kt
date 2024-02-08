package com.multimedia.reto_bbdd.ejercicio

import com.multimedia.reto_bbdd.R
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var etId: EditText
    private lateinit var etNombre: EditText
    private lateinit var etApellidos: EditText
    private lateinit var etDNI: EditText
    private lateinit var etEdad: EditText
    private lateinit var etCurso: EditText
    private lateinit var btnAgregar: Button
    private lateinit var btnMostrarTodos: Button
    private lateinit var btnActualizar: Button
    private lateinit var btnEliminar: Button
    private lateinit var tvResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etId = findViewById(R.id.etId)
        etNombre = findViewById(R.id.etNombre)
        etApellidos = findViewById(R.id.etApellidos)
        etDNI = findViewById(R.id.etDNI)
        etEdad = findViewById(R.id.etEdad)
        etCurso = findViewById(R.id.etCurso)
        btnAgregar = findViewById(R.id.btnAgregar)
        btnMostrarTodos = findViewById(R.id.btnMostrarTodos)
        btnActualizar = findViewById(R.id.btnActualizar)
        btnEliminar = findViewById(R.id.btnEliminar)
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
                limpiarCampos()
            }
        }

        btnMostrarTodos.setOnClickListener {
            tvResultado.text = dataManager.obtenerTodosLosAlumnos()
        }

        btnActualizar.setOnClickListener {
            val id = etId.text.toString().toIntOrNull()
            val nombre = etNombre.text.toString()
            val apellidos = etApellidos.text.toString()
            val dni = etDNI.text.toString()
            val edad = etEdad.text.toString().toIntOrNull() ?: 0
            val curso = etCurso.text.toString()

            if (id != null && nombre.isNotEmpty() && apellidos.isNotEmpty() && dni.isNotEmpty() && edad > 0 && curso.isNotEmpty()) {
                dataManager.actualizarAlumno(id, nombre, apellidos, dni, edad, curso)
                limpiarCampos()
            }
        }

        btnEliminar.setOnClickListener {
            val id = etId.text.toString().toIntOrNull()

            if (id != null) {
                dataManager.eliminarAlumno(id)
                limpiarCampos()
            }
        }
    }

    private fun limpiarCampos() {
        etId.text.clear()
        etNombre.text.clear()
        etApellidos.text.clear()
        etDNI.text.clear()
        etEdad.text.clear()
        etCurso.text.clear()
        tvResultado.text = ""
    }
}
