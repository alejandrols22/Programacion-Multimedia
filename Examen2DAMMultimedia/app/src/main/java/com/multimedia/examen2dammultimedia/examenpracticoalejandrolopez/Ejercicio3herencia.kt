package com.multimedia.examen2dammultimedia.examenpracticoalejandrolopez

// Clase base Deporte que será heredada por clases específicas de deportes.
open class Deporte(val nombre: String, val tipoTerreno: String) {

    // Método para mostrar detalles básicos del deporte.
    open fun mostrarDetalles() {
        println("Deporte: $nombre, Tipo de Terreno: $tipoTerreno")
    }
}

// Clase Futbol que hereda de Deporte y agrega propiedades específicas.
class Futbol(numeroJugadores: Int, esCampoGrande: Boolean) : Deporte("Fútbol", "Césped") {
    private val numeroJugadores = numeroJugadores
    private val esCampoGrande = esCampoGrande

    // Sobrescribe el método mostrarDetalles para incluir detalles específicos del fútbol.
    override fun mostrarDetalles() {
        super.mostrarDetalles()
        println("Número de Jugadores: $numeroJugadores, ¿Es campo grande?: $esCampoGrande")
        println("---------------------------------------------------------------")
    }
}

// Clase Baloncesto, hereda de Deporte y agrega sus propias propiedades.
class Baloncesto(val alturaCanasta: Double, val esDeporteEquipo: Boolean) : Deporte("Baloncesto", "Parquet") {
    override fun mostrarDetalles() {
        super.mostrarDetalles()
        println("Altura de la Canasta: $alturaCanasta, ¿Es deporte de equipo?: $esDeporteEquipo")
        println("---------------------------------------------------------------")
    }
}

// Clase Balonmano, extiende Deporte y añade características propias del balonmano.
class Balonmano(val esDeporteOlimpico: Boolean, val esContacto: Boolean) : Deporte("Balonmano", "Parquet") {
    override fun mostrarDetalles() {
        super.mostrarDetalles()
        println("¿Es deporte olímpico?: $esDeporteOlimpico, ¿Es deporte de contacto?: $esContacto")
        println("---------------------------------------------------------------")
    }
}

// Clase Voleibol, también una extensión de Deporte, con propiedades únicas.
class Voleibol(val esDeportePlaya: Boolean, val numeroJugadoresEquipo: Int) : Deporte("Voleibol", "Arena/Parquet") {
    override fun mostrarDetalles() {
        super.mostrarDetalles()
        println("¿Es deporte de playa?: $esDeportePlaya, Número de Jugadores por Equipo: $numeroJugadoresEquipo")
        println("---------------------------------------------------------------")
    }
}

fun main() {
    // Creando instancias de cada tipo de deporte.
    val futbol = Futbol(11, true)
    val baloncesto = Baloncesto(3.05, true)
    val balonmano = Balonmano(true, true)
    val voleibol = Voleibol(false, 6)

    // Mostrando detalles de cada deporte utilizando sus métodos.
    futbol.mostrarDetalles()
    baloncesto.mostrarDetalles()
    balonmano.mostrarDetalles()
    voleibol.mostrarDetalles()
}
