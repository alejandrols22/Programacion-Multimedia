package com.multimedia.clase_28_11_23_android.ejercicios

fun calcularSuperficie(lado: Double): Double {
    return lado * lado
}

fun main() {
    val ladoCuadrado = 5.0
    val superficie = calcularSuperficie(ladoCuadrado)
    println("La superficie del cuadrado con lado $ladoCuadrado es: $superficie")
}

