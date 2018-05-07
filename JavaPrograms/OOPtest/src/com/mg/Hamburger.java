package com.mg;

public class Hamburger {

    private String breadRollType;
    private String meat;
    private Lattuse lattuse;
    private Tomato tomato;
    private Onion onion;
    private Moyanese moyanese;

    public Hamburger(String breadRollType, String meat, Lattuse lattuse, Tomato tomato, Onion onion, Moyanese moyanese) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.lattuse = lattuse;
        this.tomato = tomato;
        this.onion = onion;
        this.moyanese = moyanese;
    }

    public void hamburger(){
        System.out.println("your hamburger bread is = " + this.breadRollType + " , meat type = " + this.meat);
    }

    public void totalCost(){
        int totalCoset = lattuse.lattuseTotal + onion.onionTotal + tomato.tomatoTotal + moyanese.moyaneseTotal;
        System.out.println("total cost of your hamburger = " + totalCoset);
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }
}
