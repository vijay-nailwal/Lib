package com.example.lib2.kunal.dsa.binarySearch3

// https://leetcode.com/problems/find-in-mountain-array/
//Input: mountainArr = [1,2,3,4,5,3,1], target = 3

//Input: mountainArr = [0,1,2,4,2,1], target = 3
fun main() {
//    var array = intArrayOf(0,1,2,4,2,1)
    var array = intArrayOf(1, 2, 3, 4, 5, 3, 1)
    var target = 3
    println(search1(array, target))
}


fun search1(arr: IntArray, target: Int): Int {
    val peak: Int = findInMountainArray(arr)
    val firstTry = orderAgnosticBS(arr, target, 0, peak)
    if (firstTry != -1) {
        return firstTry
    }
    return orderAgnosticBS(arr, target, peak + 1, arr.size - 1)
}

fun findInMountainArray(arr: IntArray): Int {
    var start = 0
    var end = arr.size - 1

    while (start < end) {
        val mid = start + (end - start) / 2
        if (arr[mid] > arr[mid + 1]) {
            end = mid
        } else {
            start = mid + 1
        }
    }
    return start
}

fun orderAgnosticBS(arr: IntArray, target: Int, start: Int, end: Int): Int {
    var start = start
    var end = end
    val isAsc = arr[start] < arr[end]

    while (start <= end) {
        val mid = start + (end - start) / 2

        if (arr[mid] == target) {
            return mid
        }

        if (isAsc) {
            if (target < arr[mid]) {
                end = mid - 1
            } else {
                start = mid + 1
            }
        } else {
            if (target > arr[mid]) {
                end = mid - 1
            } else {
                start = mid + 1
            }
        }
    }
    return -1
}
