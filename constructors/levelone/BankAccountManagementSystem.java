package com.bridgelabz.constructors.levelone;

public class BankAccountManagementSystem {
    public static void main(String[] args){
        SavingsAccount account = new SavingsAccount("1212", "arnav", 23313133, "Savings Account" );
        account.displayBankAccountDetails();
    }
}

class BankAccount{
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(){

    }

    public BankAccount(String accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void setBalance(double balance){
        this.balance =  balance;
    }
    public double getBalance(){
        return this.balance;
    }

    public void displayBankAccountDetails(){
        System.out.println("accountNumber: " + accountNumber);
        System.out.println("accountHolder: " + accountHolder);
        System.out.println("balance: " + balance);
    }

}
class SavingsAccount extends BankAccount{
    public String typeOfAccount;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, String typeOfAccount){
        /*
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.setBalance(balance);
        this.typeOfAccount = typeOfAccount;
        */
        super(accountNumber, accountHolder, balance); //  Calling parent constructor
        this.typeOfAccount = typeOfAccount;
    }

    public void displayBankAccountDetails(){
        /*
        System.out.println("accountNumber: " + accountNumber);
        System.out.println("accountHolder: " + accountHolder);
        System.out.println("balance: " + getBalance());
        System.out.println("balance: " + typeOfAccount);
        */
        super.displayBankAccountDetails(); //  Calls parent method to avoid duplicate code
        System.out.println("Type of Account: " + typeOfAccount);
    }

}


