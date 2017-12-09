package com.mg;

public class Printer {

    private int tonerLevel  ;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplexPrinter) {
        if(tonerLevel>0 && tonerLevel<=100) {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = 0;
        this.duplexPrinter = duplexPrinter;
    }

    public void fillToner(int newInk){
        this.tonerLevel = this.tonerLevel + newInk;
        System.out.println("the new ink level =  " + this.tonerLevel);

    }

    public void printingPage(int page){
        this.pagesPrinted = this.pagesPrinted + page;
        System.out.println("total no of pages = " + this.pagesPrinted);

    }

    public int getTonerLevel() {
        return this.tonerLevel;
    }

    public int getPagesPrinted() {
        return this.pagesPrinted;
    }
}


