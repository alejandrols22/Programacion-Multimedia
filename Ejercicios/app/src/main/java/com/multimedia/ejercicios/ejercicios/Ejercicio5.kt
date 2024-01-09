package com.multimedia.clase_28_11_23_android.ejercicios

fun mayorDeDos(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun main() {
    val num1 = 7
    val num2 = 10
    val mayor = mayorDeDos(num1, num2)
    println("El mayor entre $num1 y $num2 es: $mayor")
}

