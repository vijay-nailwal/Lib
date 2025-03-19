package com.example.lib2.codetutor.oops_kotlin.scopeFunction17

import com.example.lib2.codetutor.oops_kotlin.collection16.Person

//let, run and with-> result or object/result
//apply and also-> always return an object

fun main(args: Array<String>) {
    var people: List<Person>? = listOf<Person>(
        Person("Anil", "Deshpande", "Indian", 40),
        Person("Amit", "Behl", "Indian", 26),
        Person("George", "Orwel", "UK", 50),
        Person("Hazel", "Keech", "UK", 26),
        Person("Anees", "Khan", "Pakistan", 30),
        Person("James", "Blend", "UK", 15),
    )
    var letVaraible = Person("James", "Blend", "UK", 15).let {
//        it.firstName + it.age//return result
        return@let it.firstName + it.age//more readable form return result
//        it//return object
    }
    println("Let: $letVaraible")

    var runVariable = Person("James", "Blend", "UK", 15).run {
//        this.firstName + this.age
        return@run firstName + age
//        this
    }
    println("Run: $runVariable")

    var withVariable = with(Person("James", "Blend", "UK", 15)) {
//        this.firstName + this.age
        return@with firstName + age
//        this
    }
    println("with: $withVariable")

    var applyVariable = Person("James", "Blend", "UK", 15).apply {
//        this.firstName + this.age
        return@apply// dont write anything with return
//        this
//        this.nationality=this.nationality?.reversed()
    }
    println("Apply: $applyVariable")

    var alsoVariable = Person("James", "Blend", "UK", 15).also {
//        it.firstName + it.age
//        it
        return@also
//        it.nationality=it.nationality?.reversed()

    }
    println("Also: $alsoVariable")
}