package com.multimedia.simulacroejercicio2.ejercicio

import android.os.Bundle
import android.widget.TimePicker
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.simulacroejercicio2.R

class TimePickerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_picker)

        val timePicker = findViewById<TimePicker>(R.id.timePicker)
        timePicker.setIs24HourView(true)
        timePicker.setOnTimeChangedListener { view, hourOfDay, minute ->
            Toast.makeText(this, "Seleccionaste: $hourOfDay:$minute", Toast.LENGTH_SHORT).show()
        }
    }
}
