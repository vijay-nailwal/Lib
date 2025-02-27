package com.example.lib2.kunal.dsa.array1.example

fun main(array: Array<String>) {
    val nums = arrayOf(3, 4, 5, 12)
    println(nums.contentToString())
    change(nums)
    println(nums.contentToString())
}

fun change(arr: Array<Int>) {
    arr[0] = 99
//    arr.set(0,200)
}
