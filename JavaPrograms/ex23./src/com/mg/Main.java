package com.mg;

public class Main {

    public static void main(String[] args) {
	// to check equality of two arrays

        int[] a = { 1,2,3,4,5,6};
        int[] b = {1,2,3,4,5,6};

        for (int i = 0 ; i<a.length ; i++){

            for (int j = 0 ; j<b.length ; j++){

                if (a[i]==b[j]){
                    System.out.println("they are equal");
                }


            }
        }
    }
}
