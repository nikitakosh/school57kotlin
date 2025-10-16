package ru.tbank.education.school.lesson6.lection.map

fun main() {
    val capitals = mapOf(
        "France" to "Paris",
        "Germany" to "Berlin",
        "Italy" to "Rome"
    )

    // Обход по парам
    for ((country, city) in capitals) {
        println("$country → $city")
    }

    // Только ключи
    println(capitals.keys)

    // Только значения
    println(capitals.values)
}