package com.mg;

import java.util.Arrays;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	// to find common elements 2 array string

        String[] a = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};

        String[] b = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};

        System.out.println("array 1 : " + Arrays.toString(a));
        System.out.println("array 2 : " + Arrays.toString(b));

        HashSet<String> set = new HashSet<String>();

        for (int i = 0 ;i < a.length ; i++){

            for ( int j = 0 ; j<b.length ; j++){

                if (a[i].equals(b[j])){

                    set.add(a[i]);
                }
            }
        }

        System.out.println(set);
    }
}
