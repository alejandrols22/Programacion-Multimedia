package com.multimedia.clase_04_12_23_android.ejercicio

// Definición de la interfaz Trabajador con propiedades y métodos comunes
interface Trabajador {
    val nombre: String
    val edad: Int
    fun presentarse()
    fun trabajar()
}

// Clase que implementa la interfaz Trabajador para representar a un Empleado
class Empleado(
    override val nombre: String,
    override val edad: Int,
    val cargo: String
) : Trabajador {
    // Implementación del método presentarse
    override fun presentarse() {
        println("Hola, mi nombre es $nombre y tengo $edad años.")
    }

    // Implementación del método trabajar
    override fun trabajar() {
        println("$nombre está realizando tareas como $cargo.")
    }

    // Método específico de Empleado
    fun tomarDescanso() {
        println("$nombre está tomando un descanso.")
    }
}

// Clase que implementa la interfaz Trabajador para representar a un Jefe
class Jefe(
    override val nombre: String,
    override val edad: Int,
    val departamento: String
) : Trabajador {
    // Implementación del método presentarse
    override fun presentarse() {
        println("Hola, mi nombre es $nombre y tengo $edad años.")
    }

    // Implementación del método trabajar
    override fun trabajar() {
        println("$nombre está supervisando el departamento $departamento.")
    }

    // Método específico de Jefe
    fun realizarReuniones() {
        println("$nombre está llevando a cabo reuniones con el equipo.")
    }
}

// Función principal
fun main() {
    // Crear instancias de Empleado y Jefe
    val empleado1 = Empleado(nombre = "Ana", edad = 25, cargo = "Desarrollador")
    val jefe1 = Jefe(nombre = "Sr. Rodríguez", edad = 40, departamento = "Ventas")

    // Llamar a métodos y propiedades comunes de la interfaz Trabajador
    empleado1.presentarse()
    empleado1.trabajar()
    empleado1.tomarDescanso()

    jefe1.presentarse()
    jefe1.trabajar()
    jefe1.realizarReuniones()
}
