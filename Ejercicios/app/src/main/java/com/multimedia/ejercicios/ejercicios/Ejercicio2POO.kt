package poo

class Salario {
    var nombre: String = ""
    var ingresos: Double = 0.0

    fun inicializar(nombre: String, ingresos: Double) {
        this.nombre = nombre
        this.ingresos = ingresos
    }

    fun mostrar() {
        println("Nombre: $nombre, Ingresos: $ingresos")
    }

    fun imprimirIngresos() {
        if (ingresos >= 2000) {
            println("$nombre gana pasta gansa.")
        } else {
            println("$nombre es mileurista.")
        }
    }

    fun calcularComplemento() {
        val complemento = when {
            ingresos < 2000 -> ingresos * 0.05
            ingresos <= 3000 -> ingresos * 0.10
            else -> ingresos * 0.20
        }
        val ingresoTotal = ingresos + complemento
        println("El complemento de $nombre es $complemento , La suma total es $ingresoTotal ")
    }

    fun calcularIngresoNeto() {
        val complemento = when {
            ingresos < 2000 -> ingresos * 0.05
            ingresos <= 3000 -> ingresos * 0.10
            else -> ingresos * 0.20
        }
        val ingresoTotal = ingresos + complemento
        val incremento = ingresoTotal * 0.15
        val ingresoNeto = ingresoTotal - incremento
        println("El ingreso neto de $nombre, después de sumar y restar un 15%, es $ingresoNeto")
    }
}

fun main() {
    val salario = Salario()
    salario.inicializar("Carlos", 2500.0)
    salario.mostrar()
    salario.imprimirIngresos()
    salario.calcularComplemento()
    salario.calcularIngresoNeto()

    val salario2 = Salario()
    salario2.inicializar("Roberto", 1200.0)
    salario2.mostrar()
    salario2.imprimirIngresos()
    salario2.calcularComplemento()
    salario2.calcularIngresoNeto()
}
