package com.example.lib2.yash

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis

/*fun main() {
    var measureTimeMillis = 0L
    /*measureTimeMillis = measureTimeMillis {
        repeat(100_000) {
            thread { print("thread ") }
        }
    }*/
    /*runBlocking {
        measureTimeMillis = measureTimeMillis {
            repeat(100_000) {
                launch {
                    print("co-routines ")
                }
            }
        }
    }*/
    print("time_taken ${measureTimeMillis / 1000}")
}*/