package com.example.lib2.kunal.dsa.array1.example

    fun main(args: Array<String>) {
        // Q: store a roll number
        val a = 19

        // Q: store a person's name
        val name = "Kunal Kushwaha"

        // Q: store 5 roll numbers
        val rno1 = 23
        val rno2 = 55
        val rno3 = 18

        // syntax
        // datatype[] variable_name = new datatype[size];
        // store 5 roll numbers:
//        int[] rnos = new int[5];
//        // or directly
//        int[] rnos2 = {23, 12, 45, 32, 15};
        val ros =
            IntArray(5) // initialisation: actually here object is being created in the memory (heap)
        // declaration of array. ros is getting defined in the stack

        //        System.out.println(ros[1]);
        val arr = arrayOfNulls<String>(4)
        println(arr[0])

//for (String element : arr) {
//            System.out.println(element);
//        }
    }
