package com.multimedia.reto_ficheros



import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.multimedia.reto_ficheros.R
import java.io.*

class RetoActivity : AppCompatActivity() {
    private lateinit var etTexto: EditText
    private lateinit var tvContenido: TextView
    private lateinit var rgAlmacenamiento: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reto)

        etTexto = findViewById(R.id.etTexto)
        tvContenido = findViewById(R.id.tvContenido)
        rgAlmacenamiento = findViewById(R.id.rgAlmacenamiento)
        val btnGuardar: Button = findViewById(R.id.btnGuardar)
        val btnLeer: Button = findViewById(R.id.btnLeer)

        btnGuardar.setOnClickListener {
            val seleccion = findViewById<RadioButton>(rgAlmacenamiento.checkedRadioButtonId)
            when (seleccion.id) {
                R.id.rbInterna -> guardarArchivo(etTexto.text.toString(), true)
                R.id.rbExterna -> guardarArchivo(etTexto.text.toString(), false)
            }
        }

        btnLeer.setOnClickListener {
            val seleccion = findViewById<RadioButton>(rgAlmacenamiento.checkedRadioButtonId)
            when (seleccion.id) {
                R.id.rbInterna -> leerArchivo(true)
                R.id.rbExterna -> leerArchivo(false)
            }
        }
    }

    private fun guardarArchivo(texto: String, esInterna: Boolean) {
        try {
            val fileName = "textoUsuario.txt"
            val outputStreamWriter: OutputStreamWriter = if (esInterna) {
                OutputStreamWriter(openFileOutput(fileName, Context.MODE_PRIVATE))
            } else {
                val file = File(getExternalFilesDir(null), fileName)
                OutputStreamWriter(FileOutputStream(file))
            }
            outputStreamWriter.use { it.write(texto) }
            Toast.makeText(this, "Archivo guardado correctamente", Toast.LENGTH_SHORT).show()
        } catch (e: IOException) {
            e.printStackTrace()
            Toast.makeText(this, "Error al guardar el archivo", Toast.LENGTH_SHORT).show()
        }
    }

    private fun leerArchivo(esInterna: Boolean) {
        val fileName = "textoUsuario.txt"
        try {
            val inputStream: InputStream = if (esInterna) {
                openFileInput(fileName)
            } else {
                val file = File(getExternalFilesDir(null), fileName)
                FileInputStream(file)
            }
            inputStream.bufferedReader().useLines { lines ->
                val contenido = lines.fold("") { some, text -> "$some\n$text" }
                tvContenido.text = contenido
            }
        } catch (e: IOException) {
            e.printStackTrace()
            Toast.makeText(this, "Error al leer el archivo", Toast.LENGTH_SHORT).show()
        }
    }
}
