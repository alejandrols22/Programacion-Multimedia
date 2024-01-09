package com.multimedia.examen2dammultimedia.examenpracticoalejandrolopez

// Interfaz Jugable con un método para simular la acción de jugar un juego.
interface Jugable {
    fun jugar(nombreUsuario: String)
}

// Interfaz SonidoAmbiente con un método para reproducir sonidos del juego.
interface SonidoAmbiente {
    fun reproducirSonido()
}

// Interfaz GuardadoPartida con un método para simular el guardado de una partida.
interface GuardadoPartida {
    fun guardarPartida()
}

// Clase Aventura que implementa las tres interfaces, representando un juego de aventura.

class Aventura : Jugable, SonidoAmbiente, GuardadoPartida {
    // Implementación del método jugar de la interfaz Jugable.
    override fun jugar(nombreUsuario: String) {
        println("Usuario $nombreUsuario está jugando al juego de Aventura")
    }

    // Implementación del método reproducirSonido de la interfaz SonidoAmbiente.
    override fun reproducirSonido() {
        println("Reproduciendo sonidos misteriosos de la aventura...")
    }

    // Implementación del método guardarPartida de la interfaz GuardadoPartida.
    override fun guardarPartida() {
        println("Partida de Aventura guardada")
        println("----------------------------------------------------------")
    }
}

// Clase Deportes, también implementa las tres interfaces, simula un juego de deportes.
class Deportes : Jugable, SonidoAmbiente, GuardadoPartida {
    override fun jugar(nombreUsuario: String) {
        println("Usuario $nombreUsuario está jugando al juego de Deportes")
    }

    override fun reproducirSonido() {
        println("Reproduciendo sonidos emocionantes de deportes...")
    }

    override fun guardarPartida() {
        println("Partida de Deportes guardada")
        println("----------------------------------------------------------")
    }
}

// Clase Estrategia, implementa las interfaces para un juego de estrategia.
class Estrategia : Jugable, SonidoAmbiente, GuardadoPartida {
    override fun jugar(nombreUsuario: String) {
        println("Usuario $nombreUsuario está jugando al juego de Estrategia")
    }

    override fun reproducirSonido() {
        println("Reproduciendo sonidos tácticos de estrategia...")
    }

    override fun guardarPartida() {
        println("Partida de Estrategia guardada")
        println("----------------------------------------------------------")
    }
}

fun main() {
    // Creación de instancias para cada tipo de juego.
    val juegoAventura = Aventura()
    val juegoDeportes = Deportes()
    val juegoEstrategia = Estrategia()

    // Demostración del uso de los métodos de cada clase.
    juegoAventura.jugar("Alice")
    juegoAventura.reproducirSonido()
    juegoAventura.guardarPartida()

    juegoDeportes.jugar("Bob")
    juegoDeportes.reproducirSonido()
    juegoDeportes.guardarPartida()

    juegoEstrategia.jugar("Carlos")
    juegoEstrategia.reproducirSonido()
    juegoEstrategia.guardarPartida()
}
