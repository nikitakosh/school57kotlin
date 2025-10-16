package ru.tbank.education.school.lesson6.lection.list

fun main() {
    val words = listOf("apple", "banana", "apricot", "blueberry", "cherry")

    val grouped = words.groupBy { it.first() }
    println(grouped)
}