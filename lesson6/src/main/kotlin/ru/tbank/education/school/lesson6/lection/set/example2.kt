package ru.tbank.education.school.lesson6.lection.set

fun main() {
    val fruits = mutableSetOf("Apple", "Banana")

    fruits.add("Cherry")
    println(fruits)  // [Apple, Banana, Cherry]

    // Добавляем уже существующий элемент — не изменится
    fruits.add("Apple")
    println(fruits)  // [Apple, Banana, Cherry]

    // Удаление элемента
    fruits.remove("Banana")
    println(fruits)  // [Apple, Cherry]
}