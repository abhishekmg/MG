package com.mg;

import java.util.Arrays;

public class Main {


    static int[] rearrange(int[] input , int n){


        int [] temp = new int[n];

        boolean flag = true;

        int large = n-1 , small = 0;

        for (int  i = 0 ; i<n ; i++){

            if (flag){

                temp[i] = input[large--];
            }

            else {
                temp[i] = input[small++];
            }

            flag = !flag;
        }

        return temp;





    }

    public static void main(String[] args) {
	// Write a Java program to sort an array of positive integers of an given array, in the sorted array the value of the first element should be maximum, second value should be minimum value, third should be second maximum, fourth second be second minimum and so on.


        int[] a = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.println(Arrays.toString(rearrange(a,a.length                                                                                                        )));


    }
}
