package com.mg;

public class Main {

    public static void main(String[] args) {
        // 11 -  create a new String object with the contents of a character array.

        char[] a = new char[]{'1', '2', '3', '4'};

        String str = String.copyValueOf(a, 1, 3);

        System.out.println("book has " + str + " pages ");


        // 12 -check whether a given string ends with the contents of another string.
        String str1 = "Python Exercises";
        String str2 = "Python Exercise";

        String end = "es";

        System.out.println(str1.endsWith(end));
        System.out.println(str2.endsWith(end));

        // 13  - check if two strings contain the same data

        String s = "apples";
        String s1 = "banana";

        System.out.println(s.equals(s1));

        // 14  - to compair two strings ingnoreing cases

        String b = "apples";
        String b1 = "APPLES";
        System.out.println(b.equalsIgnoreCase(b1));




    }
}