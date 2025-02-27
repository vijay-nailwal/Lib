package com.example.lib2.kunal.dsa.binarySearch3
// https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/

fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5, 5, 6)
    println(findPivotWithDuplicates(arr))
}

fun search2(nums: IntArray, target: Int): Int {
    val pivot = findPivot(nums)
    if (pivot == -1) {
        return binarySearch2(nums, target, 0, nums.size - 1)
    }
    if (nums[pivot] == target) {
        return pivot
    }
    if (target >= nums[0]) {
        return binarySearch2(nums, target, 0, pivot - 1)
    }
    return binarySearch2(nums, target, pivot + 1, nums.size - 1)
}

fun binarySearch2(arr: IntArray, target: Int, start: Int, end: Int): Int {
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

fun findPivot(arr: IntArray): Int {
    var start = 0
    var end = arr.size - 1
    while (start <= end) {
        val mid = start + (end - start) / 2
        if (mid < end && arr[mid] > arr[mid + 1]) {
            return mid
        }
        if (mid > start && arr[mid] < arr[mid - 1]) {
            return mid - 1
        }
        if (arr[mid] <= arr[start]) {
            end = mid - 1
        } else {
            start = mid + 1
        }
    }
    return -1
}

fun findPivotWithDuplicates(arr: IntArray): Int {
    var start = 0
    var end = arr.size - 1
    while (start <= end) {
        val mid = start + (end - start) / 2
        // 4 cases over here
        if (mid < end && arr[mid] > arr[mid + 1]) {
            return mid
        }
        if (mid > start && arr[mid] < arr[mid - 1]) {
            return mid - 1
        }
        if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
            if (start < end && arr[start] > arr[start + 1]) {
                return start
            }
            start++
            if (end > start && arr[end] < arr[end - 1]) {
                return end - 1
            }
            end--
        } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
            start = mid + 1
        } else {
            end = mid - 1
        }
    }
    return -1
}