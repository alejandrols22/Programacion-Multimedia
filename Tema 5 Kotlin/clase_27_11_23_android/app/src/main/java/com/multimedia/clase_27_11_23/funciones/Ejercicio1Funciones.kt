package com.multimedia.clase_27_11_23.funciones

fun sumar(a: Int, b: Int): Int {
    return a + b
}

fun restar(a: Int, b: Int): Int {
    return a - b
}

fun multiplicar(a: Int, b: Int): Int {
    return a * b
}

fun dividir(a: Int, b: Int): Int {
    // Previene la división por cero devolviendo 0
    return if (b != 0) a / b else 0
}

fun main() {
    print("Indícame un número: ")
    val numero1 = readLine()?.toIntOrNull() ?: 0
    print("Indícame otro número: ")
    val numero2 = readLine()?.toIntOrNull() ?: 0

    val resultadoSuma = sumar(numero1, numero2)
    val resultadoResta = restar(numero1, numero2)
    val resultadoMultiplicacion = multiplicar(numero1, numero2)
    val resultadoDivision = dividir(numero1, numero2)

    println("La suma es: $resultadoSuma")
    println("La resta es: $resultadoResta")
    println("La multiplicación es: $resultadoMultiplicacion")
    println("La división es: ${if (resultadoDivision != 0) resultadoDivision.toString() else "Infinito"}")
}
