package com.bridgelabz.Inheritance.levelone;

public class BankingSystem {
    public static void main(String[] args){
        SavingsAccount savings = new SavingsAccount("SA12345", 50000, 4.5);
        CheckingAccount checking = new CheckingAccount("CA67890", 20000, 5000);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD11223", 100000, 5.5, 2);

        savings.displayAccountType();
        checking.displayAccountType();
        fixedDeposit.displayAccountType();
    }
}

class BankAccount{
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountType() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance:" + balance);
    }
}

class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        super.displayAccountType();
        System.out.println("Interest Rate: " + interestRate);
        System.out.println();
    }
}

class CheckingAccount extends BankAccount{
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }


    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account ");
        super.displayAccountType();
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
        System.out.println();
    }
}

class FixedDepositAccount extends BankAccount{
    private double interestRate;
    private int duration;


    public FixedDepositAccount(String accountNumber, double balance, double interestRate, int duration) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
        this.duration = duration;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account ");
        super.displayAccountType();
        System.out.println("interestRate: " + interestRate);
        System.out.println("duration: " + duration);
        System.out.println();
    }


}