package com.multimedia.clase_28_11_23_android.ejercicios

fun numeroEnCastellano(num: Int): String {
    return when (num) {
        1 -> "uno"
        2 -> "dos"
        3 -> "tres"
        4 -> "cuatro"
        5 -> "cinco"
        else -> "error"
    }
}
