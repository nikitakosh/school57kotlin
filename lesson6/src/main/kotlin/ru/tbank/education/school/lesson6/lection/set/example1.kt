package ru.tbank.education.school.lesson6.lection.set

fun main() {
    // Неизменяемое множество
    val set = setOf("Apple", "Banana", "Cherry")
    println(set)

    // Изменяемое множество
    val mutableSet = mutableSetOf("Apple", "Banana")
    println(mutableSet)
}