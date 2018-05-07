package com.mg;

public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void poweron() {
        System.out.println("no action");

    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("now ringing" + phoneNumber);

    }

    @Override
    public void answer() {
        if (isRinging == true){
            System.out.println("answering");
            isRinging = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber){
            isRinging = true;
            System.out.println("ring ring");
        }else {
            isRinging = false;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
