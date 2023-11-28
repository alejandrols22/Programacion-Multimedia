package com.multimedia.clase_28_11_23_android.ejercicios

fun contarCaracteres(texto: String): Int {
    return texto.length
}

fun main() {
    print("Ingrese el primer nombre: ")
    val nombre1 = readLine()!!
    print("Ingrese el segundo nombre: ")
    val nombre2 = readLine()!!

    val longitud1 = contarCaracteres(nombre1)
    val longitud2 = contarCaracteres(nombre2)

    println("El nombre con más caracteres es: ${if (longitud1 > longitud2) nombre1 else nombre2}")
}
