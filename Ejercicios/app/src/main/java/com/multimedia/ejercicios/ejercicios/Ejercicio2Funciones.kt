package com.multimedia.clase_27_11_23.funciones


fun main() {
    var seguir = true // Variable booleana para controlar el bucle

    while (seguir) {
        println("\nElige una opción:")
        println("1. Suma")
        println("2. Resta")
        println("3. Multiplicación")
        println("4. División")
        println("5. Salir")
        print("Opción: ")
        val opcion = readLine()?.toIntOrNull() ?: 0

        // Verificar si la opción es salir
        if (opcion == 5) {
            println("Has elegido Salir.")
            seguir = false // Cambiar la condición para terminar el bucle
        } else if (opcion in 1..4) {
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
        } else {
            println("Opción no válida. Intenta de nuevo.")
        }
    }
    println("Programa finalizado.")
}
