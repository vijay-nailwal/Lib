package com.example.lib2.codetutor.oops_kotlin.Coroutines18

internal class MyThread2(private val threadName: String, val sleepDelay: Long) : Thread(threadName) {
    override fun run() {
        println("Worker Thread Started")
        println("Thread name: " + currentThread().name + ", Thread id: " + currentThread().id)
        for (i in 0..9) {
            try {
                sleep(sleepDelay)
                println("Remaining time left for ${Thread.currentThread().name}: " + (10 - i))
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
        }
        println("Worker Thread ended")
    }
}

fun main(args: Array<String>) {
    println("Main started")
    println("Thread name: " + Thread.currentThread().name + ", Thread id: " + Thread.currentThread().id)
//case 2: creating multiple thread
    for (i in 0..1000000) {
        MyThread2(Thread.currentThread().name, 1*i.toLong()).start()
        MyThread2(Thread.currentThread().name, 1*i.toLong()).start()
        MyThread2(Thread.currentThread().name, 1*i.toLong()).start()
        MyThread2(Thread.currentThread().name, 1*i.toLong()).start()
        MyThread2(Thread.currentThread().name, 1*i.toLong()).start()
        MyThread2(Thread.currentThread().name, 1*i.toLong()).start()
    }
    println("Main ended")
}
//creating multiple thread means actually sharing limited number of CPU cores between threads
//each thread is assigned to physical core of cpu thats why to create multiple thread it will create
//bottle neck one time