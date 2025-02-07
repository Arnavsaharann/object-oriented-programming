package com.bridgelabz.classandobject.leveltwo;

public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // constructor to initialize value
    public BankAccount(String accountNumber, String accountHolder,double balance ){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // method to deposit amount
    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // method to withdraw amount
    public void withdraw(double amount){
        if(balance < amount){
            System.out.println("not enough balance");
        }else{
            balance -= amount;
            System.out.println("balance: " + amount);
        }
    }

    // method to display amount
    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
    }


    public static void main(String[] args){
        BankAccount account = new BankAccount("Arnav Saharan", "1234567890", 1000.0);
        account.displayBalance();

        account.deposit(500);
        account.displayBalance();

        account.withdraw(300);
        account.displayBalance();

        account.withdraw(1500);
    }
}
