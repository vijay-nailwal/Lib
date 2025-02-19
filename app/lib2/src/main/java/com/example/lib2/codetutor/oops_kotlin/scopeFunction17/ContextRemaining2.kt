package com.example.lib2.codetutor.oops_kotlin.scopeFunction17

import com.example.lib2.codetutor.oops_kotlin.collection16.Person

//run,with and apply -> not allowed remaining context
//let, also -> yes renaming context
fun main(args: Array<String>) {
    var people: List<Person>? = listOf<Person>(
        Person("Anil", "Deshpande", "Indian", 40),
        Person("Amit", "Behl", "Indian", 26),
        Person("George", "Orwel", "UK", 50),
        Person("Hazel", "Keech", "UK", 26),
        Person("Anees", "Khan", "Pakistan", 30),
        Person("James", "Blend", "UK", 15),
    )

    var letVaraible = Person("James", "Blend", "UK", 15).let { currentPerson ->
        return@let currentPerson.firstName + currentPerson.age//return result
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

    var alsoVariable = Person("James", "Blend", "UK", 15).also { currentPerson ->
         currentPerson.nationality = currentPerson.nationality?.reversed()
    }
    println("Also: $alsoVariable")

}