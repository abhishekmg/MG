package com.mg;

public class Main {

    public static void main(String[] args) {
        //  to find all pairs of elements in an array whose sum is equal to a specified number.

        int[] a = {2, 3, 4, 5, 6, 7};
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8};
        int value = 10;

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b.length; j++) {

                if (a[i] + b[j] == value) {
                    System.out.println(a[i] + " + " + b[j] + " = " + value);
                }
            }


        }
    }
}