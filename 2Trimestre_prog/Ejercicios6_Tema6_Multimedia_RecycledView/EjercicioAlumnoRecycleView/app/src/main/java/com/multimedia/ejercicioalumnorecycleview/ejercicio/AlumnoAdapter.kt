package com.multimedia.ejercicioalumnorecycleview.ejercicio

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.multimedia.ejercicioalumnorecycleview.R

class AlumnoAdapter(private val alumnoList: List<Alumno>) :
    RecyclerView.Adapter<AlumnoAdapter.AlumnoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlumnoViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_alumno, parent, false)
        return AlumnoViewHolder(view)
    }

    override fun onBindViewHolder(holder: AlumnoViewHolder, position: Int) {
        val alumno = alumnoList[position]
        holder.nameTextView.text = "${alumno.nombre} ${alumno.apellido}\n${alumno.edad}, ${alumno.asignatura}, ${alumno.curso},${alumno.nota}"
    }

    override fun getItemCount(): Int = alumnoList.size

    class AlumnoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameTextView: TextView = view.findViewById(R.id.nameTextView)
    }
}