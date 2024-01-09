package com.multimedia.clase_04_12_23_android.ejercicio


// Definición del enum 'DiasDeLaSemana' con los días de la semana
enum class DiasDeLaSemana {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
}

// Función principal del programa
fun main() {
    // Crear una variable que represente el día actual y asignarle el valor 'MIERCOLES'
    val diaActual = DiasDeLaSemana.MIERCOLES

    // Usar la expresión 'when' para imprimir un mensaje en función del día actual
    when (diaActual) {
        DiasDeLaSemana.LUNES -> println("¡Es lunes!") // Si es lunes, imprimir "¡Es lunes!"
        DiasDeLaSemana.MARTES -> println("¡Es martes!") // Si es martes, imprimir "¡Es martes!"
        DiasDeLaSemana.MIERCOLES -> println("¡Es miércoles!") // Si es miércoles, imprimir "¡Es miércoles!"
        DiasDeLaSemana.JUEVES -> println("¡Es jueves!") // Si es jueves, imprimir "¡Es jueves!"
        DiasDeLaSemana.VIERNES -> println("¡Es viernes!") // Si es viernes, imprimir "¡Es viernes!"
        DiasDeLaSemana.SABADO -> println("¡Es sábado!") // Si es sábado, imprimir "¡Es sábado!"
        DiasDeLaSemana.DOMINGO -> println("¡Es domingo!") // Si es domingo, imprimir "¡Es domingo!"
    }
}
