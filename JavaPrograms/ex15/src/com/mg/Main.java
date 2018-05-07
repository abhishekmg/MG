package com.mg;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// to find common element 2 array int

        int[] a = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] b = {1, 0, 6, 15, 6, 4, 7, 0};

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        for (int i = 0 ; i<a.length ; i++ ){

            for (int j = 0 ; j <b.length ; j ++){

                if (a[i] == b[j]){

                    System.out.println("common element : " + b[j]);
                }
            }
        }
    }
}
