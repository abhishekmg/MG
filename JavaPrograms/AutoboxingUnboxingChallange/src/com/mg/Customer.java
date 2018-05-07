package com.mg;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transcactions;

    public Customer(String name , double initialTransaction) {
        this.name = name;
        this.transcactions = new ArrayList<Double>();
        addTransaction(initialTransaction);
    }

    public void addTransaction(double amount){
        transcactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTranscactions() {
        return transcactions;
    }
}
