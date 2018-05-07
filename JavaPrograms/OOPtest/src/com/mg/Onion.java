package com.mg;

public class Onion {

    private int onionNo;
    public int onionTotal;






    public Onion(int lattuseNo ) {
        this.onionNo = lattuseNo;


    }

    public void onionAmount(){

        onionTotal = this.onionNo * 3;
        System.out.println("the number of onion = " + this.onionNo + "\n" + "total onion amount = " + onionTotal);

    }

    public int getOnionNo() {
        return onionNo;
    }


}
