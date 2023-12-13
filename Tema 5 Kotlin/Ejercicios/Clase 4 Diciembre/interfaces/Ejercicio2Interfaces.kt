package com.multimedia.clase_04_12_23_android.ejercicio

// Definición de una interfaz Dispositivo con métodos encender y apagar
interface Dispositivo {
    val nombre: String
    val fabricante: String
    val precio: Double

    fun encender()
    fun apagar()
}

// Implementación de la interfaz Dispositivo para un Televisor
class Televisor(override val nombre: String, override val fabricante: String, override val precio: Double) : Dispositivo {
    override fun encender() {
        println("Encendiendo el televisor $nombre fabricado por $fabricante.")
    }

    override fun apagar() {
        println("Apagando el televisor $nombre.")
    }
}

// Implementación de la interfaz Dispositivo para un Móvil
class Movil(override val nombre: String, override val fabricante: String, override val precio: Double) : Dispositivo {
    override fun encender() {
        println("Encendiendo el móvil $nombre fabricado por $fabricante.")
    }

    override fun apagar() {
        println("Apagando el móvil $nombre.")
    }
}

// Función principal
fun main() {
    // Crear una instancia de Televisor
    val miTelevisor = Televisor(nombre = "Smart TV", fabricante = "Samsung", precio = 799.99)
    println("Fabricante: ${miTelevisor.fabricante}")
    println("Precio: ${miTelevisor.precio} €")

    // Crear una instancia de Movil
    val miMovil = Movil(nombre = "XIAOMI 3025", fabricante = "XIAOMI", precio = 599.99)
    println("Nombre: ${miMovil.nombre}")
    println("Fabricante: ${miMovil.fabricante}")
    println("Precio: ${miMovil.precio} €")

    // Uso de los dispositivos
    miTelevisor.encender()
    miTelevisor.apagar()
    miMovil.encender()
    miMovil.apagar()
}

