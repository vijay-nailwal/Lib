package com.example.lib2.kunal.dsa.linearSearch2

fun main(args: Array<String>) {
    val arr = intArrayOf(18, 12, -7, 3, 14, 28)
    val target = 3456
    println(linearSearch(arr, target, 1, 4))
}

fun linearSearch(arr: IntArray, target: Int, start: Int, end: Int): Int {
    if (arr.size == 0) {
        return -1
    }
    for (i in start..end) {
        val element = arr[i]
        if (element == target) {
            return i
        }
    }
    return -1
}
