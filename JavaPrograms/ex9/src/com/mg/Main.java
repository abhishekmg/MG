package com.mg;

import java.sql.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// insertion of array element


        int[] a = {3,4,5,6,7,8,9};

        System.out.println("array :" + Arrays.toString(a));

        int insertionindex = 2;
        int element = 10;

        for (int i = a.length-1 ; i>insertionindex ; i--){
            a[i] = a[i-1];
        }

        a[insertionindex] = element;

        System.out.println("new array : " +Arrays.toString(a));

        System.out.println("=========================");

        //array list

        LinkedList list = new LinkedList();

        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        System.out.println(list);

        list.add(2,10);
        System.out.println(list);

    }
}
