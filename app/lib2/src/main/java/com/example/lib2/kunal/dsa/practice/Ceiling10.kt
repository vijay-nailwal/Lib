package com.example.lib2.kunal.dsa.practice

fun main() {
    val array = arrayOf(2, 3, 5, 9, 14, 16, 18)
    var target = 8
    println(findCeiling(array, target))
}

fun findCeiling(array: Array<Int>, target: Int): Int {
    if (target > array[array.size - 1]) {
        return -1
    }
    var start = 0
    var end = array.size - 1
    while (start <= end) {
        var mid = start + (end - start) / 2
        if (target < array[mid]) {
            end = mid - 1
        } else if (target > array[mid]) {
            start = mid + 1
        } else {
            return mid
        }
    }
    return start
}
