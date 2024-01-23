package com.multimedia.clase_19_01_24.ejercicios

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.clase_19_01_24.R

class Ejercicio1UsuarioLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio1_usuario_login)

        val botonAlta = findViewById<Button>(R.id.botonAlta)
        val botonCancelar = findViewById<Button>(R.id.botonCancelar)
        val botonSalir = findViewById<Button>(R.id.botonSalir)

        val editTextNombre = findViewById<EditText>(R.id.nombre)
        val editTextApellidos = findViewById<EditText>(R.id.apellidos)
        val editTextEmailAddress = findViewById<EditText>(R.id.email)
        val editTextPassword = findViewById<EditText>(R.id.contrasena)
        val editTextConfirmarContrasena = findViewById<EditText>(R.id.confirmarContrasena)

        botonAlta.setOnClickListener {
            val password = editTextPassword.text.toString()
            val confirmPassword = editTextConfirmarContrasena.text.toString()

            // Verifica si las contraseñas coinciden
            if (password == confirmPassword && password.isNotEmpty()) {
                // Recolecta la información de los EditText y crea un mensaje
                val resultado = "Nombre: ${editTextNombre.text}\n" +
                        "Apellidos: ${editTextApellidos.text}\n" +
                        "Email: ${editTextEmailAddress.text}\n" +
                        "Contraseña: $password\n"

                // Inicia ResultadoActivity pasándole el mensaje
                val intent = Intent(this, ResultadoActivity::class.java).apply {
                    putExtra("datos", resultado)
                }
                startActivity(intent)
            } else {
                // Si las contraseñas no coinciden, muestra un mensaje de error y limpia los campos de contraseña
                editTextPassword.text.clear()
                editTextConfirmarContrasena.text.clear()

                // Muestra un mensaje de error al usuario
                editTextPassword.error = "Las contraseñas no son iguales, inténtalo de nuevo."
                editTextConfirmarContrasena.error = "Las contraseñas no son iguales, inténtalo de nuevo."
            }
        }

        botonCancelar.setOnClickListener {
            // Limpia todos los EditText
            editTextNombre.text.clear()
            editTextApellidos.text.clear()
            editTextEmailAddress.text.clear()
            editTextPassword.text.clear()
            editTextConfirmarContrasena.text.clear()
        }

        botonSalir.setOnClickListener {
            // Vuelve al menú principal
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
    }
}

