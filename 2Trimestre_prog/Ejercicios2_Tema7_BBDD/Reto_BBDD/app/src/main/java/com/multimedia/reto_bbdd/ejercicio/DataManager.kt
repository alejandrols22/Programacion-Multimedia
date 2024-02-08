package com.multimedia.reto_bbdd.ejercicio

import android.content.ContentValues
import android.content.Context

class DataManager(private val context: Context) {
    private val dbHelper = DatabaseHelper(context)

    fun agregarAlumno(nombre: String, apellidos: String, dni: String, edad: Int, curso: String) {
        val db = dbHelper.writableDatabase
        val valores = ContentValues().apply {
            put(DatabaseHelper.COLUMNA_NOMBRE, nombre)
            put(DatabaseHelper.COLUMNA_APELLIDOS, apellidos)
            put(DatabaseHelper.COLUMNA_DNI, dni)
            put(DatabaseHelper.COLUMNA_EDAD, edad)
            put(DatabaseHelper.COLUMNA_CURSO, curso)
        }
        db.insert(DatabaseHelper.NOMBRE_TABLA, null, valores)
        db.close()
    }

    fun obtenerTodosLosAlumnos(): String {
        val db = dbHelper.readableDatabase
        val cursor = db.rawQuery("SELECT * FROM ${DatabaseHelper.NOMBRE_TABLA}", null)
        val alumnos = StringBuilder()

        while (cursor.moveToNext()) {
            val id = cursor.getInt(cursor.getColumnIndex(DatabaseHelper.COLUMNA_ID))
            val nombre = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMNA_NOMBRE))
            val apellidos = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMNA_APELLIDOS))
            val dni = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMNA_DNI))
            val edad = cursor.getInt(cursor.getColumnIndex(DatabaseHelper.COLUMNA_EDAD))
            val curso = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMNA_CURSO))
            alumnos.append("ID: $id, Nombre: $nombre, Apellidos: $apellidos, DNI: $dni, Edad: $edad, Curso: $curso\n")
        }

        cursor.close()
        db.close()

        return if (alumnos.isEmpty()) "No hay alumnos en la base de datos" else alumnos.toString()
    }

    fun actualizarAlumno(id: Int, nombre: String, apellidos: String, dni: String, edad: Int, curso: String) {
        val db = dbHelper.writableDatabase
        val valores = ContentValues().apply {
            put(DatabaseHelper.COLUMNA_NOMBRE, nombre)
            put(DatabaseHelper.COLUMNA_APELLIDOS, apellidos)
            put(DatabaseHelper.COLUMNA_DNI, dni)
            put(DatabaseHelper.COLUMNA_EDAD, edad)
            put(DatabaseHelper.COLUMNA_CURSO, curso)
        }
        db.update(DatabaseHelper.NOMBRE_TABLA, valores, "${DatabaseHelper.COLUMNA_ID} = ?", arrayOf(id.toString()))
        db.close()
    }

    fun eliminarAlumno(id: Int) {
        val db = dbHelper.writableDatabase
        db.delete(DatabaseHelper.NOMBRE_TABLA, "${DatabaseHelper.COLUMNA_ID} = ?", arrayOf(id.toString()))
        db.close()
    }
}
