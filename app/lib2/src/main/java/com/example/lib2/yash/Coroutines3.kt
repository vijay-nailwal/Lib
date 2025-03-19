package com.example.lib2.yash

import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//if the parent co-routines is cancelled,
// all child co-routines will be automatically cancelled


//exception
//any child co-routines get the exception it will propagate exception to parent
//if parent doesnt handle the exception then it will crash

//if you put cancellation exception


import kotlinx.coroutines.*

fun main() = runBlocking {
    println("main method")

    val parentJob = launch {
        println("parentJob")
        coroutineScope {  // Ensures child coroutines inherit cancellation
            val childJob1 = launch {
                println("childjob1")
                try {
                    delay(1000)
                } catch (e: CancellationException) {
                    println("childjob1 cancelled")
                }
            }
            val childJob2 = launch {
                println("childjob2")
                try {
                    delay(4000)
                } catch (e: CancellationException) {
                    println("childjob2 cancelled")
                }
            }
        }
    }

    parentJob.join()
    delay(1000)
    parentJob.cancel() // Cancels parent and children
    println("parent job cancelled")
    delay(1000) // Allow logs to print before exiting
}
