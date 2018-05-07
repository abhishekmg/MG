package com.mg;

public class Furniture {

    public String sofa;
    public String chair;
    public String table;



    public Furniture(String sofa, String chair, String table) {
        this.sofa = sofa;
        this.chair = chair;
        this.table = table;
    }

    public void sofaColor(String sofa){

        System.out.println("the color of sofa is " + sofa);
    }

    public void chairColor(String chair){
        System.out.println("the color of the chair is " + chair);
    }

    public void tableColor(String table){
        System.out.println("the color of the table is " + table);
    }

    public String getSofa() {
        return sofa;
    }

    public String getChair() {
        return chair;
    }

    public String getTable() {
        return table;
    }

    public void setSofa(String sofa) {
        this.sofa = sofa;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }

    public void setTable(String table) {
        this.table = table;
    }
}
