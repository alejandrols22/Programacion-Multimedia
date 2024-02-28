package com.multimedia.simulacroejercicio2.ejercicio

import android.os.Bundle
import android.widget.DatePicker
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.simulacroejercicio2.R
import java.util.Calendar

class DatePickerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_picker)

        val datePicker = findViewById<DatePicker>(R.id.datePicker)
        val today = Calendar.getInstance()
        datePicker.init(today.get(Calendar.YEAR), today.get(Calendar.MONTH), today.get(Calendar.DAY_OF_MONTH)) { view, year, month, day ->
            val month = month + 1
            Toast.makeText(this, "Seleccionaste: $day/$month/$year", Toast.LENGTH_SHORT).show()
        }
    }
}
