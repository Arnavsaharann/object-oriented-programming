package com.bridgelabz.staticinstancefinalkeywords.levelone;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Setting company name before creating employees
        Employee.setCompanyName("TechCorp Ltd.");

        // Creating Employees
        Employee emp1 = new Employee("Arnav Saharan", 101, "Software Engineer");
        Employee emp2 = new Employee("Mayank", 102, "Data Analyst");

        // Display Company Name
        Employee.displayCompanyName();
        System.out.println(); // Line break

        // Display Employee Details
        emp1.displayEmployeeDetails();
        System.out.println(); // Line break
        emp2.displayEmployeeDetails();
        System.out.println(); // Line break

        // Display Total Employees
        Employee.displayTotalEmployees();
    }
}

class Employee {
    private static String companyName; //  Static variable shared by all employees
    private static int totalEmployees = 0; //  Tracks total employee count

    private String name;
    private final int id; //  Final variable (cannot be changed after assignment)
    private String designation;

    //  Static method to set company name
    public static void setCompanyName(String name) {
        companyName = name;
    }

    //  Static method to display company name
    public static void displayCompanyName() {
        System.out.println("Company Name: " + companyName);
    }

    //  Constructor using `this` to initialize attributes
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;  //  Final variable must be initialized here
        this.designation = designation;
        totalEmployees++; //  Increment total employees count
    }

    //  Static method to display total employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    //  Display Employee Details (Uses instanceof check)
    public void displayEmployeeDetails() {
        if (this instanceof Employee) { //  Ensures it's an Employee object before displaying
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + id);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("Invalid Employee Object");
        }
    }
}
