package com.multimedia.ejercicioalumnorecycleview.ejercicio


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.multimedia.ejercicioalumnorecycleview.R


class AlumnoAdapter(private val listaAlumnos: List<Alumno>) :
    RecyclerView.Adapter<AlumnoAdapter.AlumnoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlumnoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_alumno, parent, false)
        return AlumnoViewHolder(view)
    }

    override fun onBindViewHolder(holder: AlumnoViewHolder, position: Int) {
        val alumno = listaAlumnos[position]
        holder.nombreTextView.text = "${alumno.nombre} ${alumno.apellido},${alumno.edad}\n${alumno.asignatura}\n${alumno.curso}\n${alumno.nota}"
    }

    override fun getItemCount(): Int = listaAlumnos.size

    class AlumnoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nombreTextView: TextView = view.findViewById(R.id.nameTextView)
    }
}
