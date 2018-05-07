package com.mg;

import java.util.Arrays;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	// to find smallest and second smallest elements in a given array

        int[] a = {45,-90,81,2,-4,1};

        Arrays.sort(a);

        System.out.println("smallest two elements are : " + a[0] + a[1]);

        System.out.println("=====================================");




    // to segregate all 0 to lest and 1 to right side

        int[] b = {1,0,0,0,1,1,1,0,0,0,1};

        Arrays.sort(b);

        System.out.println("segregated array : " + Arrays.toString(b));




    }
}
