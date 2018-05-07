package com.mg;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// sum of triples must have a unique value

        ArrayList<Integer> list = new ArrayList<Integer>();

        int[] a = {1, -2, 0, 5, -1, -4};

        for (int i = 0 ; i <a.length ; i++){

            for (int j = i+1 ; j <a.length ; j++){

                for (int k =  0 ; k<a.length ; k++){

                    if (a[i]+a[j]+a[k]==-2){



                        list.add(a[i]);
                        list.add(a[j]);
                        list.add(a[k]);

                    }
                }
            }

        }

        System.out.println(list);


    }
}
