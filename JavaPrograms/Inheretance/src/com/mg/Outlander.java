package com.mg;

public class Outlander extends Car {

    private int roadServiceMonths;

    public Outlander(int roadServiceMonths) {
        super("Outlander",3, 5, 5, 5, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate){

        int newVelosity = getCurrentVelosity() + rate;

        if(newVelosity == 0 ){
            stop();
            changeGear(1);
    }else if(newVelosity==0 && newVelosity<=10){
        changeGear(1);
    }else if (newVelosity>10 && newVelosity<=20){
        changeGear(2);
    }else if (newVelosity>20&&newVelosity<=30){
        changeGear(3);
    }else {
        changeGear(4);
    }

        if (newVelosity>0){
        changeVelosity(newVelosity,getCurrentDirection());
    }






    }



}
