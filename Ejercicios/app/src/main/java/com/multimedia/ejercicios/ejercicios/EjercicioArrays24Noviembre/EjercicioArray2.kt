package EjercicioArrays24Noviembre

fun main() {
    // EJERCICIO 1: ARRAY DE VALORES ENTEROS
    val arrayValores = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    for (i in 0 until arrayValores.size step 2) {
        println(arrayValores[i])
    }

    // EJERCICIO 2: ARRAY QUE CUENTA HACIA ATRÁS
    for (i in arrayValores.size - 1 downTo 0 step 2) {
        println(arrayValores[i])
    }

    // EJERCICIO 3: ARRAY CON VALORES DE DIFERENTES TIPOS
    val arrayValores1 = arrayOf(1, "España", 2, "Francia", 3, "Alemania", 4, "Italia", 5)
    for (i in 0 until arrayValores1.size) {
        println(arrayValores1[i])
    }

    // EJERCICIO 4: ARRAY CON TIPO FLOAT
    val arrayFloat = floatArrayOf(3.5F, 2.2f)
    for (i in 0 until arrayFloat.size) {
        println(arrayFloat[i])
    }

    // EJERCICIO 5: ARRAY VACIO
    val arrayVacio = arrayOfNulls<String>(3)
    arrayVacio[0] = "Málaga"
    arrayVacio[1] = "Sevilla"
    arrayVacio[2] = "Cádiz"
    for (i in 0 until arrayVacio.size) {
        println(arrayVacio[i])
    }

    // EJERCICIO 6: ARRAYS BIDIMENSIONALES
    val array2d = arrayOf(arrayOf(3, 3, 3), arrayOf("aaa", "ccc", -1))
    for (fila in array2d) {
        for (elemento in fila) {
            println(elemento)
        }
    }

    // EJERCICIO 7: COPIAR ARRAYS Y AÑADIR DATOS AL ARRAY
    val array1 = arrayOfNulls<String>(3)
    array1[0] = "A"
    array1[1] = "B"
    array1[2] = "C"
    val array2 = array1.copyOf(array1.size + 1)
    array2[array1.size] = "D"
    println("Array1: ${array1.joinToString(", ")}")
    println("Array2: ${array2.joinToString(", ")}")

    // EJERCICIO 8: CASTEAR
    var matrizEnteros1 = arrayOf(floatArrayOf(3f, 2f, 1.4f), intArrayOf(3, 2), intArrayOf(1))
    (matrizEnteros1[0] as FloatArray).set(2, 1.5f)
    println(matrizEnteros1.contentDeepToString())

    // EJERCICIO 9: AUMENTANDO EN 1
    var matriz = arrayOf(arrayOf(3, -1, 'a', "literal", null), arrayOf("3af299", 7, false))
    (matriz[0] as Array<Any>)[1] = 4 as Any
    for (i in 0 until matriz.size) {
        for (j in 0 until matriz[i].size) {
            if (matriz[i][j] is Int) {
                (matriz[i] as Array<Any>)[j] = ((matriz[i][j] as Int).inc() as Any)
            }
        }
    }

    // Mostrar la matriz después de la modificación
    for (fila in matriz) {
        for (valor in fila) {
            print("$valor\t")
        }
        println()
    }
    
    // Mostrando todo el contenido de un array
    var matriz10 = arrayOf(arrayOf(3, -1, 'a', "literal", null), arrayOf("3af299", 7, false))
    println(matriz10.contentDeepToString())
}
