package com.mg;

public class BankAccount {

    String AccountNumber;
    double Balance;
    String CustomerName;
    String Email;
    String PhoneNumber;

    public BankAccount(String AccountNumber , double Balance){

       this.AccountNumber =AccountNumber;
       this.Balance = Balance;

    }

    public void DepositeFunds(double DepositeFunds){

        this.Balance += DepositeFunds;
        System.out.println("total funds = " + this.Balance);
    }

    public void WithdrawFunds(double WithdrawFunds){
        if(this.Balance - WithdrawFunds <= 0 ){
            System.out.println("not possible");
        }
        else{
            this.Balance -= WithdrawFunds;
            System.out.println("total funds = " + this.Balance);
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

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
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


