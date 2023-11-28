package com.multimedia.clase_27_11_23.funciones



fun main() {
    var seguir = true

    while (seguir) {
        println("\nElige una opción:")
        println("1. Suma")
        println("2. Resta")
        println("3. Multiplicación")
        println("4. División")
        println("5. Jugar piedra, papel o tijeras")
        println("6. Calcular serie de Fibonacci con números personalizados")
        println("7. Salir")
        print("Opción: ")
        val opcion = readLine()?.toIntOrNull() ?: 0

        when (opcion) {
            7 -> {
                println("Has elegido Salir.")
                seguir = false
            }
            1 -> operarMatematicamente(opcion)
            2 -> operarMatematicamente(opcion)
            3 -> operarMatematicamente(opcion)
            4 -> operarMatematicamente(opcion)
            5 -> jugarPiedraPapelTijeras()
            6 -> calcularFibonacciPersonalizado()
            else -> println("Opción no válida. Intenta de nuevo.")
        }
    }
    println("Programa finalizado.")
}


fun operarMatematicamente(opcion: Int) {
    print("Ingresa el primer número: ")
    val numero1 = readLine()?.toIntOrNull() ?: 0
    print("Ingresa el segundo número: ")
    val numero2 = readLine()?.toIntOrNull() ?: 0

    var resultado = 0
    when (opcion) {
        1 -> {
            resultado = sumar(numero1, numero2)
            println("La suma es: $resultado")
        }
        2 -> {
            resultado = restar(numero1, numero2)
            println("La resta es: $resultado")
        }
        3 -> {
            resultado = multiplicar(numero1, numero2)
            println("La multiplicación es: $resultado")
        }
        4 -> {
            if (numero2 == 0) {
                println("No se puede dividir por cero.")
            } else {
                resultado = dividir(numero1, numero2)
                println("La división es: $resultado")
            }
        }
    }
}

fun calcularFibonacciPersonalizado() {
    print("Ingresa el primer número para la serie de Fibonacci: ")
    val primerNumero = readLine()?.toIntOrNull() ?: 0
    print("Ingresa el segundo número para la serie de Fibonacci: ")
    val segundoNumero = readLine()?.toIntOrNull() ?: 0
    print("Introduce el número de términos para la serie de Fibonacci: ")
    val n = readLine()?.toIntOrNull() ?: 0

    println("Serie de Fibonacci con números personalizados hasta el término $n:")
    var a = primerNumero
    var b = segundoNumero
    for (i in 0 until n) {
        println("Fibonacci($i) = $a")
        val suma = a + b
        a = b
        b = suma
    }
}