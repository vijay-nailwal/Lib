package com.example.lib2.kunal.dsa.array1.example

fun main(args: Array<String>) {
    val arr = arrayOf(
        intArrayOf(1, 2, 3, 4),
        intArrayOf(5, 6),
        intArrayOf(7, 8, 9)
    )

    for (row in arr.indices) {
        for (col in arr[row].indices) {
            print(arr[row][col].toString() + " ")
        }
        println()
    }
}
