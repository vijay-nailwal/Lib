package com.example.lib2.kunal.dsa.array1.example

import java.util.Scanner

fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)

    // array of primitives
    val arr = IntArray(5)
    arr[0] = 23
    arr[1] = 45
    arr[2] = 233
    arr[3] = 543
    arr[4] = 3
    // [23, 45, 233, 543, 3]
    println(arr[3])

    // input using for loops
    for (i in arr.indices) {
        arr[i] = `in`.nextInt()
    }

    //
//        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        for(int num : arr) { // for every element in array, print the element
//            System.out.print(num + " "); //  here num represents element of the array
//        }

//        System.out.println(arr[5]); // index out of bound error

    // array of objects
    val str = arrayOfNulls<String>(4)
    for (i in str.indices) {
        str[i] = `in`.next()
    }

    println(str.contentToString())

    // modify
    str[1] = "kunal"

    println(str.contentToString())
}
