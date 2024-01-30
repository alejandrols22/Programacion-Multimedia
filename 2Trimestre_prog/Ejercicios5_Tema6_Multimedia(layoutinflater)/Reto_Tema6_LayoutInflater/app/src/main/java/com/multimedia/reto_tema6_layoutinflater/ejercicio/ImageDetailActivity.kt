package com.multimedia.reto_tema6_layoutinflater.ejercicio



import android.os.Bundle
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.reto_tema6_layoutinflater.R

class ImageDetailActivity : AppCompatActivity() {

    private lateinit var imagenSeleccionada: ImageView
    private lateinit var campoComentario: EditText
    private lateinit var botonAgregarComentario: Button
    private lateinit var contenedorComentarios: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_detail)

        imagenSeleccionada = findViewById(R.id.imagenSeleccionada)
        campoComentario = findViewById(R.id.campoComentario)
        botonAgregarComentario = findViewById(R.id.botonAgregarComentario)
        contenedorComentarios = findViewById(R.id.contenedorComentarios)

        val idImagen = intent.getIntExtra("idImagen", 0)
        if (idImagen != 0) {
            imagenSeleccionada.setImageResource(idImagen)
        }

        botonAgregarComentario.setOnClickListener {
            val comentario = campoComentario.text.toString()
            if (comentario.isNotEmpty()) {
                agregarComentario(comentario)
                campoComentario.text.clear()
            }
        }
    }

    private fun agregarComentario(comentario: String) {
        val vistaComentario = LayoutInflater.from(this).inflate(R.layout.item_comentario, contenedorComentarios, false)
        val textoComentario = vistaComentario.findViewById<EditText>(R.id.textoComentario)
        textoComentario.setText(comentario)
        contenedorComentarios.addView(vistaComentario)
    }
}

