package com.mg;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// compute the average value of an array of integers except the largest and smallest values.

        int[] a = {5, 7, 2, 4, 9};

        Arrays.sort(a);



        System.out.println(Arrays.toString(a));

        int sum = 0;

        for (int i = 1 ;i <a.length - 1 ; i++){

            sum = sum + a[i];

        }



        double avg = sum / (a.length-2);

        System.out.println("the avg = " + avg);
    }
}
