package ru.tbank.education.school.lesson6.lection.map

fun main() {
    val capitals = mutableMapOf(
        "France" to "Paris",
        "Germany" to "Berlin"
    )

    // Добавление нового элемента
    capitals["Italy"] = "Rome"

    // Изменение существующего
    capitals["Germany"] = "Hamburg"

    println(capitals)
}