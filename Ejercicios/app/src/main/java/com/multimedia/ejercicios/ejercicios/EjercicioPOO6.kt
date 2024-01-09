package com.multimedia.clase_01_12_23_android.ejerciciopoo2

fun main() {
    val operaciones = Operaciones()
    operaciones.ejecutar()
}

class Operaciones {
    fun ejecutar() {
        val num1 = 10
        val num2 = 5
        println("La suma de $num1 y $num2 es: ${sumar(num1, num2)}")
        println("El producto de $num1 y $num2 es: ${multiplicar(num1, num2)}")
    }

    private fun sumar(a: Int, b: Int): Int {
        return a + b
    }

    private fun multiplicar(a: Int, b: Int): Int {
        return a * b
    }
}
