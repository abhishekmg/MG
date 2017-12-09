package com.mg;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Player player = new Player("mg",200,"sword");


//        player.loseHealth(10);
//        System.out.println(player.healthRemaining());

        Printer printer = new Printer(30,2,true);
        printer.printingPage(3);
        printer.fillToner(50);


    }
}
