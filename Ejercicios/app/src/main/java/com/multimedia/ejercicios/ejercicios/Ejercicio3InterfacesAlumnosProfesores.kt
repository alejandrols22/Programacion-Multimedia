package com.multimedia.clase_04_12_23_android.ejercicio

// Definición de la interfaz Persona con propiedades y métodos comunes
interface Persona {
    val nombre: String
    val edad: Int
    fun presentarse()
}

// Clase que implementa la interfaz Persona para representar a un Alumno
class Alumno(
    override val nombre: String,
    override val edad: Int,
    val grado: String
) : Persona {
    // Implementación del método presentarse
    override fun presentarse() {
        println("Hola, mi nombre es $nombre y tengo $edad años.")
        println("Soy un alumno del grado $grado.")
    }

    // Otro método específico de Alumno
    fun estudiar() {
        println("Estudiando para el próximo examen.")
    }
}

// Clase que implementa la interfaz Persona para representar a un Profesor
class Profesor(
    override val nombre: String,
    override val edad: Int,
    val asignatura: String
) : Persona {
    // Implementación del método presentarse
    override fun presentarse() {
        println("Hola, mi nombre es $nombre y tengo $edad años.")
        println("Soy profesor de la asignatura $asignatura.")
    }

    // Método específico de Profesor
    fun impartirLeccion() {
        println("Impartiendo la lección del día.")
    }
}

// Función principal
fun main() {
    // Creación de una instancia de Alumno
    val juan = Alumno(nombre = "Juan", edad = 15, grado = "1° FP")
    juan.presentarse() // El alumno se presenta
    juan.estudiar() // El alumno indica que está estudiando

    // Creación de una instancia de Profesor
    val profesorMartinez = Profesor(nombre = "Prof. Martinez", edad = 25, asignatura = "Entorno de desarrollo")
    profesorMartinez.presentarse() // El profesor se presenta
    profesorMartinez.impartirLeccion() // El profesor imparte la lección
}

