package poo

class Estudiante {
    var nombre: String = ""
    var asignatura: String = ""
    var puntos: Int = 0

    fun inicializar(nombre: String, asignatura: String, puntos: Int) {
        this.nombre = nombre
        this.asignatura = asignatura
        this.puntos = puntos
    }

    fun mostrarNota() {
        val nota = when {
            puntos < 50 -> "Suspenso"
            puntos < 60 -> "Suficiente"
            puntos < 70 -> "Aprobado"
            puntos < 80 -> "Bien"
            puntos < 90 -> "Notable"
            else -> "Sobresaliente"
        }
        println("El estudiante $nombre tiene un $nota en $asignatura")
    }
}

fun main() {
    val estudiante = Estudiante()
    estudiante.inicializar("Laura", "Matemáticas", 85)
    estudiante.mostrarNota()
    val estudiante2 = Estudiante()
    estudiante2.inicializar("Juan Carlos", "Lengua",60)
    estudiante2.mostrarNota()
}
