package com.example.snackbar.domain

data class Gasto (
    var descricao: String,
    var categoria: String,
    var dataHora: String,
    var valor: Double){

    override fun toString(): String {
        return "Gastos(descricao='$descricao', categoria='$categoria', dataHora='$dataHora', valor=$valor)"
    }
}