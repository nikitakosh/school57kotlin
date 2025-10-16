package ru.tbank.education.school.lesson6.lection.list

fun main() {
    val fruits = listOf("Apple", "Banana", "Cherry")

    println("Banana" in fruits)
    println(fruits.contains("Orange"))
}