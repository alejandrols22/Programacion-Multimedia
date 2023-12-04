package com.multimedia.clase_01_12_23_android.ejerciciopoo2


// Clase base para representar un usuario genérico
open class Usuario(val identificador: String, val email: String) {
    open fun efectuarPedido() {
        println("$identificador efectúa un pedido estándar.")
    }
}

// Clase derivada para representar un usuario de élite, hereda de Usuario
class UsuarioElite(identificador: String, email: String, val categoria: Int) : Usuario(identificador, email) {
    override fun efectuarPedido() {
        println("$identificador efectúa un pedido como usuario de élite (Categoría $categoria).")
    }

    fun privilegiosEspeciales() {
        println("$identificador tiene privilegios especiales en promociones y eventos.")
    }
}

fun main() {
    // Crear instancias de las clases
    val usuarioNormal = Usuario("Elena", "elena@correo.com")
    val usuarioPrivilegiado = UsuarioElite("Roberto", "roberto@correo.com", 2)

    // Ejemplo de uso de métodos de las clases
    usuarioNormal.efectuarPedido()
    usuarioPrivilegiado.efectuarPedido()
    usuarioPrivilegiado.privilegiosEspeciales()

    // Ejemplo de acceso a propiedades de las clases
    println("Usuario normal: ${usuarioNormal.identificador}, Email: ${usuarioNormal.email}")
    println("Usuario élite: ${usuarioPrivilegiado.identificador}, Email: ${usuarioPrivilegiado.email}, Categoría: ${usuarioPrivilegiado.categoria}")
}
