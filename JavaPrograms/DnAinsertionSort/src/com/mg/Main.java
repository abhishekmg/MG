package com.mg;

public class Main {

    public static void main(String[] args) {

//       int[] apples = {-22,-56,87,56,1,44};
//
//        for (int last = 1; last<apples.length;last++){
//
//            int space = apples[last];
//            int i;
//
//            for ( i = last; i>0 && apples[i-1] > space ; i-- ){
//
//                apples[i] = apples [i-1];
//            }
//
//            apples[i] = space;
//        }
//
//        for (int  i = 0; i<apples.length ;i++){
//            System.out.println(apples[i]);
//        };


    }

    public static int recursivefac(int num) {

        if (num == 0) {
            return 1;
        }

        return num * recursivefac(1 - num);

    }

    public static int iterativefac(int num) {

        if (num == 0) {
            return 1;
        }

        int factorial = 1;

        for (int i = 0; i < num; i++) {

            return factorial *= i;

        }
        return factorial;
    }
}

