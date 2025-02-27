package com.example.lib2.kunal.dsa.array1.example

    fun main(args: Array<String>) {
        val nums = arrayOf(3, 4, 5, 12)
        println(nums.contentToString())
        change(nums)
        println(nums.contentToString())
    }

    fun change(arr: IntArray) {
        arr[0] = 99
    }
