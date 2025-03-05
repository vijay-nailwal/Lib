package com.example.lib2.kunal.dsa.binarySearch3

fun main() {
//        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};//asc
    val arr = intArrayOf(99, 80, 75, 22, 11, 10, 5, 2, -3)//desc
    val target = 11
    println(orderAgnosticBS(arr, target))
}

fun orderAgnosticBS(arr: IntArray, target: Int): Int {
    var start = 0
    var end = arr.size - 1
    val isAsc = arr[start] < arr[end]

    while (start <= end) {
        val mid = start + (end - start) / 2

        if (arr[mid] == target) {
            return mid
        }

        if (isAsc) {
            if (target < arr[mid]) {
                end = mid - 1
            } else if (target > arr[mid]) {
                start = mid + 1
            }
        } else {
            if (target > arr[mid]) {
                end = mid - 1
            } else if (target < arr[mid]){
                start = mid + 1
            }
        }
    }
    return -1
}