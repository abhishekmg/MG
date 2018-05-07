package com.mg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int a ,b,c;
        Scanner s = new Scanner(System.in);

        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        int ans = Math.min(Math.min(a,b),c);

        System.out.println("the min is " + ans);

        double avg = (a+b+c)/3;

        System.out.println("avg : " + avg);
    }
}
