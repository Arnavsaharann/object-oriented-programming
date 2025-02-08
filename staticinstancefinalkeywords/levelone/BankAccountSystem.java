package com.bridgelabz.staticinstancefinalkeywords.levelone;

public class BankAccountSystem{
    public static void main(String[] args){
        BankAccount account1 = new BankAccount("Arnav Saharan", 123456789012L, 5000.50);
        BankAccount account2 = new BankAccount("Mayank", 987654321098L, 10000.75);

        account1.displayAccountDetails();
        System.out.println(); // Line break
        account2.displayAccountDetails();
        System.out.println(); // Line break
        BankAccount.getTotalAccounts();
    }
}

class BankAccount{
    private static String bankName = " SBI";
    private static int totalAccounts = 0;
    private String accountHolderName;
    private final long accountNumber; // Final variable (cannot change once assigned)
    private double balance;

    public BankAccount(String accountHolderName, long accountNumber, double balance) {
        this.accountHolderName = accountHolderName; // `this` used to differentiate
        this.accountNumber = accountNumber; // Final variable initialized here
        this.balance = balance;
        totalAccounts++; // Increase account count on every new object creation
    }
    public static void getTotalAccounts() {
        System.out.println("Total Bank Accounts Created: " + totalAccounts);
    }

    public void displayAccountDetails(){
        if(this instanceof BankAccount){
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }else {
            System.out.println("Invalid Account Object");
        }
    }
}
