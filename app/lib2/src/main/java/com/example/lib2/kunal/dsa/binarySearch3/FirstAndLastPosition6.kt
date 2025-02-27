package com.example.lib2.kunal.dsa.binarySearch3

fun main() {
    var array = arrayOf(5, 7, 7, 8, 8, 10)
    var target = 8
    println(searchRange(array, target).contentToString())
}

fun searchRange(nums: Array<Int>, target: Int): Array<Int> {
    val ans = arrayOf(-1, -1)
    val start = search1(nums, target, true)
    val end = search1(nums, target, false)
    ans[0] = start
    ans[1] = end
    return ans
}

fun search1(nums: Array<Int>, target: Int, findStartIndex: Boolean): Int {
    var ans = -1
    var start = 0
    var end = nums.size - 1
    while (start <= end) {
        val mid = start + (end - start) / 2

        if (target < nums[mid]) {
            end = mid - 1
        } else if (target > nums[mid]) {
            start = mid + 1
        } else {
            ans = mid
            if (findStartIndex) {
                end = mid - 1
            } else {
                start = mid + 1
            }
        }
    }
    return ans
}
