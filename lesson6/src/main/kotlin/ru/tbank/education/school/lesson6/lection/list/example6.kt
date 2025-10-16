package ru.tbank.education.school.lesson6.lection.list

fun main() {
    val fruits = listOf("Apple", "Banana", "Cherry")

    for ((index, value) in fruits.withIndex()) {
        println("$index: $value")
    }

    // Получение по индексу
    println(fruits[1])  // Banana
}