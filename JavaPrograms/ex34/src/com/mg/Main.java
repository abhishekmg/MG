package com.mg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	//  length of the longest consecutive elements sequence from a given unsorted array of integers.

        int[] a = {49, 1, 3, 200, 2, 4, 70, 5};

        System.out.println(longestSeq(a));


    }

    public static int longestSeq (int[] input){

        HashSet<Integer> set = new HashSet<Integer>();

        for (int i : input)
            set.add(i);

        int longestSeq = 0;

        for (int i : input){

            int length = 1;

            for (int j = i-1 ; set.contains(j) ; j--){

                set.remove(j);
                ++length;
            }

            for (int j = i+1 ; set.contains(j) ; j++){

                set.remove(j);
                ++length;
            }

            longestSeq = Math.max(length,longestSeq);
        }

        return longestSeq;
    }
}
