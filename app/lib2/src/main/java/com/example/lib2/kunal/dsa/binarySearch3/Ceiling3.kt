package com.example.lib2.kunal.dsa.binarySearch3

fun main() {
    val arr = arrayOf(2, 3, 5, 9, 14, 16, 18)
    val target = 1
    val ans = ceiling(arr, target)
    println(ans)
}

// return = to target or less than target
fun ceiling(arr: Array<Int>, target: Int): Int {
    // but what if the target is greater than the greatest number in the array
    if (target > arr[arr.size - 1]) {
        return -1
    }

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
    return start
}
