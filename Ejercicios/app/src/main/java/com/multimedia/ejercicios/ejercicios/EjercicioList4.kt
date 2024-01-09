package com.multimedia.clase_04_12_23_android.ejercicio

// Función principal que se ejecuta al iniciar el programa
fun main() {
    // Se declara una lista mutable de objetos Any, que puede contener cualquier tipo de valor
    var col4: List<Any> 
    col4 = mutableListOf("1", "Alberto", "2", "Laura", "3", "Cristina")
    
    // Se añade un nuevo elemento al final de la lista mutable
    col4.add(4)
    
    // Se itera sobre cada elemento de la lista y se imprime su valor
    for (element in col4) {
        println(element)
    }

    // Se modifica el elemento en la posición 1 de la lista, cambiándolo a "Pedro"
    col4[1] = "Pedro"

    // Se itera nuevamente sobre cada elemento de la lista y se imprime su valor
    for (element in col4) {
        println(element)
    }
}

