class PersonaDelMundo(val nombre: String, val apellidos: String, val edad: Int?) {

    // Constructor secundario que no asigna una edad
    constructor(nombre: String, apellidos: String) : this(nombre, apellidos, null)

    fun imprimirInformacion() {
        val infoEdad = edad?.toString() ?: "Edad no especificada"
        println("$nombre $apellidos, Edad: $infoEdad")
    }
}

fun main() {
    val persona1 = PersonaDelMundo("Carlos", "Gomez", 35)
    val persona2 = PersonaDelMundo("Sofia", "Martinez")

    persona1.imprimirInformacion()
    persona2.imprimirInformacion()
}

