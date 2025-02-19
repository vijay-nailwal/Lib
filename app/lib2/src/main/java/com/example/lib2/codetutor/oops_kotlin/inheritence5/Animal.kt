package com.example.lib2.codetutor.oops_kotlin.inheritence5

//by default all class are sealed/final class
open class Animal {
    open fun makeSound() {
        println("Animal")
    }
}

open class WildAnimal : Animal()
open class DomesticAnimal : Animal()

class Tiger : WildAnimal() {
    override fun makeSound() {
        println("Tiger")
    }
}

class Dog : DomesticAnimal() {
    override fun makeSound() {
        println("Dog")
    }
}

class Cat : DomesticAnimal() {
    override fun makeSound() {
        println("Cat")
    }

}


fun main(args: Array<String>) {
    val dog: Dog = Dog()
    val dog1: Animal = Animal()
    val dog2: Animal = DomesticAnimal()
//    val dog: Dog = Dog()
//    val cat: Animal = Cat()
//    val cat1: Animal = DomesticAnimal()
//    val tiger: Animal = Tiger()
//    val tiger1: WildAnimal = Tiger()
//    val animal: Animal = Animal()
//
//    val domesticAnimal: Animal = DomesticAnimal()
//    val wildAnimal: Animal = WildAnimal()

    dog.makeSound()
    dog1.makeSound()
    dog2.makeSound()
//    cat.makeSound()
//    cat1.makeSound()
//    tiger.makeSound()
//    tiger1.makeSound()

//    domesticAnimal.makeSound()
//    wildAnimal.makeSound()
//    animal.makeSound()
}
