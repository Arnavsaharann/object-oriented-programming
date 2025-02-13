package com.bridgelabz.objectmodeling.levelone;

import java.util.ArrayList;
import java.util.List;

// Represents a Bank that manages multiple customers
class Bank {
    private String name;
    private List<Customer> customers; // Stores all customers of the bank

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    // Adds a new customer to the bank
    public void openAccount(Customer customer) {
        customers.add(customer);
        System.out.println("Account opened for " + customer.getName() + " at " + name);
    }

    public String getName() {
        return name;
    }
}

// Represents a Bank Account with an account number and balance
class BankAccount {
    private static int nextAccountNumber = 1001; // Auto-incremented for each new account
    private int accountNumber;
    private double balance;

    public BankAccount(double balance) {
        this.accountNumber = nextAccountNumber++; // Assigns a unique account number
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Deposits money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " into Account #" + accountNumber);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraws money from the account if balance is sufficient
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from Account #" + accountNumber);
        } else {
            System.out.println("Insufficient balance in Account #" + accountNumber);
        }
    }
}

// Represents a Customer who has multiple bank accounts
class Customer {
    private String name;
    private List<BankAccount> accounts; // Stores all accounts belonging to the customer
    private Bank bank; // Reference to the associated bank

    public Customer(String name, Bank bank) {
        this.name = name;
        this.bank = bank;
        this.accounts = new ArrayList<>();
        bank.openAccount(this); // Adds the customer to the bank
    }

    // Opens a new account for the customer with an initial deposit
    public void addAccount(double initialDeposit) {
        BankAccount newAccount = new BankAccount(initialDeposit);
        accounts.add(newAccount);
        System.out.println(name + " opened Account #" + newAccount.getAccountNumber() + " with " + initialDeposit);
    }

    // Displays the balance of all accounts owned by the customer
    public void viewBalance() {
        System.out.println("\nBalances for " + name + ":");
        for (BankAccount account : accounts) {
            System.out.println("Account #" + account.getAccountNumber() + ": " + account.getBalance());
        }
    }

    // Deposits money into a specific account based on account number
    public void depositToAccount(int accountNumber, double amount) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.deposit(amount);
                return;
            }
        }
        System.out.println("Account #" + accountNumber + " not found!");
    }

    // Withdraws money from a specific account if the account exists
    public void withdrawFromAccount(int accountNumber, double amount) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.withdraw(amount);
                return;
            }
        }
        System.out.println("Account #" + accountNumber + " not found!");
    }

    public String getName() {
        return name;
    }
}

// Main class to execute the Bank System
public class BankSystem {
    public static void main(String[] args) {
        // Create a Bank
        Bank myBank = new Bank("Global Bank");

        // Create Customers and Open Accounts
        Customer cust1 = new Customer("Alice", myBank);
        cust1.addAccount(500);
        cust1.addAccount(1500);

        Customer cust2 = new Customer("Bob", myBank);
        cust2.addAccount(1000);

        // Display Initial Balances
        cust1.viewBalance();
        cust2.viewBalance();

        // Perform Transactions
        cust1.depositToAccount(1001, 200);
        cust1.withdrawFromAccount(1001, 300);
        cust2.withdrawFromAccount(1002, 500);

        // Display Updated Balances
        cust1.viewBalance();
        cust2.viewBalance();
    }
}
