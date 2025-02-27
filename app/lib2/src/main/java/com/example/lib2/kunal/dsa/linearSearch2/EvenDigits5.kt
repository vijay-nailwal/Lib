package com.example.lib2.kunal.dsa.linearSearch2
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

import kotlin.math.log10

fun main(args: Array<String>) {
    val nums = arrayOf(12, 345, 2, 6, 7896)
    println(findNumbers(nums));
//    println(digits2(-345678))
}

fun findNumbers(nums: Array<Int>): Int {
    var count = 0
    for (num in nums) {
        if (even(num)) {
            count++
        }
    }
    return count
}

// function to check whether a number contains even digits or not
fun even(num: Int): Boolean {
    val numberOfDigits = digits(num)
    return numberOfDigits % 2 == 0
}

fun digits2(num: Int): Int {
    var num = num
    if (num < 0) {
        num = num * -1
    }
    return (log10(num.toDouble())) as Int + 1
}

// count number of digits in a number
fun digits(num: Int): Int {
    var num = num
    if (num < 0) {
        num = num * -1
    }
    if (num == 0) {
        return 1
    }
    var count = 0

    while (num > 0) {
        count++
        num = num / 10
    }
    return count
}
