package poo

class Punto(val x: Int, val y: Int) {
    fun ubicacionCuadrante(): String {
        return when {
            x > 0 && y > 0 -> "1º Cuadrante"
            x < 0 && y > 0 -> "2º Cuadrante"
            x < 0 && y < 0 -> "3º Cuadrante"
            x > 0 && y < 0 -> "4º Cuadrante"
            else -> "En un eje"
        }
    }
}

fun main() {
    val puntos = listOf(
        Punto(1, 1),
        Punto(-1, 1),
        Punto(-1, -1),
        Punto(1, -1),
        Punto(0, 2)
    )

    puntos.forEach { punto ->
        println("El punto (${punto.x},${punto.y}) está en el ${punto.ubicacionCuadrante()}")
    }
}
