package com.example.lib2.codetutor.oops_kotlin.interface7

abstract class Animal {
    abstract val animalType: String
    abstract fun makeSound()
}

abstract class WildAnimal : Animal()

interface Climber {
    val climberOf: String
    fun climb()
}

interface Cats : Climber {
    override fun climb() {
        println(" climbs $climberOf")
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

fun main(args: Array<String>) {
    val animal: Animal = Tiger("Tiger", "huge trees")
    animal.makeSound()
    (animal as Cats).climb()
}