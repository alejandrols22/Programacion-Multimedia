package EjercicioBucles21Noviembre

fun main() {
    var alumnosCon7oMas = 0
    var alumnosConMenosDe7 = 0

    // Leer 10 notas de alumnos y contar cuántos tienen notas >= 7 y cuántos < 7
    for (i in 1..10) {
        println("Ingrese la nota del alumno $i:")
        val nota = readLine()?.toFloatOrNull() ?: 0f

        if (nota >= 7) {
            alumnosCon7oMas++
        } else {
            alumnosConMenosDe7++
        }
    }

    println("Alumnos con notas >= 7: $alumnosCon7oMas")
    println("Alumnos con notas < 7: $alumnosConMenosDe7")
}
