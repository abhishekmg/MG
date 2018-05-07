package com.mg;

public class Main {

    public static void main(String[] args) {
	// to check of a pair has a specified sum

        int[] a = {22, 25, 17, 18, 19, 20};

        int sum = 42;

        for (int i = 0 ; i<a.length ; i++){

            for (int j = i+1 ; j<a.length ; j++){

                if (a[i] + a[j] == sum && i!=j){

                    System.out.println("there is a pair");
                }

                else
                    System.out.println("no pair");
            }
        }
    }
}
