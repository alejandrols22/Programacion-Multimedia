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
        println("6. Salir")
        print("Opción: ")
        val opcion = readLine()?.toIntOrNull() ?: 0

        if (opcion == 6) {
            println("Has elegido Salir.")
            seguir = false
        } else if (opcion in 1..5) {
            if (opcion == 5) {
                jugarPiedraPapelTijeras()
            } else {
                print("Ingresa el primer número: ")
                val numero1 = readLine()?.toIntOrNull() ?: 0
                print("Ingresa el segundo número: ")
                val numero2 = readLine()?.toIntOrNull() ?: 0

                var resultado = 0
                if (opcion == 1) {
                    resultado = sumar(numero1, numero2)
                    println("La suma es: $resultado")
                } else if (opcion == 2) {
                    resultado = restar(numero1, numero2)
                    println("La resta es: $resultado")
                } else if (opcion == 3) {
                    resultado = multiplicar(numero1, numero2)
                    println("La multiplicación es: $resultado")
                } else if (opcion == 4) {
                    if (numero2 == 0) {
                        println("No se puede dividir por cero.")
                    } else {
                        resultado = dividir(numero1, numero2)
                        println("La división es: $resultado")
                    }
                } else {
                    println("Opción no válida. Intenta de nuevo.")
                }
            }
        } else {
            println("Opción no válida. Intenta de nuevo.")
        }
    }
    println("Programa finalizado.")
}



fun jugarPiedraPapelTijeras() {
    println("Vamos a jugar piedra, papel o tijeras.")
    print("Elige (1) piedra, (2) papel, o (3) tijeras: ")
    val eleccionUsuario = readLine()?.toIntOrNull() ?: 0
    val eleccionComputadora = (1..3).random()

    if (eleccionUsuario !in 1..3) {
        println("Elección no válida.")
        return
    }

    println("Tu elección: ${convertirEleccion(eleccionUsuario)}")
    println("Elección de la computadora: ${convertirEleccion(eleccionComputadora)}")

    when {
        eleccionUsuario == eleccionComputadora -> println("Empate!")
        (eleccionUsuario == 1 && eleccionComputadora == 3) ||
                (eleccionUsuario == 2 && eleccionComputadora == 1) ||
                (eleccionUsuario == 3 && eleccionComputadora == 2) -> println("Ganaste!")
        else -> println("La computadora gana.")
    }
}

fun convertirEleccion(eleccion: Int): String {
    return when (eleccion) {
        1 -> "Piedra"
        2 -> "Papel"
        3 -> "Tijeras"
        else -> "Inválido"
    }
}

fun calcularFibonacci() {
    print("Introduce el número de términos para la serie de Fibonacci: ")
    val n = readLine()?.toIntOrNull() ?: 0
    println("Serie de Fibonacci hasta el término $n:")
    for (i in 0 until n) {
        println("Fibonacci($i) = ${fibonacci(i)}")
    }
}

fun fibonacci(n: Int): Int {
    if (n <= 1) return n
    return fibonacci(n - 1) + fibonacci(n - 2)
}
