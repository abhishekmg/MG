package com.mg;

public class Main {

    public static void main(String[] args) {

        VipCustomer mg1 = new VipCustomer();
        System.out.println(mg1.getName());

        VipCustomer mg2 = new VipCustomer("mg" , 3.4);
        System.out.println(mg2.getName());

        VipCustomer mg3 = new VipCustomer("mg2" , 4.5 , "mg@mg.com");
        System.out.println(mg3.getName());


    }
}
