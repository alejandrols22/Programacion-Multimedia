package EjercicioBucles21Noviembre

fun main() {
    println("Ingrese la coordenada x:")
    val x = readLine()?.toIntOrNull() ?: 0

    println("Ingrese la coordenada y:")
    val y = readLine()?.toIntOrNull() ?: 0

    // Determinar en qué cuadrante se encuentra el punto
    when {
        x > 0 && y > 0 -> println("1º Cuadrante")
        x < 0 && y > 0 -> println("2º Cuadrante")
        x < 0 && y < 0 -> println("3º Cuadrante")
        x > 0 && y < 0 -> println("4º Cuadrante")
        else -> println("El punto se encuentra en un eje")
    }
}
