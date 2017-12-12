package com.mg;

public class Main {

    public static void main(String[] args) {

        Lattuse lattuse = new Lattuse(2);
        lattuse.latuseAmount();
        Tomato tomato = new Tomato(2);
        tomato.tomatoAmount();
        Onion onion = new Onion(2);
        onion.onionAmount();
        Moyanese moyanese = new Moyanese(1);
        moyanese.moyaneseAmount();

        Hamburger hamburger = new Hamburger("garlic" , "chicken" ,lattuse,tomato,onion,moyanese);
        hamburger.hamburger();
        hamburger.totalCost();






    }
}
