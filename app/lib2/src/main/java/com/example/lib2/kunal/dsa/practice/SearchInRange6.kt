package com.example.lib2.kunal.dsa.practice

fun main() {
    var array = arrayOf(100, 200, 300, 400, 500, 600)
    var start = 2
    var end = 4
    var target = 300
    println(searchInRange(array, start, end, target))
}

fun searchInRange(array: Array<Int>, start: Int, end: Int, target: Int): Int {
    for (i in start..end) {
        if (array[i] == target) {
            return target
        }
    }
    return -1
}
