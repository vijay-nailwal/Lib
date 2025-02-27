package com.example.lib2.kunal.dsa.binarySearch3


// https://leetcode.com/problems/peak-index-in-a-mountain-array/
// https://leetcode.com/problems/find-peak-element/

fun main() {
//    var array = intArrayOf(0, 1, 0)
//    var array = intArrayOf(0,2,1,0)
    var array = intArrayOf(0,10,15,2)
    println(peakIndexInMountainArray(array))
}

fun peakIndexInMountainArray(arr: IntArray): Int {
    var start = 0
    var end = arr.size - 1

    while (start < end) {
        val mid = start + (end - start) / 2
        if (arr[mid] > arr[mid + 1]) {
            // you are in dec part of array
            // this may be the ans, but look at left
            // this is why end != mid - 1
            end = mid
        } else {
            // you are in asc part of array
            start = mid + 1 // because we know that mid+1 element > mid element
        }
    }
    return start // or return end as both are =
}