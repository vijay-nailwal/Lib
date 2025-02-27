package com.example.lib2.kunal.dsa.array1.example

fun main() {
    var intArray = arrayOf(1, 2, 3, 4)
    var stringArray = arrayOf("a", "b", "C")
    /*for (i in intArray) {
        print(i)
    }*/
//    println()
    //with index
    /*for ((i, e) in intArray.withIndex()) {
        println("$i, ->  $e")
    }*/

//    input array int
    val nums = readLine()
    println("You entered: " + arrayOf(nums).contentToString())
}
