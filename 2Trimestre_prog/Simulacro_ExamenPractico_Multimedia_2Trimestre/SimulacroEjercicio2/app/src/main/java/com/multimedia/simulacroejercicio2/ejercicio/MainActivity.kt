package com.multimedia.simulacroejercicio2.ejercicio

import com.multimedia.simulacroejercicio2.R



import android.app.DatePickerDialog
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.widget.VideoView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import java.io.OutputStreamWriter
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

class MainActivity : AppCompatActivity() {

    private lateinit var videoView1: VideoView
    private lateinit var videoView2: VideoView
    private lateinit var videoView3: VideoView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun openVideoActivity(view: View) {
            val intent = Intent(this, VideoActivity::class.java)
            when (view.id) {
                R.id.btnVideo1 -> intent.putExtra("videoResId", R.raw.video1)
                R.id.btnVideo2 -> intent.putExtra("videoResId", R.raw.video2)
                R.id.btnVideo3 -> intent.putExtra("videoResId", R.raw.video3)
            }
            startActivity(intent)
        }
    }

        // Inicialización de VideoViews
        videoView1 = findViewById(R.id.videoView1)
        videoView2 = findViewById(R.id.videoView2)
        videoView3 = findViewById(R.id.videoView3)

        // Reproducir vídeos
        playVideo(videoView1, R.raw.video1)
        playVideo(videoView2, R.raw.video2)
        playVideo(videoView3, R.raw.video3)

        // Botón para mostrar Toast personalizado
        val btnShowToast: Button = findViewById(R.id.btnShowToast)
        btnShowToast.setOnClickListener {
            mostrarToastPersonalizado("Usuario")
        }

        // Botón para DatePicker
        val btnSelectDate: Button = findViewById(R.id.btnSelectDate)
        btnSelectDate.setOnClickListener {
            mostrarDatePickerDialog()
        }

        // Solicitar nombre de usuario al inicio
        solicitarNombreUsuario()
    }

    private fun playVideo(videoView: VideoView, videoResId: Int) {
        val uri = Uri.parse("android.resource://$packageName/$videoResId")
        videoView.setVideoURI(uri)
        videoView.start()
    }

    private fun mostrarToastPersonalizado(nombreUsuario: String) {
        val inflater: LayoutInflater = layoutInflater
        val layout = inflater.inflate(R.layout.toast_layout, null)

        val textView: TextView = layout.findViewById(R.id.textViewToast)
        val fechaActual = SimpleDateFormat("dd-MM-yyyy HH:mm:ss", Locale.getDefault()).format(Date())
        textView.text = "$nombreUsuario - $fechaActual"

        with (Toast(this)) {
            duration = Toast.LENGTH_LONG
            view = layout
            show()
        }
    }

    private fun solicitarNombreUsuario() {
        val input = EditText(this)
        AlertDialog.Builder(this)
            .setTitle("Introduce tu nombre de usuario")
            .setView(input)
            .setPositiveButton("OK") { _, _ ->
                val nombreUsuario = input.text.toString()
                val fechaActual = SimpleDateFormat("dd-MM-yyyy HH:mm:ss", Locale.getDefault()).format(Date())
                mostrarDatosUsuario(nombreUsuario, fechaActual)
                guardarDatosUsuario(nombreUsuario, fechaActual)
            }
            .setNegativeButton("Cancelar", null)
            .show()
    }

    private fun mostrarDatosUsuario(nombreUsuario: String, fecha: String) {
        val tvNombreUsuario: TextView = findViewById(R.id.tvNombreUsuario)
        val tvFechaEntrada: TextView = findViewById(R.id.tvFechaEntrada)
        tvNombreUsuario.text = nombreUsuario
        tvFechaEntrada.text = fecha
    }

    private fun guardarDatosUsuario(nombreUsuario: String, fecha: String) {
        try {
            val out = OutputStreamWriter(openFileOutput("datos_usuario.txt", Context.MODE_PRIVATE))
            out.write("Nombre de Usuario: $nombreUsuario, Fecha de Entrada: $fecha")
            out.close()
            Log.d("MainActivity", "Datos del usuario guardados: $nombreUsuario, $fecha")
            mostrarToastConfirmacion()
        } catch (e: Exception) {
            Log.e("MainActivity", "Error al guardar los datos del usuario", e)
        }
    }

    private fun mostrarToastConfirmacion() {
        Toast.makeText(this, "Datos guardados correctamente", Toast.LENGTH_SHORT).show()
    }

    private fun mostrarDatePickerDialog() {
        val calendario = Calendar.getInstance()
        val datePickerDialogListener = DatePickerDialog.OnDateSetListener { _, year, month, dayOfMonth ->
            val fechaSeleccionada = String.format(Locale.getDefault(), "%02d-%02d-%04d", dayOfMonth, month + 1, year)
            Toast.makeText(this, "Fecha seleccionada: $fechaSeleccionada", Toast.LENGTH_LONG).show()
        }

        DatePickerDialog(this, datePickerDialogListener, calendario.get(Calendar.YEAR), calendario.get(Calendar.MONTH), calendario.get(Calendar.DAY_OF_MONTH)).show()
    }
}

