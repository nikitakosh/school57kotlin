package ru.tbank.education.school.lesson6.lection

data class Person(val name: String, val age: Int)

fun main() {
    val person1 = Person("Alice", 30)
    val person2 = Person("Alice", 30)

    println(person1.hashCode() == person2.hashCode())
//    println(person1.equals(person2)) // false
//
//    println(person1 === person2)
}