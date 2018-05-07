package com.mg;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// find common elements from three sorted

        ArrayList<Integer> common = new ArrayList<>();

        int a[] = {2, 4, 8,1};
        int b[] = {2, 3, 4, 8, 10, 16,1};
        int c[] = {4, 8, 14, 40,1};

        for (int i = 0 ; i<a.length ; i++){

            for (int j = 0 ; j<b.length ;j++){

                for (int k = 0 ; k<c.length ;k++){

                    if (a[i] == b[j] && b[i] == c[k]){

                        common.add(a[i]);

                    }
                }
            }


        }

        System.out.println(common);




    }
}