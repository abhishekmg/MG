package com.mg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner s = new Scanner(System.in);

        int[][] a = new int[2][2];

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                a[i][j] = s.nextInt();
            }
        }

        System.out.println("input array : " + Arrays.deepToString(a));


        for (int c = 0; c <= 2; c++) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    if (i + j == c) {
                        System.out.print(a[i][j]);



                    }
                }


            }

            System.out.println(" ");

        }
    }
}
