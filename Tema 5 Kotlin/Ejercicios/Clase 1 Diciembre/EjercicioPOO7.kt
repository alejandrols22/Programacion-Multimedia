package com.multimedia.clase_01_12_23_android.ejerciciopoo2

fun main() {
    val hijos = Hijos()
    hijos.cargar()
}

class Hijos {
    private val edades = intArrayOf(18, 21, 15, 23, 30)

    fun cargar() {
        imprimirMayorEdad()
        imprimirPromedioEdades()
    }

    private fun imprimirMayorEdad() {
        println("La mayor edad es: ${edades.maxOrNull()}")
    }

    private fun imprimirPromedioEdades() {
        val promedio = edades.average()
        println("El promedio de edades es: $promedio")
    }
}
