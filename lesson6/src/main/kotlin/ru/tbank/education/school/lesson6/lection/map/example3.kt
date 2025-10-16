package ru.tbank.education.school.lesson6.lection.map

fun main() {
    val capitals = mapOf(
        "France" to "Paris",
        "Germany" to "Berlin"
    )

    println("France" in capitals)       // true
    println("Spain" in capitals)        // false

    println(capitals.containsKey("Germany")) // true
    println(capitals.containsValue("Paris")) // true
}