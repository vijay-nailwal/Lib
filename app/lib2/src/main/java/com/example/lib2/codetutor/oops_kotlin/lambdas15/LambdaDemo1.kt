package com.example.lib2.codetutor.oops_kotlin.lambdas15

val add: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
val add1: (Int, Int) -> Int = { a, b -> a + b }
val add2 = { a: Int, b: Int -> a + b }

val square1: (Int) -> Int = { num: Int -> num * num }
// you can use "it", if and only if lambda has single argument
val square2: (Int) -> Int = { it * it }

fun String.abbrevatge(): String {
    val splitStrings = this.split(" ", " ", ignoreCase = true)
    var abbrevation: StringBuilder? = StringBuilder("")
    for (word in splitStrings) {
        abbrevation?.append(word[0])
    }
    return abbrevation.toString().uppercase()
}

// Lambdas as Class extensions
val lambdaAbbreviate: String.() -> String = {
    val splitStrings = this.split(" ", " ", ignoreCase = true)
    var abbrevation: StringBuilder? = StringBuilder("")
    for (word in splitStrings) {
        abbrevation?.append(word[0])
    }
    abbrevation.toString().uppercase()
}

//lambda with multiple return
val lambdaAgeDescription: (Int)->String = cust_desc@ {age: Int ->
    if (age<13) return@cust_desc "Child"
    else if (age in 13..19) return@cust_desc "Teenage"
    else if (age in 20..60) return@cust_desc "Adult"
    else return@cust_desc "Senior Citizen"
}

val sampleLambda: (String, String, String) -> Unit = { fName, lName,nName-> println("${lName}, ${fName} , ${nName}" ) }

//Ignoring paramters
val ignoringParams: (String, String, String) -> Unit = { fName, lName,_-> println("${lName}, ${fName}" ) }


fun main(args: Array<String>) {
    val num1 = 10
    val num2 = 20
    println("${add(num1, num2)}")
    println("${add1(num1, num2)}")
    println("${add2(num1, num2)}")

    //usage of it, single argument notation short hand
    println("${add2.invoke(num1, num2)}")
    println("${square1.invoke(num1)}")

    val fullName = "Anil Vasant Deshpande"
    println(fullName.abbrevatge())
    println("${fullName.lambdaAbbreviate()}")

    println("${lambdaAgeDescription(10)}")

    sampleLambda("Anil","Vasant", "Deshpande")
    ignoringParams("Anil","Vasant", "Deshpande")

}