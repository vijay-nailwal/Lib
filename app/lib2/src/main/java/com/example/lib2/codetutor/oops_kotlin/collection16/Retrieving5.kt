package com.example.lib2.codetutor.oops_kotlin.collection16

fun main(array: Array<String>) {
    val listOfCities = listOf<String>("Hubli","Bangalore","Hyderabad","Mumbai","New Delhi","Chennai","Thiruvananthapuram","Panji")
    //slice
    println("slice: ${listOfCities.slice(0..3)}")
    //step
    println("step: ${listOfCities.slice(0..6 step 2)}")
   //setOf
    println("setOf: ${listOfCities.slice(setOf(2,3,6))}")
    //take
    println("take: ${listOfCities.take(4)}")
    //drop
    println("drop: ${listOfCities.drop(4)}")
    println("dropWhile: ${listOfCities.dropWhile { it.get(0) >= 'A' } }")
    //takeWhile
    println("takeWhile: ${listOfCities.takeWhile { it.length >= 5 }}")
    println("takeWhile: ${listOfCities.takeWhile { it.get(0) >= 'A' }}")
    //takeLast
    println("takeLast: ${listOfCities.takeLast(4) }")
    //dropLast
    println("dropLast: ${listOfCities.dropLast(4) }")
    //takeLastWhile
    println("takeLastWhile: ${listOfCities.takeLastWhile{it.get(0) <= 'P'} }")
    //dropLastWhile
    println("dropLastWhile: ${listOfCities.dropLastWhile{it.get(0) <= 'A'} }")
    //chunked
    println("Chunked: "+listOfCities.chunked(3))
    println("Chunked fold ${listOfCities.chunked(3){ list: List<String> -> list.fold(""){acc: String, s: String -> acc + s.get(0) } }}")
    //windowed
    println("Windowed: "+listOfCities.windowed(3,3,false))
    println("Windowed: "+listOfCities.windowed(3,2,true))
}
