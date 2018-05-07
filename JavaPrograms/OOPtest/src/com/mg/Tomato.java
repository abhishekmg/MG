package com.mg;

public class Tomato {

    private int tomatoNo;
    public int tomatoTotal;


    public Tomato(int lattuseNo ) {
        this.tomatoNo = lattuseNo;


    }

    public void tomatoAmount(){

        tomatoTotal = this.tomatoNo * 3;
        System.out.println("the number of tomato = " + this.tomatoNo + "\n" + "total tomato amount = " + tomatoTotal);

    }

    public int getTomatoNo() {
        return tomatoNo;
    }


}
