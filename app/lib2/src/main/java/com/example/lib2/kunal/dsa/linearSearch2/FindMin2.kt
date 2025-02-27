package com.example.lib2.kunal.dsa.linearSearch2

fun main() {
    var array = arrayOf(-1, 1, 2, 3, -4, 5, 6, -7)
    println(findMin(array))
}

fun findMin(array: Array<Int>): Int {
    var min = array[0]
    for (i in 1 until array.size) {
        if (array[i] < min) {
            min = array[i]
        }
    }
    return min
}