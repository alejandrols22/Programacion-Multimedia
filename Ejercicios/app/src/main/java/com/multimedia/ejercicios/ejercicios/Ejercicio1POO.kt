package poo

class Persona {
    var nombre: String = ""
    var apellidos: String = ""
    var edad: Int = 0
    var ciudad: String = ""
    var dirrecion: String = ""
    var codigoPostal: Int = 0

    fun inicializar(nombre: String, apellidos: String, edad: Int, ciudad: String, dirrecion: String, codigoPostal: Int) {
        this.nombre = nombre
        this.apellidos = apellidos
        this.edad = edad
        this.ciudad = ciudad
        this.dirrecion = dirrecion
        this.codigoPostal = codigoPostal
    }

    fun imprimir() {
        println("Nombre: $nombre $apellidos tiene una edad de $edad, vive en $ciudad, $dirrecion, $codigoPostal")
    }

    fun esMayorEdad() {
        if (edad >= 18) {
            println("Es mayor de edad $nombre")
        } else {
            println("No es mayor de edad $nombre")
        }
    }
}

fun main() {

    val persona = Persona()
    persona.inicializar("Juan", "Pérez", 30, "Málaga", "Playa Virginia, Nº1 2ªA", 29018)
    persona.imprimir()
    persona.esMayorEdad()
    val persona2: Persona
    persona2 = Persona()
    persona2.inicializar("Ana", "Segovia",50, "Mádrid", "Santigago Bernabeu nº4", 87623)
    persona2.imprimir()
    persona2.esMayorEdad()

}
