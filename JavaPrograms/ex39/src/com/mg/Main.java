package com.mg;

public class Main {

    public static void main(String[] args) {
	// to print the leaders

        int[] a = {1, 5, -4, 7, 8, -6};

        for (int i = 0 ; i<a.length ; i++){

            int j ;

            for ( j = i+1 ; j < a.length ; j++){

                if (a[i]<=a[j])
                    break;
            }

            if (j == a.length){
                System.out.println(a[i]);
            }

        }
    }
}
