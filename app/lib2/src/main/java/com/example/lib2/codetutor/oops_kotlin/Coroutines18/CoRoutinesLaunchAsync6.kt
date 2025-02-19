package com.example.lib2.codetutor.oops_kotlin.Coroutines18

import kotlinx.coroutines.*

suspend fun longRunningWork4(coroutineName: String, delay: Long) {
    println("${coroutineName} Started")
    for (i in 0..9) {
        delay(delay)
        println("Remaining time left for ${coroutineName}: " + (10 - i))
    }
    println("${coroutineName}  ended")
}

suspend fun returnFromSuspendMethod(coroutineName: String, delay: Long): String {
    println("${coroutineName} Started")
    delay(delay)
    println("${coroutineName}  ended")
    return "return from coroutine"
}

fun main() = runBlocking {
    println("Main Started")
    println("Thread name: " + Thread.currentThread().name + ", Thread id: " + Thread.currentThread().id)
    //force to use a seperate thread
    //case1:
    /*launch(Dispatchers.IO) {
        longRunningWork4("CoRoutine1", 500)
    }*/
    //case2:
    /*launch(Dispatchers.IO) {
        longRunningWork4("CoRoutine1", 500)
    }.join()//main thread doesnt end till it executes
*/
    //case3:
    /*
        async(Dispatchers.IO) {
            longRunningWork4("CoRoutine1", 500)
        }
    */
    //case4:

    /*
        async(Dispatchers.IO) {
            longRunningWork4("CoRoutine1", 500)
        }.join()
    */
    //with launch u can only use join()
    //with async u can use both join() and await()

    //async return deffered
    //launch return job

    /*
        var deffered = async(Dispatchers.IO) {
            longRunningWork4("CoRoutine1", 500)
        }
        deffered.await()
        println("deffered: ${deffered}")
    */

    /*
        var job = launch(Dispatchers.IO) {
            longRunningWork4("CoRoutine1", 500)
        }
        job.join()
        println("job: ${job}")
    */

    //return result from suspend method
    var returnFromMethod = async {
        returnFromSuspendMethod("sample coroutine", 500)
    }.await()
    println("${returnFromMethod}")
    println("Main ended")
}