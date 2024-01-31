package com.multimedia.ejercicio3permisos.ejercicio


import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import com.multimedia.ejercicio3permisos.R


class MainActivity : Activity() {
    private var imageView: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pickImageButton = findViewById<Button>(R.id.pickImageButton)
        imageView = findViewById<ImageView>(R.id.imageView)
        pickImageButton.setOnClickListener { openGallery() }
    }

    private fun openGallery() {
        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        startActivityForResult(intent, PICK_IMAGE_REQUEST)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null) {
            val selectedImageUri = data.data
            displaySelectedImage(selectedImageUri)
        }
    }

    private fun displaySelectedImage(imageUri: Uri?) {
        try {
            val bitmap = MediaStore.Images.Media.getBitmap(this.contentResolver, imageUri)
            imageView!!.setImageBitmap(bitmap)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    companion object {
        private const val PICK_IMAGE_REQUEST = 1
    }
}

