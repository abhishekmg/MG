package com.mg;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class Branch {

    private String name;
    private ArrayList<Customer> customer;

    public Branch(String name) {
        this.name = name;
        this.customer = new ArrayList<Customer>();
    }

    public boolean newCustomer(String customerName , double initialAmount){
        if(findCustomer(customerName) == null){
            this.customer.add(new Customer(customerName , initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction( String customerName , double amount){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName){
        for(int i = 0 ; i<=customer.size() ;  i++){
            Customer checkedCustomer = this.customer.get(i);
            if (checkedCustomer.getName().equals(customerName)){
                return checkedCustomer;
            }
        }
        return null;
    }


}
