package com.example.lib2.codetutor.oops_kotlin.collection16

import com.example.lib2.codetutor.oops_kotlin.interface7.Climber


fun main(array: Array<String>) {
    var people = listOf<Person>(
        Person("Anil", "Deshpande", "Indian", 40),
        Person("Amit", "Behl", "Indian", 26),
        Person("George", "Orwel", "UK", 50),
        Person("Hazel", "Keech", "UK", 26),
        Person("Anees", "Khan", "Pakistan", 30),
        Person("James", "Blend", "UK", 15),
    )

    var nameBuildMap = buildMap<String, String> {
        put("Bangaluru", "Karnataka")
        put("Mumbai", "Maharashtra")
        put("Chennai", "Tamilnadu")
        put("Panjim", "Goa")
        put("Hyderabad", "Telangana")
        put("Chennai", "Tamil Nadu")
    }

    val listOfNames1 = listOf<String>("A", "B", "C")
    val listOfNames2 = listOf<String>("D", "E", "F")
    val listOfNames3 = listOf<String>("G", "H", "I")


//    val listOfCities = listOf<String>("Bangalore","Hyderabad","Mumbai","New Delhi","Chennai","Thiruvananthapuram","Panji")
//Filtering
//    people.filter { it.nationality.equals("Indian") }.forEach { println(it) }
//    people.filter { it.age < 18  }.forEach { println(it) }
//    nameBuildMap.filter { entry -> entry.key.equals("Bangaluru")}.forEach{t,u -> println("${t} ,${u}") }
//    nameBuildMap.filter { entry -> entry.key.equals("Bangal>18uru")}.forEach{t,u -> println("${t} ,${u}") }
//    people.filterIndexed{index, person -> index%2 == 0 && person.age > 18}.forEach{println(it)}
// partition
//    people.partition { it.age > 18 }.first.forEach { println(it) }
    people.partition { it.age > 18 }.second.forEach { println(it) }
    println(people.partition { it.age > 18 })


//Filter
//    people.filterNot{it.age < 18}.forEach{ println(it) }
//FilterIsInstance
    val animals = listOf<Animal>(
        Cat("Cat", "kitty", "Houses"),
        Dog("Dog", "Dobby"),
        Tiger("Tiger", "Trees")
    )

//    animals.filterIsInstance<Cat>().forEach { println(it.petName) }
//    animals.filterIsInstance<DomesticAnimal>().forEach { println(it.petName) }

    //Test Predicates--> any, none, all
//    println("${people.any{it.nationality.equals("kenya")}}")
//    println("${people.none{it.nationality.equals("kenya")}}")
//    println("${people.all{it.age >= 18}}")

//    plus and minus

    val addedList = listOfNames1 + listOfNames2
//    println(addedList)
//    println(addedList+"J")
//    println(addedList-"D")
//    println(addedList-listOfNames2)
}


abstract class Animal {
    abstract val animalType: String
    abstract fun makeSound()
}

open class DomesticAnimal(override val animalType: String, open val petName: String) : Animal() {
    override fun makeSound() {
        println("DomesticAnimal")
    }
}

abstract class WildAnimal : Animal()

interface Cats : Climber {
    override fun climb() {
        println(" climbs $climberOf")
    }
}


class Cat(
    override val animalType: String,
    override val petName: String,
    override val climberOf: String
) :
    DomesticAnimal(animalType, petName), Cats {
    override fun makeSound() {
        println("${this.petName} ,${this.animalType} ")
    }

    override fun climb() {
        println("$animalType climbs $climberOf")
    }
}

class Dog(
    override val animalType: String,
    override val petName: String
) :
    DomesticAnimal(animalType, petName) {
    override fun makeSound() {
        println("${this.petName} ,${this.animalType} ")
    }
}

class Tiger(override val animalType: String, override val climberOf: String) : WildAnimal(), Cats {
    override fun makeSound() {
        println("${this.animalType} makes roaring sound")
    }

    override fun climb() {
        println("$animalType climbs $climberOf")
    }
}
