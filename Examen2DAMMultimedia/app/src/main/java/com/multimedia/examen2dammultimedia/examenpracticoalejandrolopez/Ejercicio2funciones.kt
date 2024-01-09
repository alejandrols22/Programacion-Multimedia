package com.multimedia.examen2dammultimedia.examenpracticoalejandrolopez

import kotlin.random.Random

class Ejercicio2Funciones {

    // Variables que guardan la cantidad de victorias de cada jugador
    private var victoriasUsuario = 0
    private var victoriasMaquina = 0


    fun jugar() {
        // Muestra el menu principal y pide al usuario una opcion.
        println("Bienvenido al juego de Piedra, Papel o Tijeras")
        println("1. Jugar\n2. Salir")
        when (readLine()) {
            "1" -> iniciarJuego()
            "2" -> return
            else -> println("Opción inválida")
        }
    }


    private fun iniciarJuego() {
        // Pide al usuario el numero de partidas y muestra los resultados de las partidas
        println("Ingresa el número de partidas que deseas jugar:")
        val numeroPartidas = readLine()?.toIntOrNull() ?: return

        for (i in 1..numeroPartidas) {
            jugarPartida()
        }

        mostrarResultados()
    }


    private fun jugarPartida() {
        // Pide al usuario una opcion, genera la opcion de la maquina y determina el ganador
        println("Elige: 1. Piedra, 2. Papel, 3. Tijeras")
        val eleccionUsuario = readLine()
        val eleccionMaquina = Random.nextInt(1, 4)

        println("Tu elección: ${convertirEleccion(eleccionUsuario)}")
        println("Elección de la máquina: ${convertirEleccion(eleccionMaquina.toString())}")

        determinarGanador(eleccionUsuario, eleccionMaquina.toString())
    }


    private fun convertirEleccion(eleccion: String?): String {
        // Convertira el numero que demos en una de las opciones del array
        return when (eleccion) {
            "1" -> "Piedra"
            "2" -> "Papel"
            "3" -> "Tijeras"
            else -> "Inválido"
        }
    }


    private fun determinarGanador(eleccionUsuario: String?, eleccionMaquina: String) {
        // Añade la logica por la que se determinara a un ganador
        if (eleccionUsuario == eleccionMaquina) {
            println("Empate")
        } else if ((eleccionUsuario == "1" && eleccionMaquina == "3") ||
            (eleccionUsuario == "2" && eleccionMaquina == "1") ||
            (eleccionUsuario == "3" && eleccionMaquina == "2")) {
            println("Ganaste esta partida")
            victoriasUsuario++
        } else {
            println("La máquina gana esta partida")
            victoriasMaquina++
        }
    }


    private fun mostrarResultados() {
        // Imprimira las victorias de cada uno
        println("Resultados finales:")
        println("Tus victorias: $victoriasUsuario")
        println("Victorias de la máquina: $victoriasMaquina")
    }
}

fun main() {
    val juego = Ejercicio2Funciones()
    juego.jugar()
}
