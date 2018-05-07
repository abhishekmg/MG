package com.mg;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(isRotation("waterbottle" , "erbottlewat"));





    }

    public static boolean isRotation(String a , String b){

        return (a.length() == b.length() && (a+a).contains(b));
    }


}
