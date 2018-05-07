package com.mg;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// reverse the array

        int[] a = {2,3,4,5,6,7,8,9};


        System.out.println("array : " + Arrays.toString(a));

        for (int i = a.length-1 ; i >= 0 ; i--){
            System.out.println(a[i]);
        }

        System.out.println("===========================");


        // swap method

        int[] b = {2,3,4,5,6,7,8,9};

        System.out.println(Arrays.toString(a));

        for (int i = 0 ; i<a.length/2 ;i++){
            int temp = a[i];
            a[i] = a[a.length-i-1];
            a[a.length-i-1] = temp;
        }

        System.out.println(Arrays.toString(a));




    }
}
