package com.example.lib2.codetutor.oops_kotlin.var_val_constructor1


/**
 * Created by Vijay on 07 Feb 2025.
 */
class PersonVal2 {
    var firstName: String?
    var secondName: String?

    constructor() {
        firstName = ""
        secondName = ""
    }
}

fun main(args: Array<String>) {
    var person = PersonVal2()
    person.firstName = ""

}
