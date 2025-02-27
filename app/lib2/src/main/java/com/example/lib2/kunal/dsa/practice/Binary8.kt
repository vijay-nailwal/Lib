package com.example.lib2.kunal.dsa.practice

fun main() {
    var array = arrayOf(100, 200, 300, 400, 500, 600, 700, 800)
    var target = 800
    println(binary(array, target))
}

fun binary(array: Array<Int>, target: Int): Int {
    var start = 0
    var end = array.size - 1
    while (start <= end) {
        var mid = start + (end - start) / 2
        if (target < array[mid]) {
            end = mid - 1
        } else if (target > array[mid]) {
            start = mid + 1
        }
        else{
            return mid
        }
    }
    return -1
}

