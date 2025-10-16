package ru.tbank.education.school.lesson6.lection.list

fun main() {
    val list1 = listOf(1, 2, 3)
    val list2 = listOf(4, 5, 6)

    val combined = list1 + list2
    println(combined)

    val chunked = combined.chunked(3)
    println(chunked)
}