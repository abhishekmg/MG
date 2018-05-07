package com.mg;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //permutation(" ", "abcde");

        // Q - check if a one string is a permutation of the other :

        String a = "abc";
        String b = "caa";

        int a0 = a.codePointAt(0);
        int a1 = a.codePointAt(1);
        int a2 = a.codePointAt(2);


        int b1= b.codePointAt(1) , b2 = b.codePointAt(2), b0 = b.codePointAt(0);


        int sum = a0 + a1 + a2;
        int sum1 =b1 + b0 + b2;

        if (sum==sum1)
            System.out.println("yes");
        else System.out.println("no");

//        for (int i = 0 ; i < a.length() ; i++){
//            for (int j = 0 ; j< b.length() ; j++){
//
//                if (a.charAt(i) == b.charAt(j))
//                    System.out.println("its a permutation");
//
//
//            }
//        }

    }

    public static void permutation(String perfix, String str) {

        int n = str.length();

        if (n == 0)
            System.out.println(perfix);
        else {

            for (int i = 0; i < n; i++) {


                permutation(perfix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));


            }
        }
    }
}