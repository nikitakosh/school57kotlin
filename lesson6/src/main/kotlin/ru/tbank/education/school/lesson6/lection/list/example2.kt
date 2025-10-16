package ru.tbank.education.school.lesson6.lection.list

fun main() {
    val fruits = mutableListOf("Apple", "Banana")
    fruits.add("Cherry")
    println(fruits)

    // Добавление по индексу
    fruits.add(1, "Orange")
    println(fruits)
}