package com.example.lib2.codetutor.oops_kotlin.lambdas15

data class College(
    val name: String,
    var affiliation: String,
    val city: String
)

fun main(array: Array<String>) {
//    Destructuring
//    val college = College("IIT","Autonomous/Deemed", "Madras")
//    val (collegeName, universityAffiliation, estCity) = college
//    println("${collegeName}, ${universityAffiliation} is in ${estCity}")

    //Pair
    val nationCapital1: Pair<String, String> = Pair("India", "New Delhi")
    val nationCapital2: Pair<String, String> = Pair("Pakistan", "Islamabad")
    val nationCapital3: Pair<String, String> = Pair("Sri Lanka", "Columbo")

    val printNationCapitals: (Pair<String, String>) -> Unit =
        { pair -> println("${pair.first}'s capital is ${pair.second}") }

    printNationCapitals(nationCapital1)
//    val listOfNations = listOf(nationCapital1, nationCapital2, nationCapital3)
    val listOfNations = listOf<Pair<String, String>>(nationCapital1, nationCapital2, nationCapital3)
    listOfNations.forEach(printNationCapitals)
    //Passing arguments
    printKeyValuePairs(listOfNations) { pair -> println("${pair.first}'s capital is ${pair.second}") }

    val listOfNumbers = listOf<Int>(1, 2, 3, 4, 56, 4, 2, 23, 4, 3445, 54, 334, 54, 3, 67, 7)
    val evenNumbers = listOfNumbers.filter { it % 2 == 0 }
    println("Numbers filtered: ${evenNumbers}")
}

