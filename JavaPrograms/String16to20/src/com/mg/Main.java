package com.mg;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// 16 - sting to byte array

        String a = "how you doing!";


        byte[] b = a.getBytes();

        String sample = new String(b);

        System.out.println(sample);


    // 17 - to get contents of a string

      String a1 = "whats up";

      char[] cahrecter = new char[]{' ', ' ', ' '};

        a1.getBytes();

        System.out.println(cahrecter);


        // 18 - to get index of charecter

        String a2 = "watermelon";

        System.out.println("index of : " + a2.indexOf(4));


        // 19 - to get identifier

        String a4 = "java is a language";

        int hash = a4.hashCode();

        System.out.println(hash);

        // sum of 2d matrix

        int[][] x = new int[4][4];

        Scanner s = new Scanner(System.in);

        for (int i = 0 ; i<4 ; i++){
            for (int j = 0 ; j<4 ; j++){

                x[i][j] = s.nextInt();
            }
        }

        int sum = 0 ;

        for (int i = 0 ; i<4 ; i++){
            for (int j = 0 ; j<4 ; j++){

                sum = sum  + x[i][j];
            }
        }

        System.out.println(sum);

        // pallendrome


    }
}
