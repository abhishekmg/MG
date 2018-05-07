package com.mg;

public class Bed {

    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int qiult;

    public Bed(String style, int pillows, int height, int sheets, int qiult) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.qiult = qiult;
    }

    public void make(){
        System.out.println("bed -> making");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQiult() {
        return qiult;
    }
}
