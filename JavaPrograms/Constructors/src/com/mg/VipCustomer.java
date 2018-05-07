package com.mg;

public class VipCustomer {

    String Name;
    double CreditLimit;
    String Email;

    public VipCustomer(){
        this("default" , 3.4 , "def@def.com");
    }



    public VipCustomer(String Name , double CerditLimit){
        this( Name , CerditLimit , "def2@def.com");


    }

    public VipCustomer(String Name , double CreditLimit , String Email){
        this.Name = Name;
        this.CreditLimit = CreditLimit;
        this.Email = Email;
    }

    public String getName() {
        return Name;
    }

    public double getCreditLimit() {
        return CreditLimit;
    }

    public String getEmail() {
        return Email;
    }
}



