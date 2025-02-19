package com.example.lib2.codetutor.oops_kotlin.getter_setter2


/**
 * Created by Vijay on 07 Feb 2025.
 */
class Person {
    var firstName: String? = null
        set(value) {
            println("setter invoked!!!")
            field = value?.toUpperCase()
        }
        get() {
            println("getter invoked!!!")
            return field?.toUpperCase()
        }

    var age: Int? = null
        set(value) {
            if (value?.compareTo(18)!! < 0) {
                throw Exception("not valid age")
            } else {
                field = value
            }
        }
        get() = field

    constructor(fName: String) {
        firstName = fName

    }
}

fun main(args: Array<String>) {
    var person = Person("vijay")
    println(person.firstName)
    person.age = 15
    println(person.age)
}