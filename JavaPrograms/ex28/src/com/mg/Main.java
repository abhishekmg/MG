package com.mg;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	//  find the number of even and odd integers in a given array of integers.

        ArrayList list = new ArrayList();
        ArrayList list1 = new ArrayList();

        int[] a = {1,2,3,4,5,6};

        for (int i = 0 ; i<a.length ; i++){

            if (a[i] %2 == 0){
                list.add(a[i]);
            }

        }

        System.out.println("even = " + list);

        for (int j = 0 ; j<a.length ; j++){

            if (a[j]%2 != 0){

                list1.add(a[j]);

            }
        }

        System.out.println("odd : " + list1);

        System.out.println("no of even nos = " + list.size());
        System.out.println("no of odd nos = " + list1.size());


    }
}
