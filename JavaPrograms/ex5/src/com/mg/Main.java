package com.mg;

public class Main {

    public static void main(String[] args) {
        // to find value

        int a[] = {6, 9, 7, 5, 1, 8, 2};

        System.out.println(find(a,6));

        System.out.println(find(a,8));


    }

    public static int find(int[] input, int value) {

        for (int i = 0; i < input.length; i++) {
            if (input[i] == value)
                return value;
        }

        return -1;
    }
}
