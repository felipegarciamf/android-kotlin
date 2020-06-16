package com.alura.financask.extension

fun String.limitaEmAte(caracteres: Int): String {
    if (this.length > 14) {
        val primeiroCaractere = 0
        return "${this.substring(primeiroCaractere, caracteres)} ..."
    }
    return this
}