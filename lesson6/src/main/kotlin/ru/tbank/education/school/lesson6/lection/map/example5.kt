package ru.tbank.education.school.lesson6.lection.map

fun main() {
    val capitals = mapOf(
        "France" to "Paris",
        "Germany" to "Berlin"
    )

    // Безопасное получение значения
    println(capitals["France"])   // Paris
    println(capitals["Spain"])    // null

    // Значение по умолчанию
    println(capitals.getOrDefault("Spain", "Unknown"))  // Unknown

    // Или с лямбдой
    println(capitals.getOrElse("Italy") { "Not found" })
}