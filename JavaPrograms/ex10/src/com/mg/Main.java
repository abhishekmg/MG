package com.mg;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// to find max and min of array

        int[] a = {98,67,35,96,12,11,87,34};

        System.out.println("array :" + Arrays.toString(a));

        Arrays.sort(a);

        System.out.println("max : " + a[7]);
        System.out.println("min :" + a[0]);
    }
}
