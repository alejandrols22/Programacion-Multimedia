package com.multimedia.retorecycleview.ejercicio


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.appcompat.app.AlertDialog
import com.multimedia.retorecycleview.R

class MainActivity : AppCompatActivity() {

    // La lista 'courses' debe ser accesible dentro del ámbito de la clase.
    private val courses = listOf(
        Trabajos(name = "Programación", subjects = listOf(
            Subject(name = "Programador en Android"),
            Subject(name = "Gestor de BBDD"),
            Subject(name = "Programador en Java"))),
        Trabajos(name = "Diseño web", subjects = listOf(
            Subject(name = "Especialista en Wordpress"),
            Subject(name = "Técnico en JavaScript"),
            Subject(name = "Especialista en PHP"))),
        Trabajos(name = "Marketing digital", subjects = listOf(
            Subject(name = "Especialista en SEO"),
            Subject(name = "Técnico en SEM"),
            Subject(name = "Especialista en Redes sociales")))
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerViewTrabajos: RecyclerView = findViewById(R.id.recyclerViewCourses)
        recyclerViewTrabajos.layoutManager = LinearLayoutManager(this)
        recyclerViewTrabajos.adapter = TrabajosAdapter(courses, this::showSubjectsDialog)
    }

    private fun showSubjectsDialog(trabajo: Trabajos) {
        val subjects = trabajo.subjects.map { it.name }.toTypedArray()

        AlertDialog.Builder(this)
            .setTitle("Trabajos de  ${trabajo.name}")
            .setItems(subjects) { _, _ ->

            }
            .setPositiveButton("Aceptar") { dialog, _ ->
                dialog.dismiss()
            }
            .create()
            .show()
    }
}
