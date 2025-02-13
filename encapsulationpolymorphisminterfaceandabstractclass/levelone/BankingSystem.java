package com.bridgelabz.encapsulationpolymorphisminterfaceandabstractclass.levelone;

import java.util.ArrayList;

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(1001, "Arnav Saharan", 5000, 0.04);
        BankAccount current = new CurrentAccount(2002, "Mayank Pal", 10000, 5000);

        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.add(savings);
        accounts.add(current);

        for (BankAccount account : accounts) {
            account.displayAccountDetails();
            account.calculateInterest();
            System.out.println();
        }

        savings.applyForLoan(20000);
        current.applyForLoan(30000);
    }
}

abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Holder: " + holderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public abstract void calculateInterest();
    public abstract void applyForLoan(double loanAmount);
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        balance += balance * interestRate;
    }

    public void applyForLoan(double loanAmount) {
        System.out.println(getHolderName() + " applied for loan: " + loanAmount);
        System.out.println("Loan eligibility: ₹" + getBalance() * 2);
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void calculateInterest() {}

    public void withdraw(double amount) {
        if (amount <= (balance + overdraftLimit)) {
            balance -= amount;
        }
    }

    public void applyForLoan(double loanAmount) {
        System.out.println(getHolderName() + " applied for business loan: ₹" + loanAmount);
        System.out.println("Loan eligibility: ₹" + (getBalance() + overdraftLimit) * 1.5);
    }
}
