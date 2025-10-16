package ru.tbank.education.school.lesson6.lection.list

fun main() {
    val numbers = mutableListOf(5, 3, 1, 4, 2)

    numbers.sort()
    println(numbers)  // [1, 2, 3, 4, 5]

    numbers.sortDescending()
    println(numbers)  // [5, 4, 3, 2, 1]
}