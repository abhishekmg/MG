package com.mg;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] a= {1,2,3,4,5,6,7};

        int d =4;

        ArrayList list = new ArrayList();
        ArrayList list1 = new ArrayList();

        for (int i = 0 ; i<d ; i++){

            list.add(a[i]);

        }

        for (int i = d ; i <a.length ; i++){
            list1.add(a[i]);
        }

        list1.addAll(list);


        System.out.println(list1);
    }
}
