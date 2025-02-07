package com.bridgelabz.classandobject.levelone;

public class Employee {
    public String employeeName;
    public int employeeId;
    private double employeeSalary;


    Employee(String employeeName, int employeeId, double employeeSalary){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public void getDetails(){
        System.out.println(employeeId + "  " + employeeName + "  " + employeeSalary);
    }


    public static void main(String[] args){

        Employee emp = new Employee("Mayank", 1, 1500000);
        emp.getDetails();

    }

}
