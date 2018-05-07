package com.mg;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String a = "football";
        String b = "football2";


        int result = a.compareTo(b);

        if (result==0)
            System.out.println(a + "is equal to " + b);
         if (result<0)
            System.out.println(a + " is less than " + b);
         if (result>0)
             System.out.println(a + " is greater than " + b );


         //  6 - compare two strings lexicographically, ignoring case differences


        int result2 = a.compareToIgnoreCase(b);

        // 7 - to concatinate strings

        String c = "PHP Exercises and ";
        String d = "Python Exercises";

        System.out.println(c.concat(d));







    }
}
