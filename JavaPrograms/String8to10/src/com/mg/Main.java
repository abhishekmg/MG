package com.mg;

public class Main {

    public static void main(String[] args) {
	// 8 -test if a given string contains the specified sequence of char values.

        String a = "there is a phone and a notebook";

        String b = "and";

        System.out.println(a.contains(b));



        // 9 - to compare a given string to the specified character sequence.

        String c = "and" , d = "And" , e = "and";

        System.out.println(c.contentEquals(e));
        System.out.println(d.contentEquals(e));

    }
}
