package com.example.lib2.codetutor.oops_kotlin.nestedclass12

class Person(
    val name: String?,
    var address: Address?
) {
    inner class Address(
        val streetName: String,
        val locality: String
    ) {
        val contextName = name

        fun displayAddress() {
            println(" ${this.contextName} resides at ${this.streetName}, ${locality}")
        }
    }
}

fun main(array: Array<String>) {
    val person1 = Person("Anil", null)
    person1.address = person1.Address("Street", "Locality")
    person1.address?.displayAddress()

    val person2 = Person("Anil", person1.address)
    person2.address?.displayAddress()

    val person3 = Person("Anil", person2.Address( "Street", "Locality"))
    val personAddress = person2.Address( "Street", "Locality")
    val person4 = Person("Anil", personAddress)

}