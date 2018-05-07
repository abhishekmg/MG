package com.mg;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// to copy array

       int[] a = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
       int[] b = new int[10];

        System.out.println("original :"+Arrays.toString(a));

        for (int i = 0; i<a.length ; i++){
            b[i] = a[i];
        }

        System.out.println("copied :"+Arrays.toString(b));

       //============================================================










    }
}
