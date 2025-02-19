package com.example.lib2.codetutor.oops_kotlin.collection16

data class Rectangle(val height: Int, val width: Int) {
    val area: Int get() = height * width
}

fun firstNotNullOfDemo() {
    val rectangles = listOf(
        Rectangle(3, 4),
        Rectangle(1, 8),
        Rectangle(6, 3),
        Rectangle(4, 3),
        Rectangle(5, 7)
    )

    for (rectangle in rectangles){
        println("$rectangle area is ${rectangle.area}")
    }

    val largeArea = rectangles.firstNotNullOf { it.area.takeIf { area -> area >= 15 } }
    println(largeArea)

    val largeAreaOrNull = rectangles.firstNotNullOfOrNull { it.area.takeIf { area -> area >= 100 } }
    println(largeAreaOrNull)
}


fun main(array: Array<String>) {
    val listOfCities = listOf<String>("Hubli","Bangalore","Hyderabad","Mumbai","New Delhi","Chennai","Thiruvananthapuram","Panji")
//    println("elementAt ${listOfCities.elementAt(3)}")
//    println("elementAtOrNull ${listOfCities.elementAtOrNull(30)}")
//    println("elementAtOrElse ${listOfCities.elementAtOrElse(30){index->"no element ${index}"}}")
//    println("first ${listOfCities.first()}")
//    println("firstOrNull ${listOfCities.firstOrNull()}")//"${}"
//    println("first startsWith ${listOfCities.first{it.startsWith("H",false)}}")
//    println("Find : ${listOfCities.find { it.length > 8 }}")
//    println("Find : ${listOfCities.find { it.equals("New Delhi")}}")
//    println("FindLast : ${listOfCities.findLast { it.length > 8 }}")
//    println("random : ${listOfCities.random()}")
//
     //check existence
//    println("Contains : ${listOfCities.contains("New Delhi")}")
//    println("Contains : ${listOfCities.contains("Kolkata")}")
//    println("IsEmpty : ${listOfCities.isEmpty()}")
//    println("isNotEmpty : ${listOfCities.isNotEmpty()}")
//    println("isNullOrEmpty : ${listOfCities.isNullOrEmpty()}")

    firstNotNullOfDemo()

}


