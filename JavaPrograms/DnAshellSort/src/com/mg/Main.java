package com.mg;

public class Main {

    public static void main(String[] args) {

        int[] apples = {-22,-56,77,89,4,6,-1};

        for (int gap = apples.length/2 ; gap>0 ; gap/=2){

            for (int i = gap ; i<apples.length ; i++){

                int storage = apples[i];

                int j = i;

                while (j>=gap && apples[j-gap] > storage ){

                    apples[j] = apples[j-gap];
                    j-=gap;

                }

                apples[j] = storage;
            }


        }

        for (int i = 0 ; i<apples.length ; i++){
            System.out.println(apples[i]);
        }

    }
}
