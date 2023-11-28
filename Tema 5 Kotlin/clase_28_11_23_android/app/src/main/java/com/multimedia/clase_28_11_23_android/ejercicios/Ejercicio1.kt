package com.multimedia.clase_28_11_23_android.ejercicios

fun main() {
    presentacion()
    val suma = sumarValores()
    println("La suma es: $suma")
    despedida()
}

fun presentacion() {
    println("Bienvenido al programa de suma")
}

fun sumarValores(): Int {
    print("Ingrese el primer valor: ")
    val valor1 = readLine()!!.toInt()
    print("Ingrese el segundo valor: ")
    val valor2 = readLine()!!.toInt()
    return valor1 + valor2
}

fun despedida() {
    println("Gracias por utilizar el programa. ¡Adiós!")
}
