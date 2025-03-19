package com.example.lib2.codetutor.oops_kotlin.InlineClass14


inline fun <reified T> List<Any>.filterByType(): List<T> {
    return this.filterIsInstance<T>()
}

fun main() {
    val mixedList = listOf(1, "Hello", 2.5, "Kotlin", 3)
    val strings = mixedList.filterByType<String>()
    println(strings) // Output: [Hello, Kotlin]
}
