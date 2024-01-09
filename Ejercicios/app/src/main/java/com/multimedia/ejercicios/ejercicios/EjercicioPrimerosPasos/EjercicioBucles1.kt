package com.multimedia.clase_20_11_23.primeros_pasos

fun main() {
    for (a in 0..10 step 2) {
        println(a)
    }

    for(b in 10 downTo 0 step 2){
        println(b)
    }

    println("Tabla de multiplicar del 5 usando bucle for:")
    for(i in 1..10) {
        val resultado = 5 * i
        println("5 * $i = $resultado")
    }

    println("Tabla de multiplicar del 5 en orden descendente:")
    for (i in 10 downTo 1) {
        val resultado = 5 * i
        println("5 * $i = $resultado")
        }

    println("Tabla de multiplicar del 5 usando bucle while:")
    var i3 = 1
    while(i3 <=10) {
        val resultado = 5*i3
        println("5 * $i3 = $resultado")
        i3++
    }
    println("Tabla de multiplicar del 5 usando bucle do while en orden descendente:")
    var i2 = 10
    do {
        val resultado = 5 * i2
        println("5 * $i2 = $resultado")
        i2--
    } while (i2 >= 1)
}