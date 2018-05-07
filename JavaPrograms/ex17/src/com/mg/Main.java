package com.mg;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// to print second largest and  2nd smallest

        int[] a = {
                10789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};

        System.out.println(Arrays.toString(a));

        Arrays.sort(a);

        System.out.println("second largest : " + a[a.length-2] );
        System.out.println("second smallest : "  + a[1]);
    }
}
