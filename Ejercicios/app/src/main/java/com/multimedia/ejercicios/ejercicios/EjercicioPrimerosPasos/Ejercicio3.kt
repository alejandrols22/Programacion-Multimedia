package com.multimedia.clase_20_11_23.primeros_pasos

fun main() {
    print("Ingrese el primer número entero: ")
    val num1 = readln().toInt()

    print("Ingrese el segundo número entero: ")
    val num2 = readln().toInt()

    if (num1 > num2) {
        println("El mayor es: $num1")
    } else if (num1 == num2) { // Cambio hecho aquí
        println("$num1 es igual a $num2") // Cambio hecho aquí
    } else {
        println("El mayor es: $num2")
    }
}

