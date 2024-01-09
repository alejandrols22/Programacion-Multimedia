package com.multimedia.clase_04_12_23_android.ejercicio

// Interfaz Cliente que define las operaciones básicas de un cliente
interface Cliente {
    val numeroCliente: String // Propiedad que guarda el número de cliente
    
    // Método con implementación por defecto que simula la realización de una compra
    fun realizarCompra() {
        println("Cliente $numeroCliente realizando una compra.") // Imprime que el cliente está realizando una compra
    }
}

// Clase ClientePremium que implementa la interfaz Cliente
// Esta clase representa a un cliente premium con funcionalidades adicionales
class ClientePremium(val nombre: String, val edad: Int, override val numeroCliente: String) : Cliente {
    
    // Método que presenta al cliente como premium
    fun presentarse() {
        println("Soy un cliente premium.") // Imprime un mensaje especial para clientes premium
    }
}

// Función principal del programa
fun main() {
    // Creación de una instancia de ClientePremium con nombre Carlos, edad 30 y número de cliente 12345
    val clientePremium = ClientePremium(nombre = "Carlos", edad = 30, numeroCliente = "12345")
    
    // Llamada al método realizarCompra de la instancia de ClientePremium
    // Utiliza la implementación por defecto de la interfaz Cliente
    clientePremium.realizarCompra()
    
    // Llamada al método presentarse de la instancia de ClientePremium
    // Este método es específico de la clase ClientePremium y muestra que es un cliente premium
    clientePremium.presentarse()
}
