package com.example.lib2.kunal.dsa.linearSearch2

fun main() {
    var array = arrayOf(11, 22, 33, 44, 55, 66)
    println(searchElement(array, 55))
    println(searchIndex(array, 55))
    println(searchTargetTrueFalse(array, 55))
}

fun searchElement(array: Array<Int>, target: Int): Int {
    for (i in array) {
        if (i == target) {
            return i
        }
    }
    return -1
}

fun searchIndex(array: Array<Int>, target: Int): Int {
    for (i in array.indices) {
        if (array[i] == target) {
            return i
        }
    }
    return -1
}

fun searchTargetTrueFalse(array: Array<Int>, target: Int): Boolean {
    for (i in array) {
        if (i == target) {
            return true
        }
    }
    return false
}
