package com.example.lib2.kunal.dsa.binarySearch3

import kotlin.math.max

// https://leetcode.com/problems/split-array-largest-sum/
fun main() {

//    val arr = intArrayOf(7, 2, 5, 10, 8)//18
    val arr = intArrayOf(1,2,3,4,5)//9
    var target = 2
    println(splitArray(arr,target))
}


fun splitArray(nums: IntArray, k: Int): Int {
    var start = 0
    var end = 0

    for (i in nums.indices) {
        start =
            max(
                start.toDouble(),
                nums[i].toDouble()
            ).toInt() // in the end of the loop this will contain the max item of the array
        end += nums[i]
    }

    // binary search
    while (start < end) {
        // try for the middle as potential ans
        val mid = start + (end - start) / 2

        // calculate how many pieces you can divide this in with this max sum
        var sum = 0
        var pieces = 1
        for (num in nums) {
            if (sum + num > mid) {
                // you cannot add this in this subarray, make new one
                // say you add this num in new subarray, then sum = num
                sum = num
                pieces++
            } else {
                sum += num
            }
        }

        if (pieces > k) {
            start = mid + 1
        } else {
            end = mid
        }
    }
    return end // here start == end
}
