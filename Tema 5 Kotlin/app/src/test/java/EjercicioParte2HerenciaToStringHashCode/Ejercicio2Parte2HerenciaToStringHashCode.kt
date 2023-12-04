package EjercicioParte2HerenciaToStringHashCode


open class CursoEscolar(val nombreCurso: String, val calendario: String, val centro: String, val codigoIdentificador: String) {

}


class Asignatura(nombreCurso: String, calendario: String, centro: String, codigoIdentificador: String, val nombreAsignatura: String)
    : CursoEscolar(nombreCurso, calendario, centro, codigoIdentificador) {

    override fun toString(): String {
        return "Asignatura: $nombreAsignatura, Curso: $nombreCurso, Calendario: $calendario, Centro: $centro, Código: $codigoIdentificador"
    }
}

fun main() {

    val asignatura = Asignatura("Matemáticas 101", "2023-2024", "Instituto Nacional", "MATH101", "Álgebra Avanzada")


    println(asignatura)
}
