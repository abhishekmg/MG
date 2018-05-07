package com.mg;

public class Main {

    public static void main(String[] args) {

        Lattuse lattuse = new Lattuse(2);
        lattuse.latuseAmount();
        Tomato tomato = new Tomato(3);
        tomato.tomatoAmount();
        Onion onion = new Onion(3);
        onion.onionAmount();
        Moyanese moyanese = new Moyanese(2);
        moyanese.moyaneseAmount();

        Hamburger hamburger = new Hamburger("wheat" , "chicken" ,lattuse,tomato,onion,moyanese);
        hamburger.hamburger();
        hamburger.totalCost();






    }
}
