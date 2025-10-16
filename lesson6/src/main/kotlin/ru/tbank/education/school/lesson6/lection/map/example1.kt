package ru.tbank.education.school.lesson6.lection.map

fun main() {
    // Неизменяемый Map
    val capitals = mapOf(
        "France" to "Paris",
        "Germany" to "Berlin",
        "Italy" to "Rome"
    )
    println(capitals)

    // Изменяемый Map
    val mutableCapitals = mutableMapOf(
        "France" to "Paris",
        "Germany" to "Berlin"
    )
    println(mutableCapitals)
}