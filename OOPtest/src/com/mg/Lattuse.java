package com.mg;

public class Lattuse {

    private int lattuseNo;
    public int lattuseTotal;



    public Lattuse(int lattuseNo    ) {
        this.lattuseNo = lattuseNo;


    }

    public void latuseAmount(){
        this.lattuseTotal = this.lattuseNo * 2;
        System.out.println("the number of lattuse = " + this.lattuseNo + "\n" + "total lattuse amount = " + this.lattuseTotal);

    }

    public int getLattuseNo() {
        return lattuseNo;
    }



}
