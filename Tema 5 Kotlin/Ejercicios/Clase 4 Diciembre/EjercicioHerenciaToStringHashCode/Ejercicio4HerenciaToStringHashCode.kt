package EjercicioHerenciaToStringHashCode


open class Producto2(val nombre: String, val precio: Double) {
    fun mostrarDetalle() {
        println("Producto: $nombre, Precio: $precio")
    }
}


open class Envio(nombre: String, precio: Double, val destino: String) : Producto2(nombre, precio) {
    fun calcularCostoEnvio(): Double {
        return precio * 0.10
    }

    fun mostrarDetalleEnvio() {
        mostrarDetalle()
        println("Destino: $destino, Costo de Envío: ${calcularCostoEnvio()}")
    }
}


class Factura(nombre: String, precio: Double, destino: String, val numeroFactura: String) : Envio(nombre, precio, destino) {
    fun imprimirFactura() {
        mostrarDetalleEnvio()
        println("Número de Factura: $numeroFactura")
    }
}


fun main() {
    val factura = Factura("Laptop", 1200.0, "Ciudad A", "F2023001")
    factura.imprimirFactura()
}
