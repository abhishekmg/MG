package com.mg ;



class Car {
    public int cylinders;
    public int wheels;
    public boolean engine;
    public int speed;

    public Car(int cylinders, int wheels, boolean engine,int speed) {
        this.cylinders = cylinders;
        this.wheels = wheels;
        this.engine = engine;
        this.speed = speed;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }
    public int getSpeed(){
        return speed;
    }

    public void startEngine(){
        if(engine==true){
            System.out.println("the engine has started");
        }else{
            System.out.println("the engine is off");
        }
    }

    public void accelerate(){
        if(speed>0){
            System.out.println("car is going at " + speed);
        }else {
            System.out.println("the car has stopped");
        }
    }
}

class i10 extends Car{

    public i10(int cylinders, int wheels, boolean engine, int speed) {
        super(cylinders, wheels, engine, speed);
    }

    @Override
    public void startEngine() {
        if(engine==true){
            System.out.println("i10 engine has started");
        }else{
            System.out.println("i10 engine is off");
        }
    }

    @Override
    public void accelerate() {
        if(speed>0){
            System.out.println("i10 is going at " + speed);
        }else {
            System.out.println("i10 has stopped");
        }
    }
}

class sonata extends Car{
    public sonata(int cylinders, int wheels, boolean engine, int speed) {
        super(cylinders, wheels, engine, speed);
    }

    @Override
    public void startEngine() {
        if(engine==true){
            System.out.println("sonata engine has started");
        }else{
            System.out.println("sonata engine is off");
        }

    }

    @Override
    public void accelerate() {
        if(speed>0){
            System.out.println("sonata is going at " + speed);
        }else {
            System.out.println("sonata has stopped");
        }
    }
}





public class Main {

    public static void main(String[] args) {

        Car car = new Car(4,4,true,4);
        car.startEngine();
        car.accelerate();
        i10 i10 = new i10(4,4,false,8);
        i10.accelerate();
        i10.startEngine();
        sonata sonata = new sonata(5,4,false,0);
        sonata.accelerate();
        sonata.startEngine();


    }
}
