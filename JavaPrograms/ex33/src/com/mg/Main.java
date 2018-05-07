package com.mg;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<Integer> list = new ArrayList<>();

        int[] a = {20, 20, 30, 40, 50, 50, 50};



        for (int i = 0 ; i<a.length ; i++){

            for (int j = i+1  ; j <a.length ; j++ ){

                if (a[i] == a[j]){
                    list.add(a[j]);
                }
            }
        }

        System.out.println(list);

        System.out.println(list.size());
    }
}
