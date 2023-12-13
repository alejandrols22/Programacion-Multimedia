package com.multimedia.clase_04_12_23_android.ejercicio

// Declaración de la clase Televisor con su constructor
class Televisor(val nombre: String, val fabricante: String, val precio: Double) {
    // Método para encender el televisor
    fun encender() {
        println("Encendiendo el televisor $nombre fabricado por $fabricante.")
    }

    // Método para apagar el televisor
    fun apagar() {
        println("Apagando el televisor $nombre.")
    }
}

// Función principal donde se ejecuta el programa
fun main() {
    // Crear una instancia de la clase Televisor para un televisor Samsung
    val miTelevisor = Televisor(nombre = "Smart TV", fabricante = "Samsung", precio = 799.99)

    // Crear otra instancia de la clase Televisor para un televisor Panasonic
    val miTelevisor2 = Televisor(nombre = "Panasonic modelo L", fabricante = "Panasonic", precio = 1500.00)

    // Acceder a las propiedades y métodos de la instancia miTelevisor
    println("Nombre: ${miTelevisor.nombre}")
    println("Fabricante: ${miTelevisor.fabricante}")
    println("Precio: ${miTelevisor.precio} €")

    // Acceder a las propiedades y métodos de la instancia miTelevisor2
    // Nota: Parece que hay un error en las imágenes proporcionadas donde se intenta acceder a miTelevisor2
    // pero se utiliza miTelevisor. Se corregirá esto en los siguientes comentarios.
    
    // Imprimir propiedades de miTelevisor2
    println("Nombre: ${miTelevisor2.nombre}")
    println("Fabricante: ${miTelevisor2.fabricante}")
    println("Precio: ${miTelevisor2.precio} €")

    // Llamar a los métodos encender() y apagar() de miTelevisor
    miTelevisor.encender()
    miTelevisor.apagar()
}
