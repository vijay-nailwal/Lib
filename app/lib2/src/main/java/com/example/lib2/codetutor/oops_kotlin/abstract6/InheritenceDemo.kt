package com.example.lib2.codetutor.oops_kotlin.abstract6

abstract class Animal {
    abstract val animalType: String
    abstract fun makeSound()
}

abstract class WildAnimal : Animal()

open class DomesticAnimal(override val animalType: String, open val petName: String) : Animal() {
    override fun makeSound() {
        println("DomesticAnimal")
    }
}

class Tiger(override val animalType: String) : WildAnimal() {
    override fun makeSound() {
        println("${this.animalType} Tiger")
    }
}

class Dog(override val animalType: String, override val petName: String) :
    DomesticAnimal(animalType, petName) {
    override fun makeSound() {
        println("${this.animalType} Dog")
    }
}

class Cat(override val animalType: String, override val petName: String) :
    DomesticAnimal(animalType, petName) {
    override fun makeSound() {
        println("${this.animalType} Cat")
    }
}

fun main(args: Array<String>) {
    val cat: Animal = Cat("cat", "kittty")
    val tiger: Animal = Tiger("Tiger")
    val dog: Animal = Dog("Domestic","Dog")
    val domestic: Animal = DomesticAnimal("Domestic","animal")

    cat.makeSound()
    tiger.makeSound()
    dog.makeSound()
    domestic.makeSound()
}