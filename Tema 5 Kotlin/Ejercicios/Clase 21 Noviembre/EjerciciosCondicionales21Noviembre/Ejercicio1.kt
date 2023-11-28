package EjerciciosCondicionales21Noviembre

fun main() {
    println("Ingrese su sueldo:")
    val sueldo = readLine()?.toDoubleOrNull() ?: 0.0

    // Verificar si el sueldo supera los 3000
    if (sueldo > 3000) {
        println("Usted debe abonar impuestos.")
    } else {
        println("Usted no debe abonar impuestos.")
    }
}
