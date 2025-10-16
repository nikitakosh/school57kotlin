package ru.tbank.education.school.lesson6.lection.map

fun main() {
    val prices = mapOf(
        "Apple" to 100,
        "Banana" to 60,
        "Cherry" to 150
    )

    // Фильтрация
    val expensive = prices.filter { it.value > 100 }
    println(expensive)

    // Преобразование значений
    val withDiscount = prices.mapValues { it.value * 0.9 }
    println(withDiscount)
}