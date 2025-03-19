package com.example.lib2.yash

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
//launch

/*
fun main() = runBlocking {
    val job = GlobalScope.launch {
        println("co routines builder launch started ")
    }
//    job.join()// wait until co routines finishes
    println("co routines builder launch end ")
}
*/
//it doesnt return any result,
//it returns job
//job is used for join and cancel the coroutines


//async
/*
fun main() = runBlocking {
    val jobDefered = GlobalScope.async {
        println("co routines builder async started ")
        10
        "vijay"
    }
//    job.join()// wait until co routines finishes
    println(jobDefered.await())//wait co routines for finish and return the result
}
*/

//parent child co routines
/*fun main()= runBlocking {
    launch {
        println(Thread.currentThread().name)
    }
    delay(1000)
}*/// runBlocking is parent
//launch is child co routines, launch is running inside main thread
//thats why launch is main thread because it inherit the value
// of parent thread

//if you want to change the thread of launch then use dispatcher in launch

/*
fun main()= runBlocking {
    launch(Dispatchers.IO) {
        println(Thread.currentThread().name)
    }
    delay(1000)
}
*/
