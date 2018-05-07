package com.mg;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("234451345");

    public static void main(String[] args) {
	// write your code here

        boolean quit = false;
        startPhone();
        printActions();
        while (!quit){
    }



    }


    private static void startPhone(){
        System.out.println("Starting phone.............");
    }

    private static void printActions(){
        System.out.println("Available actions : \nPress");
        System.out.println("0 - to shut down\n" +
                           "1 - to print new contact\n" +
        "2 - to add new contact\n" + "3 - to update new contact\n" + " 4 - to remove an existing contact\n " + " 5 - query if ann existing contact exists\n"
        + " 6 - to print list of available actions\n");
        System.out.println("Choose your action");
    }




}
