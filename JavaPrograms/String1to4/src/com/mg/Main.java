package com.mg;

public class Main {

    public static void main(String[] args) {
	// 1 -  get the character at the given index within the String

        String a = "what up bro!";



        System.out.println("the char at index 2 is :" + a.charAt(8));

        // 2 - get unicode character at give index



        System.out.println(a.codePointAt(3));

        // 3 -  get the character (Unicode code point) before the specified index within the String.

        System.out.println(a.codePointBefore(7));

        // 4 -  count a number of Unicode code points in the specified text range of a String.

        System.out.println(a.codePointCount(2,7));





    }
}
