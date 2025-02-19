package com.example.array;


import java.util.Scanner;

/**
 * Created by Vijay on 25 Jan 2025.
 */
public class A1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5};

        //input by user
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //another way of print array
//        System.out.println(Arrays.toString(arr));

// another way of print array
        for(int num:arr){
            System.out.println(num+" ");
        }

    }
}
