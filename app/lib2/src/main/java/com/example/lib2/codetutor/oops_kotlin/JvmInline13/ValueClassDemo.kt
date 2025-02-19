package com.example.lib2.codetutor.oops_kotlin.JvmInline13

@JvmInline
value class TimePeriod private constructor (
    val time: Long
) {
    companion object {
        fun millis(millis: Long) = TimePeriod(millis)
        fun seconds(seconds: Long) = TimePeriod(seconds * 1000)
    }
}

fun display(duration: TimePeriod) {
    println("${duration.time} milliseconds")
    println("Hashcode ${duration.hashCode()}")
}

fun main(array: Array<String>){
    display(TimePeriod.millis(2000))
    display( TimePeriod.seconds(2))
}