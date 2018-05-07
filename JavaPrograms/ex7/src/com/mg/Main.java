package com.mg;

import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// to remove a element from array

        int[] a = {3,4,5,6,7,8,9};




        System.out.println("original array : " + Arrays.toString(a));

        int removeindex = 2;

        int len = a.length;

        for (int i = removeindex ; i<len-1 ; i++){

            a[i] = a[i+1];
            len--;




        }

        int[] b = Arrays.copyOf(a,len);


        System.out.println("after removal  : " + Arrays.toString(b));

        System.out.println("=========================");


    // using array list

        ArrayList list = new ArrayList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("list = " + list);

        list.remove(3);

        System.out.println(list);








    }
}
