package com.mg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // to find index of array


        int[] a = {2,3,4,5,6};

        System.out.println(index(a,4));


    }

    public static int index(int[] input , int value){

        for (int i = 0 ; i<input.length ; i++){
            if (input[i]==value) {
                return i;
            }
        }
        return -1;
    }

}