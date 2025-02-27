package com.example.lib2.kunal.dsa.binarySearch3

// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
fun main() {
    val arr = intArrayOf(3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170)
    val target = 10
    println(ans(arr, target))
}

fun ans(arr: IntArray, target: Int): Int {
    var start = 0
    var end = 1
    while (target > arr[end]) {
        val temp = end + 1
        end = end + (end - start + 1) * 2
        start = temp
    }
    return binarySearch1(arr, target, start, end)
}

fun binarySearch1(arr: IntArray, target: Int, start: Int, end: Int): Int {
    var start = start
    var end = end
    while (start <= end) {
        val mid = start + (end - start) / 2
        if (target < arr[mid]) {
            end = mid - 1
        } else if (target > arr[mid]) {
            start = mid + 1
        } else {
            return mid
        }
    }
    return -1
}
