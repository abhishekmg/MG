package com.mg;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] a = {1,2,3,4,6,7};

        int missingIndex = 5;

        for (int i = a.length-1 ; i>missingIndex ; i--){

            a[i] = a[i-1];
        }

        a[missingIndex] = a.length/2;

        System.out.println(Arrays.toString(a));

    }
}
