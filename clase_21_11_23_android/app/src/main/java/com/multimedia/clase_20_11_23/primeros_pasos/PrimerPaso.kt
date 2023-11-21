package com.multimedia.clase_20_11_23.primeros_pasos

fun main(){
    var valor: Int
    var valor2 : Int
    var valor3 : Int
    var valor4 : Int
    var resultado : Int
    var resultado2 : Int
    var resultado3 : Int
    var resultado4 : Int

    valor = 100
    valor2 = 400
    valor3 = 100
    valor4 = 400

    resultado = valor + valor2
    resultado2 = valor3 * valor4
    resultado3 = valor2 - valor3
    resultado4 = valor2 / valor

    println("La suma de $valor + $valor2 es $resultado")
    println("La multiplicacion de $valor3 * $valor4 es $resultado2")
    println("La resta de $valor2 - $valor3 es $resultado3")
    println("La division de $valor2 / $valor es $resultado4")

    println(resultado===resultado2)


}