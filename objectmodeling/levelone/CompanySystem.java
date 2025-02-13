package com.bridgelabz.objectmodeling.levelone;

import java.util.ArrayList;

public class CompanySystem {
    public static void main(String[] args) {
        // Create a company
        Company myCompany = new Company("bridgelabz");

        Department dep1 = new Department("Engineering");
        Department dep2 = new Department("HR");


        myCompany.addDepartment(dep1);
        myCompany.addDepartment(dep2);

        // Add employees to departments before displaying
        Employee emp1 = new Employee("Phulsundar", 26);
        dep1.addEmployee(emp1);

        Employee emp2 = new Employee("Rohan", 27);
        dep2.addEmployee(emp2);


        myCompany.displayCompanyDetails();


    }
}
class Company{
    private String name;
    public ArrayList<Department> departments;


    public Company(String name){
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void displayCompanyDetails(){
        System.out.println("company name: " + name);
        for(Department department : departments){
            department.displayDepartmentDetails();
        }
    }
}
class Department{

    public String name;
    private ArrayList<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayDepartmentDetails(){
        System.out.println("name : " + name);
        for (Employee emp : employees) {
            emp.displayEmployeeDetails();
        }

    }
    public String getName() {
        return name;
    }
}
class Employee{
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }

}