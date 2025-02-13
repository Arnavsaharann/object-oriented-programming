package com.bridgelabz.encapsulationpolymorphisminterfaceandabstractclass.levelone;

public class EmployeeManagementSystem {
    public static void main(String[] args){
        FullTimeEmployee emp1 = new FullTimeEmployee(101, "Arnav", 50000, 20000);
        PartTimeEmployee emp2 = new PartTimeEmployee(102, "Mayank", 30000, 20, 500);

        emp1.assignDepartment("SDE");
        emp2.assignDepartment("customer Support");

        emp1 .displayDetails();
        emp2.displayDetails();
    }
}
abstract class Employee{
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("\nEmployee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Total Salary: " + calculateSalary());
    }

    public int getEmployeeId(){
        return employeeId;
    }
    public String getName(){
        return name;
    }
    public double getBaseSalary(){
        return baseSalary;
    }
}

interface Department {
    void assignDepartment(String department);
    String getDepartmentDetails();
}


class FullTimeEmployee extends Employee implements Department{
    private double Bonus;
    private String department;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double Bonus) {
        super(employeeId, name, baseSalary);
        this.Bonus = Bonus;
    }

    public double calculateSalary() {
        return getBaseSalary() + Bonus;
    }
    public void assignDepartment(String department){
        this.department = department;
    }
    public String getDepartmentDetails(){
        return department;
    }

}

class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private double hourlyRate;
    private String department;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Implementing abstract method
    @Override
    public double calculateSalary() {
        return getBaseSalary() + (hoursWorked * hourlyRate);
    }

    // Implementing Department interface
    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}