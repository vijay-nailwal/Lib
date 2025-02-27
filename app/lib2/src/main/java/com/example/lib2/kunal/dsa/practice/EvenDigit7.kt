package com.example.lib2.kunal.dsa.practice

fun main() {
    val array = arrayOf(1, 12, 1, 12, 1, 12, 1, 12, 1, 12, 1, 12, 1, 12)
    println(findNum(array))
}

fun findNum(array: Array<Int>): Int {
    var counter = 0
    for (i in array) {
        if (digitCount(i) % 2 == 0) {
            counter++
        }
    }
    return counter
}

fun digitCount(i: Int): Int {
    var i = i
    var count = 0
    while (i > 0) {
        count++
        i = i / 10
    }
    return count
}