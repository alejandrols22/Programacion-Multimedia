package EjercicioBucles21Noviembre

fun main() {
    var suma = 0
    // Cargar 10 valores y calcular la suma y el promedio
    for (i in 1..10) {
        println("Ingrese el valor $i:")
        val valor = readLine()?.toIntOrNull() ?: 0
        suma += valor
    }

    val promedio = suma / 10.0
    println("Suma: $suma, Promedio: $promedio")
}
