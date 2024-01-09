package com.multimedia.clase_juegoespia

import kotlin.random.Random

// La función que genera un número aleatorio entre 0 y 9
fun generarNumeroSecreto(): Int {
    return Random.nextInt(10)
}

// La función que evalúa el intento del usuario y devuelve si es correcto o no
fun evaluarIntento(intentos: List<Int>, numeroSecreto: Int): Boolean {
    for (i in intentos.indices) {
        if (intentos[i] == numeroSecreto) {
            println("¡Has descubierto un número de la combinación!")
            return true
        }
    }
    println("No has acertado ningún número, intenta de nuevo.")
    return false
}

// Función principal donde se desarrolla la lógica del juego
fun main() {
    val combinacionSecreta = List(5) { generarNumeroSecreto() } // Genera una combinación secreta de 5 números
    val intentosDescubiertos = mutableListOf<Int>() // Array para guardar los números descubiertos
    var oportunidades = 4 // Número de oportunidades para adivinar
    
    println("Intenta adivinar la combinación de la caja fuerte.")

    // Bucle para dar al usuario un número limitado de oportunidades para adivinar la combinación
    while (oportunidades > 0 && intentosDescubiertos.size < combinacionSecreta.size) {
        println("\nTienes $oportunidades oportunidades. Ingresa un número (0-9):")
        val intento = readLine()?.toIntOrNull() ?: 0 // Lee el intento del usuario y asegura que es un número

        if (evaluarIntento(combinacionSecreta, intento)) {
            intentosDescubiertos.add(intento)
        }

        oportunidades--
    }

    // Comprobar si se ha descubierto la combinación completa
    if (intentosDescubiertos.size == combinacionSecreta.size) {
        println("¡Has desactivado la alarma y conseguido la información!")
    } else {
        println("La alarma se ha activado y la SS está en camino.")
    }
}


