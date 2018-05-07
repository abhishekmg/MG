package com.mg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        String a ;
        Scanner s = new Scanner(System.in);
        a = s.nextLine();

        permutation(" " , a);

        System.out.println("===========");

        rev(" " , a);

        for (int i = 0 ; i < permutation(" " , a).size() ; i++ ){

        }



    }

    public static ArrayList <String> permutation(String perfix , String input) {

        int n = input.length();

        ArrayList list = null;
        if (n == 0) {
            System.out.println(perfix);
        } else {
            for (int i = 0; i < n; i++) {
                list.addAll(permutation(" " , input));
            }
        }

        return list;

    }

    public static void rev(String rev , String input){


        for (int i = input.length()-1 ; i >=0 ; i--){
            rev = rev + input.charAt(i);
        }

        System.out.println(rev);
    }







}

