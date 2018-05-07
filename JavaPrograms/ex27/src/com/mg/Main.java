package com.mg;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// the difference between the largest and smallest values in an array of integers. The length of the array must be 1 and above.

       int[] a = {5, 7, 2, 4, 9};

        Arrays.sort(a);

        int diff = a[a.length-1] - a[0];

        System.out.println(diff);
     }
}
