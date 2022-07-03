package com.relsellglobal.espressouitestme

class ComputationA(private val operators: Operation) {
    fun getAddition(x: Int, y: Int): Int = operators.add(x, y)
    fun getSubtraction(x: Int, y: Int): Int = operators.subtract(x, y)
    fun getMultiplication(x: Int, y: Int): Int = operators.multiply(x, y)
    fun getDivision(x: Int, y: Int): Int = operators.divide(x, y)
}