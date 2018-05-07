package com.mg;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount mgAccount = new BankAccount("1224",0.0,"mg","mg@mg.com","1234");
        System.out.println(mgAccount.getAccountNumber());
        mgAccount.WithdrawFund(100);

        mgAccount.DepositeFunds(50);
        mgAccount.WithdrawFund(100);

        mgAccount.DepositeFunds(51);
        mgAccount.WithdrawFund(100);

        System.out.println("*******************************");

        for(int i = 0 ; i<11 ; i++){
            int a = (int) (Math.random() *10) + 1;
            System.out.println(a);
        }

        System.out.println("*******************************");

        double b = 5.6;
        int c = (int) b;
        System.out.println(c);








    }
}
