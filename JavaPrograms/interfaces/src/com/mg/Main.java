package com.mg;

public class Main {

    public static void main(String[] args) {

        ITelephone phone;
        phone = new DeskPhone(123344);
        phone.poweron();
        phone.dial(3242);
        phone.callPhone(3242);
        phone.answer();
    }
}
