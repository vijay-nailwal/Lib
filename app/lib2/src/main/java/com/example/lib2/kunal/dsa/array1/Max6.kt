package com.example.lib2.kunal.dsa.array1

fun main(args: Array<String>) {
    val arr = arrayOf(1, 33, 2, 9, 18)
//    println(max(arr))
    println(maxRange(arr, 1, 3))
}

// work on edge cases here, like array being null
fun maxRange(arr: Array<Int>, start: Int, end: Int): Int {
    if (start > end) {
        return -1
    }
    if (arr == null) {
        return -1
    }

    var maxVal = arr[start]
    for (i in start..end) {
        if (maxVal< arr[i] ) {
            maxVal = arr[i]
        }
    }
    return maxVal
}

fun max(arr: Array<Int>): Int {
    if (arr.size == 0) {
        return -1
    }
    var maxVal = arr[0]
    for (i in arr) {
        if (maxVal < i) {
            maxVal = i
        }
    }
    return maxVal
}
