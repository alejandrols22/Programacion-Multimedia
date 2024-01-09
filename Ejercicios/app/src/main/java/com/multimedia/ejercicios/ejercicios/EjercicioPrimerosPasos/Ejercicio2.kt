package com.multimedia.clase_20_11_23.primeros_pasos

fun main()
{
    print("Ingrese la nota de su examen: ")
    val nota = readln().toDouble()

    if (nota <= 4.99 && nota > 0) {
        println("Suspenso, estudia más")
    } else if (nota >= 5.0 && nota <= 5.99) {
        println("Suficiente")
    } else if (nota >= 6.0 && nota <= 6.99) {
        println("Bien")
    } else if (nota >= 7.0 && nota <= 7.99) {
        println("Notable")
    } else if (nota >= 8.0 && nota <= 8.99) {
        println("Notable Alto")
    } else if (nota >= 9.0 && nota <= 10.0) {
        println("Sobresaliente")
    } else if (nota > 10 || nota < 0) {
        println("Nota inválida")
    }
}





