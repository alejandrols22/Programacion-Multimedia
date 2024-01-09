package com.multimedia.examen2dammultimedia.examenpracticoalejandrolopez


fun mostrar(lista: List<Any>) {
    // Imprimira los elementos en lista
    lista.forEach { elemento ->
        println(elemento)
    }
}

fun main() {
    // Creando la lista mutable con información inicial
    val centro = mutableListOf<Any>("MATEMATICAS", "Juan", 8, "LENGUA", "Maria", 9)

    // Mostrar lista original
    println("Lista Original:")
    mostrar(centro)

    // Modificar asignaturas
    centro[centro.indexOf("MATEMATICAS")] = "HISTORIA"
    centro[centro.indexOf("LENGUA")] = "FÍSICA"

    // Mostrar lista después de la modificación
    println("\nLista después de modificar asignaturas:")
    mostrar(centro)

    // Añadir nuevos elementos
    centro.addAll(listOf("QUÍMICA", "Cristina", 7))

    // Mostrar lista después de añadir nuevos elementos
    println("\nLista después de añadir nuevos elementos:")
    mostrar(centro)
}

