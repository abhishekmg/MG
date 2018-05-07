package com.mg;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Bank> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Bank>();
    }

    public boolean addBranch(String branchName){
        if (findBranch(branchName) == null){
            this.branches.add(new Bank(branchName));
            return true;
        }
        return false;

    }

    public boolean addCustomer(String branchName , String customerName , double intialAmount){

        Branch branch = findBranch(branchName);
        if (branch != null){
            return branch.newCustomer(customerName,intialAmount);
        }
        return false;
    }

    public boolean addCustomerTrasaction(String branchName , String customerName , double amount){
        Branch branch = findBranch(branchName);
        if (branch != null){
            return branch.addCustomerTransaction(customerName,amount);
        }
        return false;


    }
}
