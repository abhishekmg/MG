package com.mg;

public class Main {

    public static void main(String[] args) {
	// sum of a array


        int[] a = {23,56,84,56,-67};

        int sum = 0 ;

        for (int i = 0; i <a.length ; i++){

            sum = sum + a[i];
        }

        System.out.println("the sum of array = " + sum);




    }
}
