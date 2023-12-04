package EjercicioHerenciaToStringHashCode


open class Empresa(val nombre: String, val ubicacion: String) {
    fun realizarOperacionesGenerales() {
        println("Realizando operaciones generales de la empresa $nombre.")
    }
}


class Empleado(nombre: String, ubicacion: String, val puesto: String) : Empresa(nombre, ubicacion) {
    fun trabajar() {
        println("$nombre, empleado como $puesto, trabajando en la empresa.")
    }
}


class Producto(nombre: String, ubicacion: String, val categoria: String) : Empresa(nombre, ubicacion) {
    fun producir() {
        println("$nombre, producto de la categoría $categoria, en producción.")
    }
}


class Cliente(nombre: String, ubicacion: String, val tipo: String) : Empresa(nombre, ubicacion) {
    fun comprar() {
        println("$nombre, cliente de tipo $tipo, realizando una compra.")
    }
}


fun main() {
    val empleado = Empleado("Laura Delgado", "Desarrollador", "Madrid")
    empleado.realizarOperacionesGenerales()
    empleado.trabajar()

    val producto = Producto("Portátil HP OMNIO", "Electrónica", "Madrid")
    producto.realizarOperacionesGenerales()
    producto.producir()

    val cliente = Cliente("Microsoft", "Empresarial", "Redmond")
    cliente.realizarOperacionesGenerales()
    cliente.comprar()


}
