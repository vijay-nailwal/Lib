package com.example.lib2.codetutor.oops_kotlin.collection16

fun main(array: Array<String>) {
    var people = listOf<Person>(
        Person("Anil", "Deshpande", "Indian", 40),
        Person("Amit", "Behl", "Indian", 26),
        Person("George", "Orwel", "UK", 50),
        Person("Hazel", "Keech", "UK", 26),
        Person("Anees", "Khan", "Pakistan", 30),
        Person("James", "Blend", "UK", 15),
    )

    //groupBy|groupingBy
//    println(people.groupBy { it.nationality })
//    println(people.groupingBy { it.nationality }.eachCount())
//    people.groupBy { it.nationality }.forEach { println("${it.key} -> ${it.value}") }

//    val groupByAge=people.groupBy { it.age >18 }
//    println(groupByAge)
    val groupingByAge = people.groupingBy { it.age > 18 }.eachCount()
//    println(groupingByAge)

    val groupByFirstAlphabet = people.groupBy { it.firstName.get(0) }
//    println(groupByFirstAlphabet)
    val groupingByFirstAlphabet = people.groupingBy { it.firstName.get(0) }.eachCount()
//    println(groupingByFirstAlphabet)

    //Transformation
    val transformedMap = people.groupBy(keySelector = { if (it.age > 18) "Major" else "Minor" },
        valueTransform = { it })
//    println(transformedMap)

//    people.groupBy(keySelector = { it.firstName + "" + it.age },
//        valueTransform = { it.firstName + " " + it.lastName }).forEach {
//        println("${it.key} -> ${it.value}")
//    }

    //fold
    println("${people.fold(0) { acc, person -> acc + person.age }}")
    val listOfNumbers = listOf<Int>(1, 2, 3, 4, 5, 6, 78, 9, 0)
    println("${listOfNumbers.fold(0) { acc, i -> acc + i }}")
    //reduce::-> reduce no need to pass initial value
    println("${listOfNumbers.reduce { acc, i -> acc + i }}")
    //aggregate->min,max,sum,avg,count
    println("sum ${listOfNumbers.sum()}")
    println("average ${listOfNumbers.average()}")
    println("min ${listOfNumbers.min()}")
    println("minOrNull ${listOfNumbers.minOrNull()}")
    println("max ${listOfNumbers.max()}")
    println("maxOrNull ${listOfNumbers.maxOrNull()}")
    println("count ${listOfNumbers.count()}")
    println("size ${listOfNumbers.size}")

}