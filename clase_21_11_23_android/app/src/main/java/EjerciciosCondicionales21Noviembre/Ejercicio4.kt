package EjerciciosCondicionales21Noviembre

fun main() {
    println("Ingrese el primer valor entero:")
    val valor1 = readLine()?.toIntOrNull() ?: 0

    println("Ingrese el segundo valor entero:")
    val valor2 = readLine()?.toIntOrNull() ?: 0

    // Almacenar el mayor de los dos valores en otra variable y mostrarlo
    val mayor = if (valor1 > valor2) valor1 else valor2
    println("El mayor valor es: $mayor")
}
