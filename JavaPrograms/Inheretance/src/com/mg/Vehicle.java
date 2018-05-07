package com.mg;

public class Vehicle {

    private String Name;
    private int Size;

    private int currentVelosity;
    private int currentDirection;


    public Vehicle(String name, int size) {
        this.Name = name;
        this.Size = size;

        this.currentDirection = 0;
        this.currentVelosity = 0;
    }

    public void Steer(int Direction){
        this.currentDirection += Direction;
        System.out.println("Vehicle.Steer() is of direction = " + Direction + " degrees");
    }

    public void move(int Velosity , int Direction){
        this.currentDirection = Direction;
        this.currentVelosity = Velosity;
        System.out.println("Vehicle.move() is of speed = " + Velosity + " and of direction = " + Direction);

    }

    public String getName() {
        return Name;
    }

    public int getSize() {
        return Size;
    }

    public int getCurrentVelosity() {
        return currentVelosity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop(){
        this.currentVelosity = 0 ;
    }
}
