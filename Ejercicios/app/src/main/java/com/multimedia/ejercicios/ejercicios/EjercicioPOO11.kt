class Operaciones {

    fun ejecutar() {
        println("Ingrese el primer número entero:")
        val num1 = readLine()!!.toInt()
        println("Ingrese el segundo número entero:")
        val num2 = readLine()!!.toInt()

        val suma = realizarSuma(num1, num2)
        val producto = realizarProducto(num1, num2)

        println("La suma de $num1 y $num2 es: $suma")
        println("El producto de $num1 y $num2 es: $producto")
    }

    private fun realizarSuma(a: Int, b: Int): Int {
        return a + b
    }

    private fun realizarProducto(a: Int, b: Int): Int {
        return a * b
    }
}

fun main() {
    val operaciones = Operaciones()
    operaciones.ejecutar()
}
