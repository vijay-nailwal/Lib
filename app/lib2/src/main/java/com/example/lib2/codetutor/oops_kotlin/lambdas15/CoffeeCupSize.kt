package com.example.lib2.codetutor.oops_kotlin.lambdas15

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

class Order(var count: Int)

