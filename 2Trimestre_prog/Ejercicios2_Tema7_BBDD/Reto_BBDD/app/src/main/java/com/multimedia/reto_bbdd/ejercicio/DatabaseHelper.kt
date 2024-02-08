package com.multimedia.reto_bbdd.ejercicio

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, NOMBRE_BASE_DATOS, null, VERSION_BASE_DATOS) {
    companion object {
        private const val VERSION_BASE_DATOS = 1
        private const val NOMBRE_BASE_DATOS = "Alumnos.db"
        const val NOMBRE_TABLA = "alumnos"
        const val COLUMNA_ID = "idAlumno"
        const val COLUMNA_NOMBRE = "nombre"
        const val COLUMNA_APELLIDOS = "apellidos"
        const val COLUMNA_DNI = "dni"
        const val COLUMNA_EDAD = "edad"
        const val COLUMNA_CURSO = "curso"
    }

    override fun onCreate(db: SQLiteDatabase) {
        val CREAR_TABLA = "CREATE TABLE $NOMBRE_TABLA (" +
                "$COLUMNA_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "$COLUMNA_NOMBRE TEXT, " +
                "$COLUMNA_APELLIDOS TEXT, " +
                "$COLUMNA_DNI TEXT, " +
                "$COLUMNA_EDAD INTEGER, " +
                "$COLUMNA_CURSO TEXT)"
        db.execSQL(CREAR_TABLA)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $NOMBRE_TABLA")
        onCreate(db)
    }
}
