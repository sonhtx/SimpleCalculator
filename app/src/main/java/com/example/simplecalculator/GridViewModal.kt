package com.example.simplecalculator

enum class Category {
    OPERAND, OPERATOR,
}

data class GridViewModal (
    val keyName: String,
    val category: Category
)