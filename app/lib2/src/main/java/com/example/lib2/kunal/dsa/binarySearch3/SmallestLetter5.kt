package com.example.lib2.kunal.dsa.binarySearch3

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
fun main(args: Array<String>) {
    var letters = arrayOf('c', 'f', 'j')
    var target = 'c'
    println(nextGreatestLetter(letters, target))
}

fun nextGreatestLetter(letters: Array<Char>, target: Char): Char {
    var start = 0
    var end = letters.size - 1
    while (start <= end) {
        val mid = start + (end - start) / 2
        if (target < letters[mid]) {
            end = mid - 1
        } else {
            start = mid + 1
        }
    }
    return letters[start % letters.size]
}

