package com.multimedia.clase_01_12_23_android.ejerciciopoo2

fun main() {
    val juegoDeDados = JuegoDeDados()
    juegoDeDados.jugar()
}

class Dado {
    fun tirar() = (1..6).random()
}

class JuegoDeDados {
    private val dado = Dado()

    fun jugar() {
        val resultado1 = dado.tirar()
        val resultado2 = dado.tirar()
        val resultado3 = dado.tirar()

        println("Resultados: $resultado1, $resultado2, $resultado3")
        if (resultado1 == resultado2 && resultado2 == resultado3) {
            println("Ganó")
        } else {
            println("Perdió")
        }
    }
}
