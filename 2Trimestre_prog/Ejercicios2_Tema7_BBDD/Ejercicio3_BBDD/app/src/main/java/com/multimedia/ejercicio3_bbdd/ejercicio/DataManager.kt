package com.multimedia.ejercicio3_bbdd.ejercicio

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.content.ContentValues


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
}
