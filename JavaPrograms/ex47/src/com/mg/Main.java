package com.mg;

public class Main {

    public static void main(String[] args) {
	//to print no of rotations

        int[] a = {1,2,3,4,5,6};

        int minindex = a[0];

        for (int i = 0 ; i<a.length ; i++){

            if (a[minindex] > a[i]){

                minindex = a[i];

            }

            System.out.println(minindex);
        }
    }
}
