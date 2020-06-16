package com.alura.financask.extension

import java.math.BigDecimal
import java.util.Locale

fun BigDecimal.formataParaBrasileiro(): String {
    val formatoBrasileiro = java.text.DecimalFormat
        .getCurrencyInstance(Locale("pt", "br"))

    val valor = formatoBrasileiro
        .format(this).replace("R$", "R$ ")

    return valor;
}