package com.example.lib2.kunal.dsa.linearSearch

fun main() {
    val nums = intArrayOf(23, 45, 1, 2, 8, 19, -3, 16, -11, 28)
    val target = 19
    val ans = linearSearch3(nums, target)
    println(ans)
}

// search the target and return true or false
fun linearSearch3(arr: IntArray, target: Int): Boolean {
    if (arr.isEmpty()) {
        return false
    }

    // run a for loop
    for (element in arr) {
        if (element == target) {
            return true
        }
    }
    // this line will execute if none of the return statements above have executed
    // hence the target not found
    return false
}

// search the target and return the element
fun linearSearch2(arr: IntArray, target: Int): Int {
    if (arr.isEmpty()) {
        return -1
    }

    // run a for loop
    for (element in arr) {
        if (element == target) {
            return element
        }
    }
    // this line will execute if none of the return statements above have executed
    // hence the target not found
    return Int.MAX_VALUE
}

// search in the array: return the index if item found
// otherwise if item not found return -1
fun linearSearch(arr: IntArray, target: Int): Int {
    if (arr.isEmpty()) {
        return -1
    }

    // run a for loop
    for (index in arr.indices) {
        // check for element at every index if it is = target
        val element = arr[index]
        if (element == target) {
            return index
        }
    }
    // this line will execute if none of the return statements above have executed
    // hence the target not found
    return -1
}