package EjercicioBucles21Noviembre

fun main() {
    println("Ingrese la cantidad de piezas a procesar:")
    val cantidadPiezas = readLine()?.toIntOrNull() ?: 0
    var piezasAptas = 0

    // Procesar cada pieza y contar las que están en el rango de longitud
    for (i in 1..cantidadPiezas) {
        println("Ingrese la longitud de la pieza $i:")
        val longitud = readLine()?.toDoubleOrNull() ?: 0.0

        if (longitud in 1.20..1.30) {
            piezasAptas++
        }
    }

    println("Cantidad de piezas aptas: $piezasAptas")
}
