package com.multimedia.reto_tema6_layoutinflater.ejercicio


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.reto_tema6_layoutinflater.R

class GalleryActivity : AppCompatActivity() {

    private lateinit var contenedorImagenes: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        contenedorImagenes = findViewById(R.id.contenedorImagenes)

        for (i in 1..3) {
            val vistaImagen = LayoutInflater.from(this).inflate(R.layout.item_imagen, contenedorImagenes, false)
            val imagen = vistaImagen.findViewById<ImageView>(R.id.imagen)
            val idRecurso = resources.getIdentifier("imagen$i", "drawable", packageName)
            imagen.setImageResource(idRecurso)

            imagen.setOnClickListener {
                iniciarActivityDetalleImagen(idRecurso)
            }

            contenedorImagenes.addView(vistaImagen)
        }
    }

    private fun iniciarActivityDetalleImagen(idImagen: Int) {
        val intent = Intent(this, ImageDetailActivity::class.java)
        intent.putExtra("idImagen", idImagen)
        startActivity(intent)
    }
}
