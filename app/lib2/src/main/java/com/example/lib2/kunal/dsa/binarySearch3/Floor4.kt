package com.example.lib2.kunal.dsa.binarySearch3

fun main() {
    val arr = arrayOf(2, 3, 5, 9, 14, 16, 18)
    val target = 1
    val ans = floor(arr, target)
    println(ans)
}

// return the index: greatest number <= target
fun floor(arr: Array<Int>, target: Int): Int {
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
    return end
}
