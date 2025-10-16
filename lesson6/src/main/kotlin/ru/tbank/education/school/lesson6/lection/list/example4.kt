package ru.tbank.education.school.lesson6.lection.list

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)

    // Фильтрация
    val even = numbers.filter { it % 2 == 0 }
    println(even)

    // Преобразование
    val squares = numbers.map { it * it }
    println(squares)
}