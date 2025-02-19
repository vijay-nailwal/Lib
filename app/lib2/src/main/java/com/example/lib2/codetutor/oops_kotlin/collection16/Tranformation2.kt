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

//    println(people)//1
    var transformedList = people.map { it.firstName }
//    println(transformedList)//2

    var firstNameLastNameList = people.map { "${it.firstName} ${it.lastName}" }
//    println(firstNameLastNameList)//3

    var withIndex = people.mapIndexed { index, person -> "${index} _  ${person.firstName}" }
//    println(withIndex)

    var nullValues = people.map { if (it.nationality !== "Indian") it.firstName else null }
//    println(nullValues)
    var ignoreNull = people.mapNotNull { if (it.nationality !== "Indian") it.firstName else null }
//    println(ignoreNull)


    var nameBuildMap = buildMap<String, String> {
        put("Bangaluru", "Karnataka")
        put("Chennai", "Tamilnadu")
    }
//    println(nameBuildMap.map { entry: Map.Entry<String, String> -> entry.key })
//    println(nameBuildMap.mapKeys { it.key.uppercase() })
//    println(nameBuildMap)//note: it retain the original state

    //zipping
    var cities = listOf<String>("Banglore", "Mumbai", "London", "Bristol")
//    println(cities.zip(people))
    //unzip
    val zippedCity = cities.zip(people)
//    println(zippedCity.unzip())
//    println(zippedCity.unzip().first)
//    println(zippedCity.unzip().second)

    //associate
    //val associateList = people.associate { it -> Pair(it.firstName + it.lastName + it.age, it) }
    //associateBy
    val associateList = people.associateBy { it.firstName }
//    associateList.forEach{first, second-> println("${first} -> ${second}")}

//    Flattern
    val listOfNames1 = listOf<String>("A", "B", "C")
    val listOfNames2 = listOf<String>("D", "E", "F")
    val listOfNames3 = listOf<String>("G", "H", "I")

    val listOfList = listOf<List<String>>(listOfNames1, listOfNames2, listOfNames3)
//    println(listOfList)
//    println(listOfList.flatten())//all these list put into one
//    println(listOfList.flatMap { it })
// string presentation
//    println(cities.joinToString())
//    println(cities.joinToString(separator = "|", prefix = "Starts here: ", postfix = "End here"))



}