package ru.tbank.education.school.lesson6.lection.set

fun main() {
    val fruits = setOf("Apple", "Banana", "Cherry")

    println("Banana" in fruits)     // true
    println(fruits.contains("Pear")) // false
}
