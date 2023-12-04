package com.multimedia.clase_01_12_23_android.ejerciciopoo2

fun main() {
    val banco = Banco()
    banco.clientes[0].depositar(1000.0)
    banco.clientes[1].depositar(2000.0)
    banco.clientes[2].depositar(1500.0)

    println("Total depositado en el banco: ${banco.calcularTotalDepositos()}")
}

class Cliente(var nombre: String, var saldo: Double) {
    fun depositar(monto: Double) {
        saldo += monto
    }
}

class Banco {
    val clientes = arrayOf(Cliente("Cliente1", 0.0), Cliente("Cliente2", 0.0), Cliente("Cliente3", 0.0))

    fun calcularTotalDepositos(): Double {
        return clientes.sumOf { it.saldo }
    }
}
