package com.example.lib2.codetutor.oops_kotlin.var_val_constructor1

class Person {

    lateinit var firstName: String
    lateinit var secondName: String


    init {
        println("init block executed!!!")
    }


    constructor() {
        println("primary constuctor executed!!!")
    }


    constructor(num: Int) : this() {
        println("secondary constuctor executed!!!")
    }

    constructor(name: String) : this(10) {
        println("tertiary constructor!!!")
    }

    constructor(fName: String, sName: String) : this(10) {
        firstName = fName
        secondName = sName
        println("secondary constructor!!!")
    }

    fun displayName() {
        if (this::firstName.isInitialized) {
            println("${this.firstName}")
        } else {
            println("name not initialzed!!!")
        }

    }
}

fun main(args: Array<String>) {
//    var person = Person("vijay", "gaurav")
//    println(person.firstName)
    var person = Person()
    person.displayName()
}

//1.lateinit cannot be nullable
//not allowed->lateinit var firstName: String?
//2.sequence init->primary->secondary->userdefined method executed
