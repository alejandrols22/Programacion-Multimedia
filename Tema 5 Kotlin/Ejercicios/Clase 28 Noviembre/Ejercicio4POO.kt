package poo

class Cliente(val nombre: String, val apellidos: String, val tipo: String, val ingresos: Double) {
    fun imprimirPropiedades() {
        println("Nombre: $nombre $apellidos, Tipo: $tipo, Ingresos: $ingresos")
    }

    fun atencionCliente() {
        val atencion = if (tipo == "particular") "Oficina local" else "Oficina central"
        println("El cliente $nombre se atiende en la $atencion.")
    }
}

fun main() {
    val cliente = Cliente("Elena", "Gonzalez", "particular", 3000.0)
    cliente.imprimirPropiedades()
    cliente.atencionCliente()
    val cliente2 = Cliente("Alejandro", "Lopez", "Autonomo", 10000.0)
    cliente2.imprimirPropiedades()
    cliente2.atencionCliente()
}
