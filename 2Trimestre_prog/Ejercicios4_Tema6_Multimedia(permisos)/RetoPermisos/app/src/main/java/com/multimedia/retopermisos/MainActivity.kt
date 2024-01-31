package com.multimedia.retopermisos

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.os.Environment
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import java.io.File
import java.io.FileOutputStream
import java.io.IOException


class MainActivity : AppCompatActivity() {
    private var fusedLocationClient: FusedLocationProviderClient? = null
    private var locationText: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        locationText = findViewById(R.id.locationText)
        val btnSave = findViewById<Button>(R.id.btnSave)
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)
        checkPermissions()
        btnSave.setOnClickListener { v: View? -> saveToFile() }
    }

    private fun checkPermissions() {
        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED ||
            ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.WRITE_EXTERNAL_STORAGE
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(
                    Manifest.permission.ACCESS_FINE_LOCATION,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE
                ),
                PERMISSIONS_REQUEST
            )
        } else {
            lastLocation
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == PERMISSIONS_REQUEST && grantResults.size > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            lastLocation
        }
    }

    private val lastLocation: Unit
        private get() {
            fusedLocationClient.getLastLocation().addOnSuccessListener(this) { location ->
                if (location != null) {
                    val locText =
                        "Latitud: " + location.getLatitude() + ", Longitud: " + location.getLongitude()
                    locationText!!.text = locText
                }
            }
        }

    private fun saveToFile() {
        val state = Environment.getExternalStorageState()
        if (Environment.MEDIA_MOUNTED == state) {
            val file = File(getExternalFilesDir(null), "locationMessage.txt")
            try {
                FileOutputStream(file, true).use { fos ->
                    val data = locationText!!.text.toString() + "\n"
                    fos.write(data.toByteArray())
                    Toast.makeText(this, "Mensaje guardado", Toast.LENGTH_SHORT).show()
                }
            } catch (e: IOException) {
                e.printStackTrace()
                Toast.makeText(this, "Error al guardar", Toast.LENGTH_SHORT).show()
            }
        }
    }

    companion object {
        private const val PERMISSIONS_REQUEST = 100
    }
}

