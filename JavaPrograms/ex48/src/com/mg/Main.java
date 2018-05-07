package com.mg;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// -ve before +ve

        int[] a = {8,-9,1,4,-87,72,-34};

        Arrays.sort(a);

        System.out.println(Arrays.toString(a));

        int[] b  = new int[10];

        for (int i = a.length-1 ; i >= 0 ; i-- ){

            System.out.println(a[i]);


        }




    }
}
