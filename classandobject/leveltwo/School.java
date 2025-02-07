package com.bridgelabz.classandobject.leveltwo;

public class School {
    public static void main(String[] args) {
        Student s1 = new Student(6, "Arnav Saharan", 40);
        s1.displayDetails();
    }
}

class Student{
    private String name;
    private int rollNumber;
    private int marks;


    // constructor to initialize
    public Student(int rollNumber, String name, int marks){
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks=marks;
    }
/*

    Setter and getter naming convention set or get before the variable name :

    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for rollNumber
    public int getRollNumber() {
        return rollNumber;
    }

    // Setter for rollNumber
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;


*/

    // method to calculate grades
    public String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 80) return "B";
        else if (marks >= 70) return "C";
        else if (marks >= 60) return "D";
        else return "F";
    }


    // method to display details
    public void displayDetails(){
        System.out.println("Roll number: " + rollNumber + " name: " + name + " marks: " + marks + " grade " + calculateGrade());
    }

}
