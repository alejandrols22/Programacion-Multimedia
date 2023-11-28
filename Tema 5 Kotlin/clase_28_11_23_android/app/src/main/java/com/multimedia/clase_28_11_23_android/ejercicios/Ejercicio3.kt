package com.multimedia.clase_28_11_23_android.ejercicios

fun main() {
    print("Ingrese el lado del cuadrado: ")
    val lado = readLine()!!.toDouble()

    println("Desea calcular el perímetro (P) o la superficie (S)?")
    when (readLine()) {
        "P", "p" -> println("Perímetro: ${4 * lado}")
        "S", "s" -> println("Superficie: ${lado * lado}")
        else -> println("Opción no válida")
    }
}
