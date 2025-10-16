package ru.tbank.education.school.lesson6.lection.set

fun main() {
    val numbers = setOf(1, 2, 3, 4, 5, 6)

    val even = numbers.filter { it % 2 == 0 }.toSet()
    println("Четные: $even")

    val squares = numbers.map { it * it }.toSet()
    println("Квадраты: $squares")
}