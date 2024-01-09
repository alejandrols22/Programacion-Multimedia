package EjercicioBucles21Noviembre

fun main() {
    println("Ingrese tres notas del alumno:")
    val nota1 = readLine()?.toFloatOrNull() ?: 0f
    val nota2 = readLine()?.toFloatOrNull() ?: 0f
    val nota3 = readLine()?.toFloatOrNull() ?: 0f

    val promedio = (nota1 + nota2 + nota3) / 3

    // Evaluar el promedio y mostrar el mensaje correspondiente
    when {
        promedio >= 7 -> println("Promocionado")
        promedio >= 4 -> println("Regular")
        else -> println("Reprobado")
    }
}

