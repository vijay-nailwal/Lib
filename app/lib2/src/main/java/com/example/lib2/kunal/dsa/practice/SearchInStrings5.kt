package com.example.lib2.kunal.dsa.practice

fun main() {
    var string = "vijay"
    var target = 'i'
//    println(searchChar(string, target))
    println(searchChar2(string, target))
}

fun searchChar(string: String, target: Char): Char {
    for (i in 0 until string.length) {
        if (string[i] == target) {
            return target
        }
    }
    return '\u0000'
}

fun searchChar2(str: String, target: Char): Char {
    for (i in str.toCharArray()) {
        if (i == target) {
            return target
        }
    }
    return '\u0000'
}
