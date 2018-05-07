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

        LinkedList<Integer> list1 = new LinkedList<Integer>();

        int k = 2;

        int size = list.size();

        for (int i = k ; i<size;i++){

            list1.add(list.get(k++));
        }



        System.out.println(list1);



    }
}
