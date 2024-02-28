package com.multimedia.simulacroejercicio2.ejercicio

import com.multimedia.simulacroejercicio2.R
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.io.FileOutputStream
import java.text.SimpleDateFormat
import java.util.Date


class CaptureNameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_capture_name)

        val editTextUserName = findViewById<EditText>(R.id.editTextUserName)
        val buttonSubmit = findViewById<Button>(R.id.buttonSubmit)

        buttonSubmit.setOnClickListener {
            val userName = editTextUserName.text.toString().trim()
            if (userName.isNotEmpty()) {
                saveNameToFile(userName)
            } else {
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun saveNameToFile(userName: String) {
        val fileName = "userNames.txt"
        try {
            val outputStream: FileOutputStream = openFileOutput(fileName, MODE_APPEND)
            val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
            val currentDateandTime: String = sdf.format(Date())
            outputStream.write("$userName - $currentDateandTime\n".toByteArray())
            outputStream.close()
            Toast.makeText(this, "Name saved successfully", Toast.LENGTH_SHORT).show()
        } catch (e: Exception) {
            e.printStackTrace()
            Toast.makeText(this, "Failed to save name", Toast.LENGTH_SHORT).show()
        }
    }
}
