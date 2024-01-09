package com.multimedia.clase_28_11_23_android.ejercicios

fun main() {
    fun contarMultiplos() {
        var multiplosDe2 = 0
        var multiplosDe5 = 0
        repeat(10) {
            print("Ingrese un número: ")
            val num = readLine()!!.toInt()
            if (num % 2 == 0) multiplosDe2++
            if (num % 5 == 0) multiplosDe5++
        }
        println("Cantidad de múltiplos de 2: $multiplosDe2")
        println("Cantidad de múltiplos de 5: $multiplosDe5")
    }

    contarMultiplos()
}
