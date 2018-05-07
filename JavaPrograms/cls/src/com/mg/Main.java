package com.mg;



public class Main {

    public static void main(String[] args) {
	// write your code here

        BankAccount mgAccount = new BankAccount("1234" , 2.3);
        System.out.println(mgAccount.getAccountNumber());
        mgAccount.DepositeFunds(1000);
        mgAccount.WithdrawFunds(30);

    }
}
