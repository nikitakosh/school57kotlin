package ru.tbank.education.school.lesson6.lection.list

fun main() {
    // Неизменяемый список
    val list = listOf("Apple", "Banana", "Cherry")
    println(list)

    // Изменяемый список
    val mutableList = mutableListOf("Apple", "Banana")
    println(mutableList)
}