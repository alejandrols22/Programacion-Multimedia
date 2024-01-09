package com.multimedia.examen2dammultimedia.examenpracticoalejandrolopez

    fun main() {
        // Matriz bidimensional con nombres y salarios
        val empleados = arrayOf(
            arrayOf("Juan Alberto Rodriguez", "Marta Diaz", "Roberto Borgia"),
            arrayOf("3000", "3500", "4000")
        )

        mostrarNombres(empleados)
        calcularNotaMediaYSumaTotal(empleados)
    }

    private fun mostrarNombres(empleados: Array<Array<String>>) {
        // Extrae y muestra los nombres
        val nombres = empleados[0].joinToString(", ")
        println("Nombres: $nombres")
    }

    private fun calcularNotaMediaYSumaTotal(empleados: Array<Array<String>>) {
        // Extrae y muestra los salarios
        val salarios = empleados[1].map { it.toDouble() }
        val salariosStr = salarios.joinToString(", ")
        println("Salarios Base: $salariosStr")

        // Calcula y muestra la nota media
        val media = salarios.average()
        println("Nota Media de Salarios: $media")

        // Calcula y muestra la suma total
        val sumaTotal = salarios.sum()
        println("Suma Total de Salarios: $sumaTotal")
    }

