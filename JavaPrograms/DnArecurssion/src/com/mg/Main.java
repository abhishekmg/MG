package com.mg;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }


    public static int recursivefac(int num){

        if (num ==0){
            return 1;
        }

        return num *recursivefac(1-num);

    }

    public static int iterativefac(int num){

        if (num == 0){
            return 1;
        }

        int factorial = 1;

        for (int i  = 0 ; i<num ; i++){

            return factorial *=i;

        }
        return factorial;
    }
}
