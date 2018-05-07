package com.mg;

public class Main {

    public static void main(String[] args) {

        int[] apples = {2,5,9,8,2,8,7,10,4,3};

        countsort(apples,1,10);

        for (int i=0;i<apples.length ; i++){
            System.out.println(apples[i]);
        }

    }

    public static void countsort(int[] input , int min , int max){

        int[] countarray = new int[(max-min) +1];

        for (int i = 0 ; i<=input.length ; i++){
            countarray[input[i] -min]++;
        }

        int j = 0;

        for (int i =min ; i<=max ; i++){
            while (countarray[i-min] >0){
                input[j++] = i;
                countarray[i-min]--;
            }
        }




    }
}
