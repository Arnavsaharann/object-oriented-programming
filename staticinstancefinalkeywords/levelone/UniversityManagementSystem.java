package com.bridgelabz.staticinstancefinalkeywords.levelone;

public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Setting university name before creating students
        Student.setUniversityName("SRM University");

        // Creating students
        Student student1 = new Student("Arnav Saharan", 101, "Computer Science");
        Student student2 = new Student("Mayank", 102, "Data Science");

        // Displaying university name
        Student.displayUniversityName();
        System.out.println();

        // Displaying student details
        student1.displayStudentDetails();
        System.out.println();
        student2.displayStudentDetails();
        System.out.println();

        // Displaying total students
        Student.displayTotalStudents();
    }
}

class Student {
    private static String universityName; // Shared by all students
    private static int totalStudents = 0; // Tracks total number of students

    private String name;
    private final int id; // Unique ID that cannot be modified
    private String course;

    // Static method to set university name
    public static void setUniversityName(String name) {
        universityName = name;
    }

    // Static method to display university name
    public static void displayUniversityName() {
        System.out.println("University Name: " + universityName);
    }

    // Constructor using `this` to initialize attributes
    public Student(String name, int id, String course) {
        this.name = name;
        this.id = id;
        this.course = course;
        totalStudents++;
    }

    // Static method to display total students
    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    // Display Student Details with instanceof check
    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University Name: " + universityName);
            System.out.println("Student Name: " + name);
            System.out.println("Student ID: " + id);
            System.out.println("Course: " + course);
        } else {
            System.out.println("Invalid Student Object");
        }
    }
}
