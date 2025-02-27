package com.example.lib2.kunal.dsa.array1.example

import java.util.Scanner

fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)
    // Syntax
    val list = ArrayList<Int>(5)

    list.add(67);
    list.add(234);
    list.add(654);
    list.add(43);
    list.add(654);
    list.add(8765);

    println(list.contains(765432));
    println(list);
    list.set(0, 99);
    list.remove(2);
    println(list);

    // input
    for (i in 0..4) {
        list.add(`in`.nextInt())
    }
    // get item at any index
    for (i in 0..4) {
        println(list[i]) // pass index here, list[index] syntax will not work here
    }
    println(list)
}