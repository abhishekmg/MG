package com.mg;

public class Main {

    public static void main(String[] args) {
	// to find duplicate values int

        int[] a = {4,6,7,2,3,2,6,4};

        for (int i = 0 ; i<a.length ; i++){
            for (int j = i+1 ; j<a.length ; j++){
                if ((a[i]==a[j]) && (i!=j)){
                    System.out.println("duplicate element : " + a[j]);
                }

            }
        }

    }
}
