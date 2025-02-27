package com.example.lib2.kunal.dsa.binarySearch3

fun main() {
    val arr = arrayOf(-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89)
    val target = 22
    val ans = binarySearch1(arr, target)
    println(ans)
}
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java

fun binarySearch1(arr: Array<Int>, target: Int): Int {
    var start = 0
    var end = arr.size - 1
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