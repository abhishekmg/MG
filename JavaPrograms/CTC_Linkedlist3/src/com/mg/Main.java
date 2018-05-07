package com.mg;

import java.util.LinkedList;


public class Main {

    public static void main(String[] args) {
	// write your code here

        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);




        int p = Math.abs(list.size()/2 );


        list.remove(p);

        System.out.println(list);
    }
}
