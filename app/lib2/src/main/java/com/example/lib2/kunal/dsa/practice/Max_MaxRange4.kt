package com.example.lib2.kunal.dsa.practice

fun main(args: Array<String>) {
    var array = arrayOf(1, 2, 3, 4, 55, 6)
//    println(maxx(array))
    println(maxrange(array, 1, 4))
}

fun maxrange(array: Array<Int>, start: Int, end: Int): Int {
    var maxVal = start
    for (i in start..end) {
        if (maxVal < array[i]) {
            maxVal = array[i]
        }
    }
    return maxVal
}

fun maxx(array: Array<Int>): Int {
    var maxVal = array[0]
    for (i in array) {
        if (maxVal < i) {
            maxVal = i
        }
    }
    return maxVal
}

