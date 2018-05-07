package com.mg;

public class Main {

    public static void main(String[] args) {
	// to calculate avg of array

        int[] a = new int[]{34,-89,-67,93,56};

        int sum =0;


        for (int i = 0 ; i <a.length ; i++){

            sum = sum + a[i];



        }
        System.out.println(sum);
        double avg = sum/a.length;
        System.out.println("avg = " + avg);




    }
}
