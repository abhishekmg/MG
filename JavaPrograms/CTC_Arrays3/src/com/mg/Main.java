package com.mg;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        String a ;

        Scanner s = new Scanner(System.in);

        a = s.nextLine();

        String b = a.replaceAll("\\s" , "%2d");

        System.out.println("output : " + b);




    }








}




