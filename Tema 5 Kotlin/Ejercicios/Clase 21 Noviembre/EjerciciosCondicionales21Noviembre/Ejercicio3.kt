package EjerciciosCondicionales21Noviembre

fun main() {
    println("Ingrese el primer valor entero:")
    val valor1 = readLine()?.toIntOrNull() ?: 0

    println("Ingrese el segundo valor entero:")
    val valor2 = readLine()?.toIntOrNull() ?: 0

    // Comparar los valores y realizar las operaciones correspondientes
    if (valor1 < valor2) {
        val suma = valor1 + valor2
        val resta = valor1 - valor2
        println("Suma: $suma, Resta: $resta")
    } else {
        val producto = valor1 * valor2
        val division = valor1.toDouble() / valor2.toDouble()
        println("Producto: $producto, División: $division")
    }
}
