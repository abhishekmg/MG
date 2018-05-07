package com.mg;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// array to arrlist

        String[] a = {"apple" , "banana" ,"lime" , "papaya" , "watermelon"};

        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(a));

        System.out.println(list1);

        System.out.println("=================================");


        // arr list to array

        ArrayList<String> list = new ArrayList<String>();

        list.add("Python");

        list.add("Java");

        list.add("PHP");

        list.add("C#");

        list.add("C++");

        list.add("Perl");

        String[] array = new String[list.size()];

        list.toArray(array);

        for (int i = 0 ; i<array.length ; i++){
            System.out.println(Arrays.toString(array));
        }





    }
}
