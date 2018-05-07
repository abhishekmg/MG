package com.mg;

public class Main {

    public static void main(String[] args) {
	// print duplicate strings

        String[]  a =  {"bba","bdf","bba","kaj"};

        for (int i = 0 ; i<a.length ; i++){

            for (int j = i+1 ; j<a.length ; j++){

                if ((a[i].equals(a[j])) && (i!=j)){
                    System.out.println("the duplicate values are : " + a[j]);
                }
            }
        }
    }
}
