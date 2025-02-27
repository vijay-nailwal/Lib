package com.example.lib2.kunal.dsa.linearSearch2

fun main(args: Array<String>) {
    val name = "Kunal"
    val target = 'u'
    println(search(name, target))
    println(search2(name, target))
}

fun search2(str: String, target: Char): Boolean {
    for (i in str.toCharArray()) {
        if (i == target) {
            return true
        }
    }
    return false
}

fun search(str: String, target: Char): Boolean {
    for (i in 0 until str.length) {
        if (target == str[i]) {
            return true
        }
    }
    return false
}
