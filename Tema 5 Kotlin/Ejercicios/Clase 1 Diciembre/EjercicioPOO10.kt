package com.multimedia.clase_01_12_23_android.ejerciciopoo2

fun main() {
    val club = Club()
    club.imprimirSocioConMasAntiguedad()
}

class Socio(val nombre: String, val antiguedad: Int)

class Club {
    private val socios = arrayOf(Socio("Juan", 10), Socio("Ana", 5), Socio("Luis", 15))

    fun imprimirSocioConMasAntiguedad() {
        val socioConMasAntiguedad = socios.maxByOrNull { it.antiguedad }
        println("El socio con más antigüedad es: ${socioConMasAntiguedad?.nombre}")
    }
}
