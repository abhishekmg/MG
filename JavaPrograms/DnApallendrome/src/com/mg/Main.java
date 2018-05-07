package com.mg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        String str , rev = "";
//
        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("enter name = ");
//        str = scanner.nextLine();
//
//        int length = str.length();
//
//        for (int i = length-1 ; i>=0 ;i--){
//            rev = rev + str.charAt(i);
//        }

//        if (str.equals(rev)){
//            System.out.println("is pallendrome");
//        }else{
//            System.out.println("is not");
//        }


        String[] a = {"abc" , "v" , "abcd" , "abc" , "b" ,"ncm"};
        String q = "abc";

        int count = 0 ;

        for (int i = 0 ; i<a.length ; i++){

            if (a[i] != null){

                if (a[i].equals(q)){
                    count++;
                }
            }

        }

        System.out.println(count);







    }
}
