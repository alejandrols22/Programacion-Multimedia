package com.multimedia.ejercicio2_bbdd.ejercicio

import android.content.ContentValues
import android.content.Context

class DataManager(private val context: Context) {
    private val dbHelper = DatabaseHelper(context)

    fun agregarNombreYContraseña(nombre: String, contraseña: String) {
        val db = dbHelper.writableDatabase
        val valores = ContentValues().apply {
            put(DatabaseHelper.COLUMNA_NOMBRE, nombre)
            put(DatabaseHelper.COLUMNA_CONTRASEÑA, contraseña)
        }
        db.insert(DatabaseHelper.NOMBRE_TABLA, null, valores)
        db.close()
    }

    fun obtenerTodosLosNombresYContraseñas(): String {
        val db = dbHelper.readableDatabase
        val cursor = db.rawQuery("SELECT * FROM ${DatabaseHelper.NOMBRE_TABLA}", null)
        val nombresYContraseñas = StringBuilder()

        while (cursor.moveToNext()) {
            val nombre = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMNA_NOMBRE))
            val contraseña = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMNA_CONTRASEÑA))
            nombresYContraseñas.append("Nombre: $nombre, Contraseña: $contraseña\n")
        }

        cursor.close()
        db.close()

        return if (nombresYContraseñas.isEmpty()) "No hay registros en la base de datos" else nombresYContraseñas.toString()
    }
}
