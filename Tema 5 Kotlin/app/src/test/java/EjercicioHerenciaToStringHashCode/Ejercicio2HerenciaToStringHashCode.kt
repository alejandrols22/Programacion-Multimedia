package EjercicioHerenciaToStringHashCode


open class ProductoInformatico(val nombre: String, val precio: Double) {
    fun encender() {
        println("$nombre encendido.")
    }

    fun apagar() {
        println("$nombre apagado.")
    }

    open fun ejecutar() {
        println("$nombre ejecutando operaciones generales.")
    }
}


class Laptop(nombre: String, precio: Double, val marca: String) : ProductoInformatico(nombre, precio) {
    override fun ejecutar() {
        super.ejecutar()
        println("Marca de la laptop: $marca")
    }
}


class Impresora(nombre: String, precio: Double, val tipo: String) : ProductoInformatico(nombre, precio) {
    fun imprimir() {
        println("$nombre imprimiendo documento.")
    }

    override fun ejecutar() {
        super.ejecutar()
        println("Tipo de impresora: $tipo")
    }
}


fun main() {
    val laptop = Laptop("HP Envy", 999.99, "HP")
    laptop.encender()
    laptop.apagar()
    laptop.ejecutar()

    val impresora = Impresora("Epson EcoTank", 299.99, "Inyección de tinta")
    impresora.encender()
    impresora.apagar()
    impresora.ejecutar()
    impresora.imprimir()


}
