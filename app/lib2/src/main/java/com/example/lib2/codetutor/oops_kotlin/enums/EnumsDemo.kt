package com.example.lib2.codetutor.oops_kotlin.enums

enum class CoffeeCupSize(val quantity: Int) {
    MEGA(210) {
        override fun getInfo(): String {
            return "You have orderd ${this.name} and it contains ${quantity}ml of coffee"
        }
    },
    LARGE(180) {
        override fun getInfo(): String {
            return "You have orderd ${this.name} and it contains ${quantity}ml of coffee"
        }
    },
    MEDIUM(150) {
        override fun getInfo(): String {
            return "You have orderd ${this.name} and it contains ${quantity}ml of coffee"
        }
    },
    SMALL(100) {
        override fun getInfo(): String {
            return "You have orderd ${this.name} and it contains ${quantity}ml of coffee"
        }
    };

    abstract fun getInfo(): String
}

class Order(var orderSize: CoffeeCupSize)

fun main(array: Array<String>) {
    val myOrder = Order(CoffeeCupSize.SMALL)
    println(myOrder.orderSize.getInfo())
    println(myOrder.orderSize.ordinal)
    println(myOrder.orderSize.name)

    when(myOrder.orderSize){
        CoffeeCupSize.MEGA -> println("This is Mega")
        CoffeeCupSize.LARGE -> println("This is LARGE")
        CoffeeCupSize.MEDIUM -> println("This is MEDIUM")
        CoffeeCupSize.SMALL -> println("This is SMALL")
    }// no need to write else case because this is the only possibilities

}