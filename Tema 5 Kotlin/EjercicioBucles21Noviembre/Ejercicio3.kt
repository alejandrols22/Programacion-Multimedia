package EjercicioBucles21Noviembre

fun main() {
    var suma = 0.0
    var contador = 0

    do {
        println("Ingrese un número (0 para finalizar):")
        val numero = readLine()?.toDoubleOrNull() ?: 0.0

        if (numero != 0.0) {
            suma += numero
            contador++
        }
    } while (numero != 0.0)

    val promedio = if (contador > 0) suma / contador else 0.0
    println("El promedio es: $promedio")
}
