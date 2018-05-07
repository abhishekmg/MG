package com.mg;

public class Main {

    public static void main(String[] args) {
	// write your code here
        GearBox maclarine = new GearBox(6);
        GearBox.Gear frist = maclarine.new Gear(1,3.4);
        System.out.println(frist.driveSpeed(3));
    }
}
