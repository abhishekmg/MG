package com.mg;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int [] myIntegers = getIntegers(5);
        for(int i=0 ; i<myIntegers.length ; i++){
            System.out.println("element number " + i + " is " + myIntegers[i]);
        }
        System.out.println("the average is " + getAverage(myIntegers));


    }

    public static int[] getIntegers(int number){
        int[] value = new int[number];
        System.out.println("enter " + value.length + " numbers \r");
        for(int i=0 ; i<value.length ;i++){
            value[i] = scanner.nextInt();
        }
        return value;

    }

    public static double getAverage(int[] array){
        int sum = 0;
        for (int i=0 ; i<array.length ; i++){
            sum = sum + array[i];
        }
        return (double) sum / array.length;




    }
}
