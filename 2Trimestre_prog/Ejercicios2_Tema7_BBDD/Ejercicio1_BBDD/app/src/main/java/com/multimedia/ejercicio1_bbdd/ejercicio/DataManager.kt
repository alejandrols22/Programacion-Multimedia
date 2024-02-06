package com.multimedia.ejercicio1_bbdd.ejercicio


import android.content.ContentValues
import android.content.Context

class DataManager(private val context: Context) {
    private val dbHelper = DatabaseHelper(context)

    fun agregarNombre(nombre: String) {
        val db = dbHelper.writableDatabase
        val valores = ContentValues().apply {
            put(DatabaseHelper.COLUMNA_NOMBRE, nombre)
        }
        db.insert(DatabaseHelper.NOMBRE_TABLA, null, valores)
        db.close()
    }

    fun obtenerTodosLosNombres(): String {
        val db = dbHelper.readableDatabase
        val cursor = db.rawQuery("SELECT * FROM ${DatabaseHelper.NOMBRE_TABLA}", null)
        val nombres = StringBuilder()

        while (cursor.moveToNext()) {
            val columnIndex = cursor.getColumnIndex(DatabaseHelper.COLUMNA_NOMBRE)
            if (columnIndex >= 0) { // Asegurarse de que el índice de la columna es válido
                val nombre = cursor.getString(columnIndex)
                nombres.append("$nombre\n")
            }
        }

        cursor.close()
        db.close()

        return if (nombres.isEmpty()) "No hay nombres en la base de datos" else nombres.toString()
    }
}
