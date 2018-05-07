package com.mg;

public class Main {

    public static void main(String[] args) {
	//write your code here

//        Room room = new Room(new Furniture("white","blue" , "black"));
//        System.out.println(room.getFurniture());
//        room.getFurniture().sofaColor("green");

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(4 , 55);

        Bed bed = new Bed("mordern" ,2,4,1,1);

        Lamp lamp = new Lamp("mordern",false,67);

        Bedroom bedroom = new Bedroom("mg",wall1,wall2,wall3,wall4,ceiling,bed,lamp);

        bedroom.makeBed();

        lamp.turnOn();

    }
}
