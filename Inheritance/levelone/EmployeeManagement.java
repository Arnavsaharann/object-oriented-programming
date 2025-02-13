package com.bridgelabz.Inheritance.levelone;

class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Subclass: Manager
class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary); // Calls Employee constructor
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Calls Employee displayDetails()
        System.out.println("Team Size: " + teamSize);
        System.out.println();
    }
}

// Subclass: Developer
class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println();
    }
}

class Intern extends Employee {
    private int durationMonths;

    public Intern(String name, int id, double salary, int durationMonths) {
        super(name, id, salary);
        this.durationMonths = durationMonths;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + durationMonths + " months");
        System.out.println();
    }
}

// Main class
public class EmployeeManagement {
    public static void main(String[] args) {
        Manager manager = new Manager("Arnav", 101, 80000, 10);
        Developer developer = new Developer("Mayank", 102, 60000, "Java");
        Intern intern = new Intern("Vibhor", 103, 20000, 6);


        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
    }
}
