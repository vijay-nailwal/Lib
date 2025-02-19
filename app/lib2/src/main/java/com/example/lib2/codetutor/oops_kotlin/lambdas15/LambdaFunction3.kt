package com.example.lib2.codetutor.oops_kotlin.lambdas15

fun printKeyValuePairs(keyValuePairsList: List<Pair<String,String>>, lambda:(Pair<String,String>)->Unit ): Unit{
    keyValuePairsList.forEach(lambda)
}

fun main(args:Array<String>){
    //Pair
    val nationCapital1: Pair<String,String> = Pair("India","New Delhi")
    val nationCapital2: Pair<String,String> = Pair("Pakistan","Islamabad")
    val nationCapital3: Pair<String,String> = Pair("Sri Lanka","Columbo")


    val printNationCapitals: (Pair<String, String>) -> Unit =
        { pair -> println("${pair.first}'s capital is ${pair.second}") }

    val listOfNations = listOf(nationCapital1,nationCapital2,nationCapital3)
    //passing arguments
    printKeyValuePairs(listOfNations,printNationCapitals)

    //or we can directly pass lambda
    printKeyValuePairs(listOfNations) { pair -> println("${pair.first}'s capital is ${pair.second}") }

}