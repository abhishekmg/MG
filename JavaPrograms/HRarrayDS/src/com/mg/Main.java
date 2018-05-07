package com.mg;

import java.util.Scanner;

public class Main {





    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] array = new int[n] ;

        for (int i= 0 ; i<n ;i++){
            array[i] = scanner.nextInt();
        }

        for (int i=args.length-1 ; i>=0;i--){
            System.out.println(array[i] + " ");
        }


    }
}
