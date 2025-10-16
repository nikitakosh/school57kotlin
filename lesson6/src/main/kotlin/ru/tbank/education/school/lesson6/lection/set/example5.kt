package ru.tbank.education.school.lesson6.lection.set

fun main() {
    val set1 = setOf(1, 2, 3, 4)
    val set2 = setOf(3, 4, 5, 6)

    val union = set1 union set2
    println("Объединение: $union")  // [1, 2, 3, 4, 5, 6]

    val intersect = set1 intersect set2
    println("Пересечение: $intersect")  // [3, 4]

    val subtract = set1 subtract set2
    println("Разность: $subtract")  // [1, 2]
}