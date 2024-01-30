package com.multimedia.ejercicio3recycleview.ejercicio


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.multimedia.ejercicio3recycleview.R



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val personList = generatePersonList()

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val personAdapter = PersonAdapter(personList)
        recyclerView.adapter = personAdapter
    }

    private fun generatePersonList(): List<Person> {
        return listOf(
            Person("Alberto","Ruiz","Calle Playa Odisea Nº2 4ºC","Málaga"),
            Person("Juan","Perez","Avenida de los Castaños Nº15 1ºA","Valencia"),
            Person("Eva","Garcia","Calle del Olivar Nº23 3ºB","Sevilla"),
            Person("Alberto","Fernández","Plaza del Sol Nº4 2ºD","Barcelona"),
            Person("Laura","Martínez","Ronda de la Estación Nº8 5ºE","Madrid"),
            Person("Cristina","López","Paseo de la Alameda Nº12 6ºF","Bilbao"),
            Person("Isabel","Torres","Camino de la Luna Nº9 7ºG","Zaragoza"),
            Person("Pedro", "Moreno","Via Láctea Nº7 8ºH","Granada"),
            Person("Jose","Android","Calle Nueva Tecnología Nº5 9ºI","Alicante"),
            Person("Manuel", "Oracle","Avenida de la Innovación Nº14 10ºJ","Córdoba"),
            Person("Diana","Hibernate","Calle del Progreso Nº21 11ºK","Salamanca")



        )
    }
}
