package com.mg;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<Integer> list = new ArrayList<Integer>();

        int[] a = {1,2,4,5,6};

        for (int i = 0 ; i <a.length ; i++){

            for (int j = i+1 ; j<a.length ; j++  ){

                if (a[i]+a[j]==6){

                    list.add(a[i]);
                    list.add(a[j]);

                }
            }

        }

        System.out.println(list);

    }
}
