package EjerciciosCondicionales21Noviembre

fun main() {
    println("Ingrese tres notas del alumno:")
    val nota1 = readLine()?.toFloatOrNull() ?: 0f
    val nota2 = readLine()?.toFloatOrNull() ?: 0f
    val nota3 = readLine()?.toFloatOrNull() ?: 0f

    val promedio = (nota1 + nota2 + nota3) / 3

    // Evaluar el promedio y mostrar el mensaje correspondiente
    when {
        promedio < 5 -> println("SUSPENSO")
        promedio == 5f -> println("SUFICIENTE")
        promedio == 6f -> println("BIEN")
        promedio in 7f..8f -> println("NOTABLE")
        promedio in 9f..10f -> println("SOBRESALIENTE")
    }
}
