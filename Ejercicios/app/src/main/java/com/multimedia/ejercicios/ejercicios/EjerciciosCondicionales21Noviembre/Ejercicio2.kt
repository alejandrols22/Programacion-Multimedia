package EjerciciosCondicionales21Noviembre

fun main() {
    println("Ingrese el primer número entero:")
    val numero1 = readLine()?.toIntOrNull() ?: 0

    println("Ingrese el segundo número entero:")
    val numero2 = readLine()?.toIntOrNull() ?: 0

    // Comparar los dos números e imprimir el mayor
    if (numero1 > numero2) {
        println("El mayor número es: $numero1")
    } else {
        println("El mayor número es: $numero2")
    }
}
