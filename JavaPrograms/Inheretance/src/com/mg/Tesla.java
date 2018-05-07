package com.mg;

public class Tesla extends Car {



    public Tesla() {
        super("Tesla",3, 5, 5, 5, false);
    }

    public int autoPilot(int obstracle){


        if(obstracle == 0){
            System.out.println("Tesla goes straight");
        }else if(obstracle == 1){
            System.out.println("Tesla goes right");
        }else if (obstracle == 2){
            System.out.println("Tesla goes left");
        }else {
            System.out.println("Tesla stops");
        }
        return 0;

    }


}
