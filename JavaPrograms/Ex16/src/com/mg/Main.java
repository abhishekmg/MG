package com.mg;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// to remove duplicate elements

       int[] a = {6,9,8,8,7,7,3,2};

        System.out.println(Arrays.toString(a));

        int length = a.length;

        for (int i = 0 ; i<length ; i++){

            for (int j = i+1 ; j<length ; j++){

                if (a[i]==a[j]){

                    a[j] = a[i-1];

                    length--;

                    j--;
                }
            }
        }

        int[] b = Arrays.copyOf(a,length);

        System.out.println("removed array : " + Arrays.toString(b));
    }
}
