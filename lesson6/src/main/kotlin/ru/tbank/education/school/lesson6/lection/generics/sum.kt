package ru.tbank.education.school.lesson6.lection.generics

fun <T : Number> sum(a: T, b: T): Double {
    return a.toDouble() + b.toDouble()
}

fun main() {
    val a = ""
    val b = 2
}