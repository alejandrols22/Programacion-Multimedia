package com.multimedia.ejercicio5permisos.ejercicio


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.ejercicio5permisos.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val callButton = findViewById<Button>(R.id.callButton)
        callButton.setOnClickListener { makePhoneCall() }
    }

    private fun makePhoneCall() {
        val phoneNumber = "tel:" + "123456789"
        val dialIntent = Intent(Intent.ACTION_CALL, Uri.parse(phoneNumber))
        if (dialIntent.resolveActivity(packageManager) != null) {
            startActivity(dialIntent)
        } else {

        }
    }
}

