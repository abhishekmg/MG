package com.mg;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// sum of all the 10's in the array is exactly 30

        int[] a = {10, 77, 10, 54, 10, 10};

        int searchNO = 10;
        int sum = 30;

        System.out.println(test(a,searchNO,sum));


    }


    public static boolean test (int[] input , int searchNO , int sum) {

        int tempsum = 0;

        for (int i = 0 ; i <input.length ; i++){

            if (input[i] == searchNO){

                tempsum = tempsum + searchNO;
            }

            if (tempsum != sum){
                break;
            }


        }



        return tempsum == sum;



    }



}
