package com.mg;

public class MobilePhone implements ITelephone{

    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void poweron() {
        if (isOn) {
            System.out.println("powering up");
        }else
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
        if (phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println("ring ring");
        }else {
            System.out.println("phone is off");
            isRinging = false;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
