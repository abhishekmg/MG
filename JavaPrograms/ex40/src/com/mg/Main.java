package com.mg;

public class Main {

    public static void main(String[] args) {

        //Java program to find the two elements from a given array of positive and negative numbers such that their sum is closest to zero

        int[] a = {1, 5, -4, 7, 8, -6};

        int mini = 0;
        int minj = 1;
        int minsum = a[0] + a[1];

        for (int i = 0 ; i<a.length ; i++){

            for (int j = 0 ; j<a.length ; j++){

                int sum = a[i] + a[j];

                if (Math.abs(minsum) > Math.abs(sum)){

                    mini = i;
                    minj = j;
                    minsum = sum;
                }
            }
        }

        System.out.println(a[mini] + a[minj]);









    }
}
