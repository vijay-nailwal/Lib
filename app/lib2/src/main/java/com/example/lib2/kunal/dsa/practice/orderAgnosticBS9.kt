package com.example.lib2.kunal.dsa.practice


fun main() {
//    var array = arrayOf(100, 200, 300, 400, 500, 600, 700, 800)
    var array = arrayOf(800, 700, 600, 500, 400, 300, 200, 100)
    var target = 600
    println(findNumberAgnosticArray(array, target))
}

fun findNumberAgnosticArray(array: Array<Int>, target: Int): Int {
    var start = 0
    var end = array.size - 1
    var isAsc = array[start] < array[end]

    while (start <= end) {
        var mid = start + (end - start) / 2

        if (target == array[mid]) {
            return mid
        }

        if (isAsc) {
            if (target < array[mid]) {
                end = mid - 1
            } else if (target > array[mid]) {
                start = mid + 1
            }
        } else {
            if (target > array[mid]) {
                end = mid - 1
            } else if (target < array[mid]) {
                start = mid + 1
            }
        }
    }
    return -1
}

