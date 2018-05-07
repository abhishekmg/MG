package com.mg;



public class Main {

    public static void main(String[] args) {
        // write your code here
        double centi = calcFeetAndInchesToCentimeters(23, 4.4);
        System.out.println(centi);
        centi = calcFeetAndInchesToCentimeters(156);



    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            System.out.println("invalid");
            return -1;
        }
        double centimeters = (feet) * 12 * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches = " + centimeters);
        return centimeters;

    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}




