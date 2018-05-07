package com.mg;

import java.util.Arrays;

public class Main {

    static int arra[] = new int[]{10, 20, 30, 40, 50, 60};

    public static void rotote(){

        int a  = arra[arra.length-1];

        for (int i = arra.length-1 ; i>0 ; i--){

            arra[i] = arra[i-1];



        }
        arra[0] = a;

    }




    public static void main(String[] args) {

        System.out.println("original array :" + Arrays.toString(arra));

        rotote();

        System.out.println("rotated array : " + Arrays.toString(arra));

    }

}
