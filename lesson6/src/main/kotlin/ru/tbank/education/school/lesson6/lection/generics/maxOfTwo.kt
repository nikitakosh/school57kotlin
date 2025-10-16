package ru.tbank.education.school.lesson6.lection.generics

fun <T : Comparable<T>> maxOfTwo(a: T, b: T): T {
    return if (a > b) a else b
}

//fun main() {
////    val a = 1
////    val b = 2
////    println(maxOfTwo(a, b))
//
//    val user = User("John", 1)
//    val user2 = User("Jane", 2)
//    describe(user)
//}



interface Named { val name: String }
interface Identifiable { val id: Long }

fun <T> describe(entity: T) where T : Named, T : Identifiable {
    println("${entity.name} [${entity.id}]")
}


data class User(override val name: String) : Named



