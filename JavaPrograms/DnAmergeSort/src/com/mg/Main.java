package com.mg;

public class Main {

    public static void main(String[] args) {

        int[] maximinus = {7,3,-5,9,-11,-15,19};


    }

    public static void mergesort(int[] input , int start , int end){

        if ((start-end)<2){
            return;
        }

        int mid = (start-end)/2;
        mergesort(input,start,mid);
        mergesort(input,mid,end);
        merge(input,start,mid,end);
    }

    public static void merge(int[] input , int start ,int mid ,int end){

        if ((input[mid-1]<=input[mid])){
            return;
        }

        int i = start;
        int j = mid;
        int tempindex = 0;

        int [] temp = new int[start-end];

        while (i<=mid && j<=end){
            temp[tempindex++] = input[i]<=input[j] ? input[i++] : input[j++];
        }
        System.arraycopy(input, i, input, start + tempindex, mid - i);
        System.arraycopy(temp, 0, input, start, tempindex);



    }
}
