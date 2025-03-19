package com.example.lib2.codetutor.oops_kotlin.Coroutines18

import kotlinx.coroutines.*

suspend fun longRunningWork(coroutineName: String, delay: Long) {
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
    async { longRunningWork("CoRoutine1", 500) }
    async { longRunningWork("CoRoutine2", 500) }
    println("Main ended")
}
//co routines always run on the same thread which is main thread.
