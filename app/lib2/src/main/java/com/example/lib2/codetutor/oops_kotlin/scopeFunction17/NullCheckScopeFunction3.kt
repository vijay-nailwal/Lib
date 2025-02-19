package com.example.lib2.codetutor.oops_kotlin.scopeFunction17

import com.example.lib2.codetutor.oops_kotlin.collection16.Person

//with -> not allowed null check
//run,with, apply, let, and also -> yes null check
fun main(args: Array<String>) {
    var people: List<Person>? = listOf<Person>(
        Person("Anil", "Deshpande", "Indian", 40),
        Person("Amit", "Behl", "Indian", 26),
        Person("George", "Orwel", "UK", 50),
        Person("Hazel", "Keech", "UK", 26),
        Person("Anees", "Khan", "Pakistan", 30),
        Person("James", "Blend", "UK", 15),
    )

    var letVaraible: Person? = null
    letVaraible?.let{}
    println("Let: $letVaraible")

    var runVariable: Person? = null
    runVariable?.run {  }
    println("Run: $runVariable")

    var withVariable : Person? = null
    println("with: $withVariable")

    var applyVariable : Person? = null
    applyVariable?.apply {  }
    println("Apply: $applyVariable")

    var alsoVariable : Person? = null
    alsoVariable?.also {  }
    println("Also: $alsoVariable")

}