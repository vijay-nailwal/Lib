package com.example.lib2.test

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlin.jvm.Throws

fun doSomethingAndThrowException() {
    throw Exception("exception")
}

var job = GlobalScope.launch(Dispatchers.Default) {
    try {
        doSomethingAndThrowException()
    } catch (e: Exception) {
    }
}
var defferedJob = GlobalScope.async(Dispatchers.Default) {

    doSomethingAndThrowException()

    return@async 10
}

suspend fun main() {
    println(job)
    var result = defferedJob.await()
    println(result)
}