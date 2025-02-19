package com.example.lib2.codetutor.oops_kotlin.Coroutines18

import kotlinx.coroutines.*

suspend fun longRunningWork1(coroutineName: String, delay: Long) {
    println("Worker Thread Started")
    println("Thread name: " + Thread.currentThread().name + ", Thread id: ${Thread.currentThread().id} in ${coroutineName}")
    for (i in 0..9) {
        delay(delay)
        println("Remaining time left for ${Thread.currentThread().name}: " + (10 - i) + " in " + coroutineName)
    }
    println("${coroutineName} Thread ended")
}

fun main() = runBlocking {
    println("Main Started")
    println("Thread name: " + Thread.currentThread().name + ", Thread id: " + Thread.currentThread().id)
    for (i in 0..1000000) {
        async { longRunningWork1("CoRoutine1", 100 * i.toLong()) }
    }
    println("Main ended")
}
//co routines is pure programming construct there is no co-relation between number of co routines that
//you can create at the number of core that are on. thats why co routines are called light weight
// thread

