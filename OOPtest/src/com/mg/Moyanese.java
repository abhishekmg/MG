package com.mg;

public class Moyanese {

    private int moyaneseScoop;
    public int moyaneseTotal;



    public Moyanese(int lattuseNo ) {
        this.moyaneseScoop = lattuseNo;


    }

    public void moyaneseAmount(){

        moyaneseTotal = this.moyaneseScoop * 4;
        System.out.println("the number of moyanese = " + this.moyaneseScoop + "\n" + "total moyanese amount = " + moyaneseTotal);

    }

    public int getMoyaneseScoop() {
        return moyaneseScoop;
    }


}
