package com.mg;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // ternary op

        boolean one = false;
        boolean two = one ?  true : false ;
        if (two)
            System.out.println("yep");
        else
            System.out.println("not yep");

        // test

        double first = 20;
        double second = 80;
        double total = (first + second) * 25;
        total = total % 40 ;
        System.out.println("ans = "  + total);
        if (total <= 20)
            System.out.println("total was over the limit");







    }
}
