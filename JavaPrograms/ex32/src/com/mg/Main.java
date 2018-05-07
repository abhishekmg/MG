package com.mg;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	//  check if an array of integers contains two specified elements 65 and 77.

        ArrayList list = new ArrayList();

        int[] a = {77, 77, 65, 65, 65, 77};

        int num1 = 65;
        int num2 = 77;

        System.out.println(test(a,num1,num2));



    }

    public static  boolean test (int[] input , int num1, int  num2){

        for (int i = 0 ; i <input.length ; i++ ){

            if (input[i] != num1 && input[i]!=num2)
                return false;
        }
    return true;
    }

}
