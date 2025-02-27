package com.example.lib2.kunal.dsa.array1

fun main() {
    val arr = arrayOf(1, 3, 23, 9, 18, 56)
//    swap(arr, 0, 4)
        reverse(arr)
    println(arr.contentToString())
}

fun reverse(arr: Array<Int>) {
    var start = 0
    var end = arr.size - 1

    while (start < end) {
        swap(arr, start, end)
        start++
        end--
    }
}

fun swap(arr: Array<Int>, index1: Int, index2: Int) {
    val temp = arr[index1]
    arr[index1] = arr[index2]
    arr[index2] = temp
}
