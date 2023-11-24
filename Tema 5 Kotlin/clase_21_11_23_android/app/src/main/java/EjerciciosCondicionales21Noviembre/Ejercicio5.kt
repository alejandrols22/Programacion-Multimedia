package EjerciciosCondicionales21Noviembre

fun main() {
    println("Ingrese un valor entero:")
    val numero = readLine()?.toIntOrNull() ?: 0

    // Calcular el cuadrado o el cubo según si el número es par o impar
    if (numero % 2 == 0) {
        val cuadrado = numero * numero
        println("El cuadrado de $numero es $cuadrado")
    } else {
        val cubo = numero * numero * numero
        println("El cubo de $numero es $cubo")
    }
}
