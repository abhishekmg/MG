package com.mg;

public class Main {

    public static void main(String[] args) {
        // to print a grid

        int[][] a = new int[10][10];

        for (int i = 0; i < 10; i++) {

            for (int j = 0; i < 10; j++) {
                System.out.printf("%2d", a[i][j]);
            }
            System.out.println();

        }

    }


}
