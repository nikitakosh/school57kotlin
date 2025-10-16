package ru.tbank.education.school.lesson6.lection.generics

class Box<T>(val item: T)

//class Eater<in T> {
//
//    fun eat(item: T): T {
//        return item
//    }
//}


fun main() {
    val box = Box(1)
    println(box.item)
}