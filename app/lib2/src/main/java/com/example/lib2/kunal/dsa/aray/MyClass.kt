package com.example.lib2.kunal.dsa.aray

object MyClass {
    @JvmStatic
    fun main(args: Array<String>) {
        val nums = intArrayOf(3, 4, 5, 12)
        println(nums.contentToString())
        change(nums)
        println(nums.contentToString())
    }

    fun change(arr: IntArray) {
        arr[0] = 99
    }
}
