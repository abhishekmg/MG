package com.mg;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] a = {0,6,7,1,2,9,-8};





        System.out.println(test(a));


    }

    public static boolean test(int[] input){

        for (int i = 0 ; i<input.length ; i++){

            if (input[i] == 0 || input[i] == -1)
                return true;


        }

        return false;
    }


}
