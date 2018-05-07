package com.mg;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Outlander outlander = new Outlander(30);
        outlander.accelerate(30);
        Tesla tesla = new Tesla();
        System.out.println(tesla.autoPilot(7));

    }
}
