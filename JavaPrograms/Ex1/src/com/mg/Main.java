package com.mg;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// to sort int and string array

        int a[] = {34,-90,87,67,93};

        String b[] = {"java" , "python" , "php" , "obj C" , "C++"};

        System.out.println("the original int array : " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("the sorted array :" + Arrays.toString(a));

        System.out.println("the original string array : " + Arrays.toString(b));
        Arrays.sort(b);
        System.out.println("the sorted array : " + Arrays.toString(b));

    }
}
