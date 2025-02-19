package com.example.lib2.codetutor.oops_kotlin.function3


/**
 * Created by Vijay on 07 Feb 2025.
 */
class Person {
    var firstName: String? = null
    var lastName: String? = null


    fun displayName(): String {
        return "${this.firstName} ${this.lastName}"
    }

    fun demoFunction(param1: String, param2: String): String {
        return "${param1} ,${param2}"
    }

    fun changeParam(param1: String, param2: String): String {
//        because it consider val u cannot reassign it
//        param1="" -->not allowed
//        must  declare a temp var then modify it
        var tempVar = param1
        tempVar = "some other name"
        return "${tempVar} ,${param2}"
    }

    fun defaultValue(param1: String = "some default value", param2: String) {
        println("${param1} ${param2}")
    }

    //===========function overloading=========================

    fun displayPerson(): String {
        return "${this.firstName} ${this.lastName}"
    }

    fun displayPerson(param: String): String {
        return param
    }


}

fun main(args: Array<String>) {
    var person = Person()
//    println(person.displayName())
//    println(person.demoFunction("v", "n"))
//    println(person.changeParam("v", "n"))
    println(person.defaultValue(param2 = "param2"))
    println(person.displayPerson())
    println(person.displayPerson("vijay"))
}