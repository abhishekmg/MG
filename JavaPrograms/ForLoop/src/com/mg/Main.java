package com.mg;

public class Main {

    public static void main(String[] args) {

        for (int i = 2; i <= 8; i++) {
            System.out.println("the interest is " + i + " = " + calculateInterest(1000.0, i));

        }

        System.out.println("--------------------");

        for (int j = 8; j >= 2; j--) {

            System.out.println("the interest is " + j + " = " + calculateInterest(1000.0, j));


        }

        System.out.println("======================================");
        int i;
        int count = 0;
        for ( i = 1; count< 3; i++) {
            if (isPrime(i)) {
                System.out.println("number " + i + " is a prime ");
                count++;

                if (count == 10) {
                    System.out.println("exiting loop");
                    break;
                }
            }
        }

    }

    public static boolean isPrime(int n) {
        if (n == 1)
            return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate) / 100);
    }


}

