package EjercicioHerenciaToStringHashCode


open class Vehiculo(val marca: String, val modelo: String) {
    open fun acelerar() {
        println("Acelerando el vehículo.")
    }

    open fun frenar() {
        println("Frenando el vehículo.")
    }

    open fun conducir() {
        println("Conduciendo el vehículo.")
    }
}


class Coche(marca: String, modelo: String, val numeroPuertas: Int) : Vehiculo(marca, modelo) {
    override fun conducir() {
        super.conducir()
        println("Conduciendo el coche. ¡Cuidado con las curvas!")
        println("Número de puertas del coche: $numeroPuertas")
    }
}


class Motocicleta(marca: String, modelo: String, val tipo: String) : Vehiculo(marca, modelo) {
    fun hacerCaballito() {
        println("Haciendo un caballito con la motocicleta.")
    }

    override fun conducir() {
        super.conducir()
        println("Tipo de motocicleta: $tipo")
    }
}


fun main() {
    val coche = Coche("Toyota", "Corolla", 4)
    coche.acelerar()
    coche.frenar()
    coche.conducir()

    println()

    val motocicleta = Motocicleta("Ducati", "Panigale", "Deportiva")
    motocicleta.acelerar()
    motocicleta.frenar()
    motocicleta.conducir()
    motocicleta.hacerCaballito()


}
