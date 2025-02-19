package com.example.lib2.codetutor.oops_kotlin.objectExpression10

interface Hybrid {
    fun fuelCombination()
}


open class Vehicle {
    //works with abstract class also
    val numOfWheels: Int = 4
    open fun runOn() {
        println("run on fuel")
    }
}

class ElectricVehicle : Vehicle() {
    override fun runOn() {
        println("run on electricity")
    }
}

fun main(arr: Array<String>) {

//    val electricVehicle = ElectricVehicle()
//    electricVehicle.runOn()

    // no need to create class
    val sampleVehicle1 = object {
        fun runOn() {
            println("run on electricity1" )
        }
    }
//    Any is supertype of al non-nullable objects
    println(sampleVehicle1 is Any)
    sampleVehicle1.runOn()


    val sampleVehicle2 = object : Vehicle(), Hybrid {
        override fun runOn() {
            println("run on electricity2 ${numOfWheels}")
        }

        override fun fuelCombination() {
            println("Electricity is bio fuel")
        }

        fun onMoreFunction() {
            println("onMoreFunction")
        }
    }
    println(sampleVehicle2 is Vehicle)
    sampleVehicle2.runOn()
    sampleVehicle2.fuelCombination()
    sampleVehicle2.onMoreFunction()
}