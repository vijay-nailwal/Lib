package com.example.lib2.codetutor.oops_kotlin.funwithdelegation11

interface Engine {
    fun runsOn();
    fun getTransmissionType()
}

class ElectricEngine: Engine{
    override fun runsOn() {
        println("Runs on electricity")
    }

    override fun getTransmissionType() {
        println("No Manual transmission")
    }
}

//no need to override method
class TeslaEngine (val engine: Engine): Engine by engine
/*
class TeslaEngine (val engine: Engine): Engine by engine {
    override fun getTransmissionType() {
        println("Not applicable")
    }
}
*/

fun main(array: Array<String>) {
    val  sampleEngine = TeslaEngine(ElectricEngine())
    sampleEngine.runsOn()
    sampleEngine.getTransmissionType()
}