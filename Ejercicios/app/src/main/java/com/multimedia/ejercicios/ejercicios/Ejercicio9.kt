package com.multimedia.clase_28_11_23_android.ejercicios

fun subrayarTexto(texto: String, caracter: String = "-") {
    println(texto)
    println(caracter.repeat(texto.length))
}

fun main() {
    subrayarTexto("Hola Mundo", "*")
    subrayarTexto("Kotlin es divertido")
}


