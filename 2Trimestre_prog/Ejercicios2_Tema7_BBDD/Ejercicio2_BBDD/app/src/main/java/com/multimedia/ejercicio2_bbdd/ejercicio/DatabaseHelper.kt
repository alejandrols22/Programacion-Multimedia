package com.multimedia.ejercicio2_bbdd.ejercicio

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, NOMBRE_BASE_DATOS, null, VERSION_BASE_DATOS) {

    companion object {
        private const val VERSION_BASE_DATOS = 1
        private const val NOMBRE_BASE_DATOS = "miBaseDatos.db"
        const val NOMBRE_TABLA = "nombres"
        const val COLUMNA_ID = "_id"
        const val COLUMNA_NOMBRE = "nombre"
        const val COLUMNA_CONTRASEÑA = "contraseña" // Nueva columna para la contraseña
    }

    override fun onCreate(db: SQLiteDatabase) {
        val CREAR_TABLA = "CREATE TABLE $NOMBRE_TABLA ($COLUMNA_ID INTEGER PRIMARY KEY, $COLUMNA_NOMBRE TEXT, $COLUMNA_CONTRASEÑA TEXT)"
        db.execSQL(CREAR_TABLA)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $NOMBRE_TABLA")
        onCreate(db)
    }
}
