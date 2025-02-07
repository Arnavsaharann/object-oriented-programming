package com.bridgelabz.constructors.levelone;

public class EmployeeManagement {
    public static void main(String[] args){
        Manager manager = new Manager(101, "IT", 80000, "Team 1");
        manager.displayEmployeeDetails();
    }
}

class Employee {
    public int employeeID; // Public: Accessible anywhere
    protected String department; // Protected: Accessible in subclass
    private double salary; // Private: Only accessible via getter/setter

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }

}


class Manager extends Employee {
    private String team;

    public Manager(int employeeID, String department, double salary,String team){
        super(employeeID,department,salary);
        this.team = team;
    }

    @Override
    public void displayEmployeeDetails(){
        super.displayEmployeeDetails();
        System.out.println("team: " + team);
    }

}