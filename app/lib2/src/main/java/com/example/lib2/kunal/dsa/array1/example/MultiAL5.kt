package com.example.lib2.kunal.dsa.array1.example

import java.util.Scanner

fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)
    val list = ArrayList<ArrayList<Int>>()

    // initialisation
    for (i in 0..2) {
        list.add(ArrayList())
    }

    // add elements
    for (i in 0..2) {
        for (j in 0..2) {
            list[i].add(`in`.nextInt())
        }
    }
    println(list)
}
