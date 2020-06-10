package com.alura.financask.extension

import java.text.SimpleDateFormat
import java.util.*

fun Calendar.formataParaBrasileiro(): String {
    val formatoBrasileiro = "dd/MM/yyyy"
    val simpleDateFormat = SimpleDateFormat(formatoBrasileiro)
    val dataFormatada = simpleDateFormat.format(this.time)
    return dataFormatada
}