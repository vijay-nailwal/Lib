package com.example.lib2.codetutor.oops_kotlin.objectExpression10

interface Hybrid1 {
    fun fuelCombination()
}



abstract class Vehicle1() {
    val numOfWheels: Int = 4
    abstract fun runOn()
//companion oibject is define inside a class and always associated in that class
    companion object {
        fun getVehicle(): Vehicle1 {
            return object : Vehicle1(), Hybrid1 {
                override fun runOn() {
                    println("runs on electricity ${numOfWheels}")
                }

                override fun fuelCombination() {
                    print("Electricity and biofuel")
                }
                fun oneMoreFunctionality() {
                }
            }
        }
        val TAG: String = "Vehicle"
    }
}

fun main(array: Array<String>) {
    val sampleVehicle = Vehicle1.getVehicle()
    Vehicle1.TAG
    println(sampleVehicle is Any)
    sampleVehicle.runOn()

}