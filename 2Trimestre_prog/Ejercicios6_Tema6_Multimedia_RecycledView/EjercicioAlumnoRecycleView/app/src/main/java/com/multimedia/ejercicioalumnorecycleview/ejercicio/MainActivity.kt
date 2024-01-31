package com.multimedia.ejercicioalumnorecycleview.ejercicio


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.multimedia.ejercicioalumnorecycleview.R


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listaAlumnos = generateAlumnoList()

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val adaptadorAlumnos = AlumnoAdapter(listaAlumnos)
        recyclerView.adapter = adaptadorAlumnos
    }

    private fun generateAlumnoList(): List<Alumno> {
        return listOf(
            Alumno("Alberto","Ruiz","19","Empresa e Iniciativa", "2ºDAM", "10"),
            Alumno("Juan","Perez","22","Desarrollo de interfaces", "2ºDAM", "6"),
            Alumno("Eva","Garcia","27","Desarrollo de aplicaciones web", "1ºDAW","7"),
            Alumno("Alberto","Fernández","17","Lenguaje de Marcas","1ºDAM","8"),
            Alumno("Laura","Martínez","23","Desarrollo de aplicaciones multimedia", "1ºDAM","3"),
            Alumno("Cristina","López","25","Base de Datos","1ªDAW","5"),
            Alumno("Isabel","Torres","32","Acceso a Datos", "ª2DAM","7"),
            Alumno("Pedro", "Moreno","27","Programacion multimeda","2ªDAM","10"),
            Alumno("Jose","Android","29","Programacion de Servicios y Productos", "2ªDAW","8"),
            Alumno("Manuel", "Oracle","19","Sistemas Informaticos", "1ªDAM","2"),
            Alumno("Diana","Hibernate","20","Aplicaciones Web","1ªDAW","0")

        )
    }
}
