package com.multimedia.clase_20_11_23.primeros_pasos

fun main()
{
    print("Ingrese el sueldo del empleado:")
    var sueldo = readln().toDouble()
    if (sueldo > 3000) {
        println("Debe pagar impuestos")
        if(sueldo > 10000)
            println("tiene que pagar el 50% de sus ingresos")
        else(sueldo <10000)
            println("tiene que pagar el 25% se sus ingresos")
    }else{
        println("No pagas impuestos crack, a trabajar mas horas que la carretera no se paga sola")
    }
}