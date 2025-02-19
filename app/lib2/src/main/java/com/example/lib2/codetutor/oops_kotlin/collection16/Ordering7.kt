package com.example.lib2.codetutor.oops_kotlin.collection16

fun main(args: Array<String>) {
    val listOfString = setOf<String>("Hubli", "Bangalore", "Hyderabad")
//    println("sorted ${listOfString.sorted()}")
//    println("sortedDescending ${listOfString.sortedDescending()}")

    var people = listOf<Person>(
        Person("Anil", "Deshpande", "Indian", 40),
        Person("Amit", "Behl", "Indian", 26),
        Person("George", "Orwel", "UK", 50),
        Person("Hazel", "Keech", "UK", 26),
        Person("Anees", "Khan", "Pakistan", 30),
        Person("James", "Blend", "UK", 15),
    )
    //java way
//    people.sorted().forEach { println(it) }
//    people.toSortedSet(comparator = Person.Companion.FirstNameComparator()).forEach { println(it) }
//    people.toSortedSet(comparator = Person.Companion.LastNameComparator()).forEach { println(it) }
//    people.toSortedSet(comparator = Person.Companion.AgeComparator()).forEach { println(it) }

    //kotlin way
//    people.sortedBy { it.age }.forEach { println(it) }
//    people.sortedBy { it.firstName }.forEach { println(it) }
//    people.sortedBy { it.lastName }.forEach { println(it) }
//    people.sortedWith(compareBy { it.age }).forEach { println(it) }
//    people.reversed().forEach { println(it) }
//    people.asReversed().forEach { println(it) }
    people.shuffled().forEach { println(it) }


//    val sampleList2 = setOf<String>("Hubli","Hyderabad","Bangalore")
//    println(sampleList1.equals(sampleList2))
    /*
    people.sortedDescending().forEach { println(it) }

//    people.sortedBy { it.age }.forEach { println(it) }
//    people.sortedBy { it.lastName }.fo rEach { println(it) }
//    people.sortedBy { it.firstName }.forEach { println(it) }

    val person1 = Person("Anil","Deshpande","Indian",40)
    val  person2 = Person("Anil","Deshpande","Indian",40)*/
//
//    println(person1 == person2)
}