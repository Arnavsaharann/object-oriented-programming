package com.bridgelabz.constructors.levelone;

public class UniversityManagement {
    public static void main(String[] args){
        PostgraduateStudent pgStudent = new PostgraduateStudent(101, "Arnav", 9.2, "Computer Science");
        pgStudent.displayStudentDetails();
    }
}

class Student {

    public int rollNumber; // Public: accessible anywhere
    protected String name; // Protected: accessible in subclass
    private double CGPA; // accessible only inside the class

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double newCGPA) {
        this.CGPA = newCGPA;
    }


    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student{
    private String specialization;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        /*
         public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
            super(rollNumber, name, CGPA); //  Calling the constructor of Student (superclass)
            this.specialization = specialization;
        }
        */

        this.rollNumber = rollNumber; // Directly accessing public variable from Student
        this.name = name; //  Directly accessing protected variable from Student
        this.setCGPA(CGPA); // Using setter method to access private CGPA
        this.specialization = specialization;
    }
    @Override
    public void displayStudentDetails() {
        /*
            public void displayStudentDetails() {
                super.displayStudentDetails();  // Calling the method from the Student class
                System.out.println("Specialization: " + specialization);
            }
         */
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA()); //  Using getter method since CGPA is private
        System.out.println("Specialization: " + specialization);
    }

}