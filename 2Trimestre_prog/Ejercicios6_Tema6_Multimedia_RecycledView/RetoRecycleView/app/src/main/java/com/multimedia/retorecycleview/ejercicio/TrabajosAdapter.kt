package com.multimedia.retorecycleview.ejercicio



import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.multimedia.retorecycleview.R

class TrabajosAdapter(private val trabajos: List<Trabajos>, private val onTrabajoClickListener: (Trabajos) -> Unit) :
    RecyclerView.Adapter<TrabajosAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val trabajoTextView: TextView = itemView.findViewById(R.id.courseNameTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_trabajo, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val trabajo = trabajos[position]
        holder.trabajoTextView.text = trabajo.name
        holder.itemView.setOnClickListener { onTrabajoClickListener(trabajo) }
    }

    override fun getItemCount(): Int = trabajos.size
}
