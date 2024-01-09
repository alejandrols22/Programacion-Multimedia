package com.multimedia.clase_28_11_23_android.ejercicios

fun numeroEnCastellano(num: Int): String {
    return when (num) {
        1 -> "uno"
        2 -> "dos"
        3 -> "tres"
        4 -> "cuatro"
        5 -> "cinco"
        else -> "error"
    }
}

fun main() {
    val numerosParaProbar = listOf(1, 2, 3, 4, 5, 6) // Incluye un número fuera del rango para probar el caso 'else'

    numerosParaProbar.forEach { num ->
        println("El número $num en castellano es: ${numeroEnCastellano(num)}")
    }
}

