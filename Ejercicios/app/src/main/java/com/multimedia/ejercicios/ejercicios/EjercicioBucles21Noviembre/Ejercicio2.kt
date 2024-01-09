package EjercicioBucles21Noviembre

fun main() {
    do {
        println("Ingrese un número entre 0 y 999 (0 para finalizar):")
        val numero = readLine()?.toIntOrNull() ?: 0

        // Mostrar cuántos dígitos tiene el número
        when {
            numero in 0..9 -> println("El número tiene 1 dígito")
            numero in 10..99 -> println("El número tiene 2 dígitos")
            numero in 100..999 -> println("El número tiene 3 dígitos")
        }
    } while (numero != 0)
}
