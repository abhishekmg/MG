package com.mg;

public class Main {

    public static void main(String[] args) {

        int[] apples = {4,8,9,6,7,1,2};

        for (int last = apples.length-1; last>0 ; last--){
            for (int i = 0 ;i<last ; i++){
                if (apples[i] > apples[i+1]){
                    swap(apples,i,i+1);
                }
            }
        }

        for (int i = 0; i<apples.length ;i++){
            System.out.println(apples[i]);
        }



    }

    public static void swap(int array[] , int i ,int j){
        if (i==j)
            return;

        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }


}
