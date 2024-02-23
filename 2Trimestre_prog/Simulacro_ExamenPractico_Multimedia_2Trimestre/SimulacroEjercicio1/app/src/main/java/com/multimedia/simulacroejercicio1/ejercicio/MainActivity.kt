package com.multimedia.simulacroejercicio1.ejercicio


import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.multimedia.simulacroejercicio1.R


class MainActivity : AppCompatActivity() {
    private var editTextNombre: EditText? = null
    private var editTextApellidos: EditText? = null
    private var editTextDireccion: EditText? = null
    private var editTextCp: EditText? = null
    private var editTextCiudad: EditText? = null
    private var editTextProvincia: EditText? = null
    private var editTextTelefono: EditText? = null
    private var textViewDatos: TextView? = null
    private var databaseHelper: DatabaseHelper? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializando vistas
        editTextNombre = findViewById(R.id.editTextNombre)
        editTextApellidos = findViewById(R.id.editTextApellidos)
        editTextDireccion = findViewById(R.id.editTextDireccion)
        editTextCp = findViewById(R.id.editTextCp)
        editTextCiudad = findViewById(R.id.editTextCiudad)
        editTextProvincia = findViewById(R.id.editTextProvincia)
        editTextTelefono = findViewById(R.id.editTextTelefono)
        textViewDatos = findViewById<TextView>(R.id.textViewDatos) // Corrección aquí

        databaseHelper = DatabaseHelper(this)

        // Referencias a los elementos de la interfaz de usuario
        editTextNombre = findViewById<EditText>(R.id.editTextNombre)
        editTextApellidos = findViewById<EditText>(R.id.editTextApellidos)
        editTextDireccion = findViewById<EditText>(R.id.editTextDireccion)
        editTextCp = findViewById<EditText>(R.id.editTextCp)
        editTextCiudad = findViewById<EditText>(R.id.editTextCiudad)
        editTextProvincia = findViewById<EditText>(R.id.editTextProvincia)
        editTextTelefono = findViewById<EditText>(R.id.editTextTelefono)

        // Manejador del botón Agregar
        findViewById<View>(R.id.buttonAgregar).setOnClickListener { agregarDatos() }

        // Manejador del botón Mostrar Todos
        findViewById<View>(R.id.buttonMostrarTodos).setOnClickListener { // Aquí se implementará la lógica para mostrar los datos
            mostrarTodosLosDatos()
        }

        // Manejador del botón Borrar Todos
        findViewById<View>(R.id.buttonBorrarTodos).setOnClickListener { confirmarYBorrarTodosLosDatos() }
    }

    private fun agregarDatos() {
        val insertado = databaseHelper!!.addData(
            editTextNombre!!.text.toString(),
            editTextApellidos!!.text.toString(),
            editTextDireccion!!.text.toString(),
            editTextCp!!.text.toString(),
            editTextCiudad!!.text.toString(),
            editTextProvincia!!.text.toString(),
            editTextTelefono!!.text.toString()
        )
        if (insertado) {
            Toast.makeText(this@MainActivity, "Datos agregados", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this@MainActivity, "Error al agregar datos", Toast.LENGTH_SHORT).show()
        }
    }

    private fun mostrarTodosLosDatos() {
        val cursor = databaseHelper?.getAllData()
        val stringBuilder = StringBuilder()

        if (cursor != null && cursor.moveToFirst()) {
            do {
                val id = cursor.getInt(cursor.getColumnIndexOrThrow(DatabaseHelper.COLUMN_ID))
                val nombre = cursor.getString(cursor.getColumnIndexOrThrow(DatabaseHelper.COLUMN_NOMBRE))
                val apellidos = cursor.getString(cursor.getColumnIndexOrThrow(DatabaseHelper.COLUMN_APELLIDOS))
                val direccion = cursor.getString(cursor.getColumnIndexOrThrow(DatabaseHelper.COLUMN_DIRECCION))
                val cp = cursor.getString(cursor.getColumnIndexOrThrow(DatabaseHelper.COLUMN_CP))
                val ciudad = cursor.getString(cursor.getColumnIndexOrThrow(DatabaseHelper.COLUMN_CIUDAD))
                val provincia = cursor.getString(cursor.getColumnIndexOrThrow(DatabaseHelper.COLUMN_PROVINCIA))
                val telefono = cursor.getString(cursor.getColumnIndexOrThrow(DatabaseHelper.COLUMN_TELEFONO))

                stringBuilder.append("ID: $id")
                stringBuilder.append(", Nombre: $nombre")
                stringBuilder.append(", Apellidos: $apellidos")
                stringBuilder.append(", Dirección: $direccion")
                stringBuilder.append(", CP: $cp")
                stringBuilder.append(", Ciudad: $ciudad")
                stringBuilder.append(", Provincia: $provincia")
                stringBuilder.append(", Teléfono: $telefono")
                stringBuilder.append("\n\n")
            } while (cursor.moveToNext())

            cursor.close()
        }

        textViewDatos?.text = stringBuilder.toString()
        textViewDatos?.visibility = View.VISIBLE
    }


    private fun confirmarYBorrarTodosLosDatos() {
        AlertDialog.Builder(this)
            .setTitle("Confirmación")
            .setMessage("¿Estás seguro de que deseas borrar todos los datos?")
            .setPositiveButton("Sí") { dialog, which ->
                databaseHelper!!.deleteAllData()
                Toast.makeText(
                    this@MainActivity,
                    "Todos los datos fueron borrados",
                    Toast.LENGTH_SHORT
                )
                    .show()
            }
            .setNegativeButton("No", null)
            .show()
    }
}

