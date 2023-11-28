package EjercicioArrays24Noviembre

fun main() {
    //Ejercicio 1: Array de valores enteros
    val arrayValores = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    for (i in 0 until arrayValores.size step 2) {
        println(arrayValores[i])
    }
    var arrayValores2 = arrayOf("A", "B", "C")
    for (i in 0 until arrayValores2.size) {
        println(arrayValores2[i])
    }
    var arrayValores3 = arrayOf("Laura", 30, "Ana", 24)
    for (i in 0 until arrayValores3.size) {
        println(arrayValores3[i])

        // Ejerccio 2 : Array que cuenta hacia atras
        for (i in arrayValores.size - 1 downTo 0 step 2) {
            println(arrayValores[i])
        }

        // Ejercicio3 : Array con valores de diferente tipo
        val arrayValores1 = arrayOf("España", 2, "Francia", 3, "Alemania", 4, "Italia", 5)
        for (i in arrayValores1.indices) {
            println(arrayValores1[i])
        }
        // EJERCICIO 4: ARRAY CON TIPO FLOAT
        val arrayFloat = floatArrayOf(3.5F, 2.2F)
        for (i in 0 until arrayFloat.size step 1) {
            println(arrayFloat[i])
        }

        // EJERCICIO 5: ARRAY VACÍO
        val arrayVacio = arrayOfNulls<String>(3) // La longitud del array es 3.
        arrayVacio[0] = "Málaga"
        arrayVacio[1] = "Sevilla"
        arrayVacio[2] = "Cádiz"

        for (elemento in arrayVacio) {
            println(elemento)
        }

        // EJERCICIO 6: AGRANDAR UN ARRAY
        val array1 = arrayOfNulls<String>(3)

        // EJERCICIO 7: COPIAR ARRAYS Y AÑADIR DATOS AL ARRAY
        array1[0] = "A"
        array1[1] = "B"
        array1[2] = "C"

        // Copiar array1 a array2 y agregar un elemento más
        val array2 = array1.copyOf(array1.size + 1)
        array2[array1.size] = "D"

        // Mostrar array1 y array2 por consola USANDO JOOINTOSTRING
        println("Array1: ${array1.joinToString(", ")}")
        println("Array2: ${array2.joinToString(", ")}")

     }
        // Ejercicio con países
        val arrayPaises1 = arrayOf("ALEMANIA", "FRANCIA", "ITALIA")
        val arrayPaises2 = arrayPaises1.copyOf(newSize = arrayPaises1.size + 2)
        arrayPaises2[3] = "ESPAÑA"
        arrayPaises2[4] = "GRECIA"

        println("ArrayPaises1: ${arrayPaises1.joinToString()}")
        println("ArrayPaises2: ${arrayPaises2.joinToString()}")

        // Ejercicio con nombres de empresas
        val arrayEmpresa1 = arrayOfNulls<String>(5)
        arrayEmpresa1[0] = "Microsoft"
        arrayEmpresa1[1] = "Meta"
        arrayEmpresa1[2] = "Apple"

        val arrayEmpresa2 = arrayOf("SAMSUNG", "LENOVO", "XIAOMI", "INTEL", "AMD")

        println("ArrayEmpresa1: ${arrayEmpresa1.joinToString()}")
        println("ArrayEmpresa2: ${arrayEmpresa2.joinToString()}")

        // Ejercicio con string e int
        val arrayMultitipo1 = arrayOf<Any>(1, "table", 2, "Monitor")
        val arrayMultitipo2 = arrayMultitipo1.copyOf(newSize = arrayMultitipo1.size + 4)
        arrayMultitipo2[4] = 3
        arrayMultitipo2[5] = "Portatil"
        arrayMultitipo2[6] = 4
        arrayMultitipo2[7] = "Móvil"

        println("ArrayMultitipo1: ${arrayMultitipo1.joinToString()}")
        println("ArrayMultitipo2: ${arrayMultitipo2.joinToString()}")

    // Ejemplo de un array de enteros
    val numeros = arrayOf(10, 20, 30, 40, 50)

    // Ejercicio 1: Suma de elementos
    val suma = numeros.sum()
    println("La suma de los elementos es: $suma")

    // Ejercicio 2: Promedio de elementos
    val promedio = numeros.average()
    println("El promedio de los elementos es: $promedio")

    // Ejercicio 3: Buscar elemento
    val elementoABuscar = 30 
    val posicion = numeros.indexOf(elementoABuscar)
    if (posicion >= 0) {
        println("El elemento $elementoABuscar se encontró en la posición: $posicion")
    } else {
        println("El elemento $elementoABuscar no se encontró en el array.")
    }

    // Ejercicio bidiomensionales
    println("Ejercicio 6 *")
    val array2d = arrayOf(arrayOf(1, 2, 3), arrayOf("aaa", "ccc", "-"))

    for (fila in array2d) {
        for (elemento in fila) {
            println(elemento)
        }
    }
    // Crear una matriz bidimensional de enteros
    var matrizEnteros = arrayOf(
        intArrayOf(0, 1, 2),    // [0]
        intArrayOf(3, 2, 1),    // [1]
        intArrayOf(4, 5, 6)     // [2]
    )

    // Mostrar el valor original
    println("Valor original: ${matrizEnteros[0][2]}")

    // Cambiar el valor en la posición [0][2] a 8 usando indexación directa
    matrizEnteros[0][2] = 8
    println("Valor cambiado: ${matrizEnteros[0][2]}")

    // Cambiar el valor en la posición [0][2] a 8 usando el método set
    matrizEnteros[0].set(2, 8)
    println("Valor cambiado con set: ${matrizEnteros[0][2]}")

    // Datos nuevos para repetir el ejercicio
    val nuevosDatos = arrayOf(
        Pair(0, 2) to 50, // Cambiar el valor en [0][2] a 50
        Pair(1, 2) to 110, // Cambiar el valor en [1][2] a 110
        Pair(2, 1) to 30 // Cambiar el valor en [2][1] a 30
    )

    // Repetir el ejercicio con los nuevos datos
    for ((posicion, valor) in nuevosDatos) {
        // Cambiar el valor usando el método tradicional
        matrizEnteros[posicion.first][posicion.second] = valor
        println("Valor en [${posicion.first}][${posicion.second}] cambiado a $valor con método tradicional")

        // Cambiar el valor usando el método set

        matrizEnteros[posicion.first].set(posicion.second, valor)
        println("Valor en [${posicion.first}][${posicion.second}] cambiado a $valor con método set")
    }
}
