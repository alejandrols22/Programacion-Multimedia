package com.multimedia.simulacroejercicio1.ejercicio

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper


class DatabaseHelper(context: Context?) :
    SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(TABLE_CREATE)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        // Esta es solo una forma simple de manejar las actualizaciones de la base de datos.
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME)
        onCreate(db)
    }

    // Método para agregar datos a la base de datos
    fun addData(
        nombre: String?,
        apellidos: String?,
        direccion: String?,
        cp: String?,
        ciudad: String?,
        provincia: String?,
        telefono: String?
    ): Boolean {
        val db = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(COLUMN_NOMBRE, nombre)
        contentValues.put(COLUMN_APELLIDOS, apellidos)
        contentValues.put(COLUMN_DIRECCION, direccion)
        contentValues.put(COLUMN_CP, cp)
        contentValues.put(COLUMN_CIUDAD, ciudad)
        contentValues.put(COLUMN_PROVINCIA, provincia)
        contentValues.put(COLUMN_TELEFONO, telefono)
        val result = db.insert(TABLE_NAME, null, contentValues)
        return result != -1L // Si result es -1, ocurrió un error.
    }

    // Método para borrar todos los datos de la base de datos
    fun deleteAllData() {
        val db = this.writableDatabase
        db.delete(TABLE_NAME, null, null)
    }

    // Método para obtener todos los datos de la base de datos
    fun getAllData(): Cursor? {
        val db = this.readableDatabase
        return db.rawQuery("SELECT * FROM $TABLE_NAME", null)
    }

    companion object {
        // Nombre de la base de datos y versión
         const val DATABASE_NAME = "Empresa.db"
         const val DATABASE_VERSION = 1

        // Nombre de la tabla y columnas
         const val TABLE_NAME = "DatosPersonales"
         const val COLUMN_ID = "id"
         const val COLUMN_NOMBRE = "Nombre"
         const val COLUMN_APELLIDOS = "Apellidos"
         const val COLUMN_DIRECCION = "Direccion"
         const val COLUMN_CP = "Cp"
         const val COLUMN_CIUDAD = "Ciudad"
         const val COLUMN_PROVINCIA = "Provincia"
         const val COLUMN_TELEFONO = "Telefono"

        // Instrucción SQL para crear la tabla
        private const val TABLE_CREATE = "CREATE TABLE " + TABLE_NAME + " (" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_NOMBRE + " TEXT, " +
                COLUMN_APELLIDOS + " TEXT, " +
                COLUMN_DIRECCION + " TEXT, " +
                COLUMN_CP + " TEXT, " +
                COLUMN_CIUDAD + " TEXT, " +
                COLUMN_PROVINCIA + " TEXT, " +
                COLUMN_TELEFONO + " TEXT" + ");"
    }
}


