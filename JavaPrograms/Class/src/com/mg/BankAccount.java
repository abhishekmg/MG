package com.mg;

public class BankAccount {
    private  String AccountNumber ;
    private double Balance;
    private String CusomerName;
    private String Email;
    private String PhoneNumber;

    public BankAccount(String AccountNumber , double Balance, String CusomerName , String Email , String PhoneNumber){

        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
        this.CusomerName = CusomerName;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;

    }

    public void DepositeFunds(double DepositeAmount){
        this.Balance += DepositeAmount;
        System.out.println("deposit of " + DepositeAmount + " made. total = " + this.Balance);

    }

    public void WithdrawFund(double WithdrawalAmount){

        if( this.Balance - WithdrawalAmount<= 0){
            System.out.println("only " + this.Balance + " available , withdrawal not proceed");
        }
        else{
            this.Balance -= WithdrawalAmount;
            System.out.println("withdrawal of " + WithdrawalAmount + " processed , remaining balance = " +this.Balance);
        }
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public String getCusomerName() {
        return CusomerName;
    }

    public void setCusomerName(String cusomerName) {
        CusomerName = cusomerName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
