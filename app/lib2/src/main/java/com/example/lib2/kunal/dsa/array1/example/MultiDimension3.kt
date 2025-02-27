package com.example.lib2.kunal.dsa.array1.example

import java.util.Scanner

fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)

    val arr: Array<IntArray> = arrayOf(
        intArrayOf(1, 2, 3),  // 0th index
        intArrayOf(4, 5),     // 1st index
        intArrayOf(6, 7, 8, 9) // 2nd index
    )

    println(arr.size) // no of rows

    // input
    /*for (row in arr.indices) {
        // for each col in every row
        for (col in arr[row].indices) {
            arr[row][col] = `in`.nextInt()
        }
    }*/

    // output
//        for (int row = 0; row < arr.length; row++) {
//            // for each col in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

    // output
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }
/*
    for (a in arr) {
        println(a.contentToString())
    }
*/
}
