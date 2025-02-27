package com.example.lib2.kunal.dsa.practice

fun main(args: Array<String>) {
    var array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    println(array.contentToString())
//    swapp(array, 1, 5)
    println(array.contentToString())
//    reversee(array)
    println(array.contentToString())
}

fun reversee(array: Array<Int>) {
    var start = 0
    var end = array.size - 1
    while (start < end) {
        swapp(array, start, end)
        start++
        end--
    }
}

fun swapp(array: Array<Int>, index1: Int, index2: Int) {
    var temp = array[index1]
    array[index1] = array[index2]
    array[index2] = temp
}