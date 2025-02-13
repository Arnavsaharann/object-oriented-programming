package com.bridgelabz.objectmodeling.levelone;

import java.util.ArrayList;

public class SchoolManagement {
    public static void main(String[] args) {
        School mySchool = new School("APS");

        // Create courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        Student s1 = new Student("Arnav");
        Student s2 = new Student("Mayank");

        // Enroll students in courses
        s1.enrollInCourse(math);
        s1.enrollInCourse(science);
        s2.enrollInCourse(science);

        // Add students to the school
        mySchool.addStudent(s1);
        mySchool.addStudent(s2);

        // Display school, student, and course details
        mySchool.displaySchoolDetails();
        math.displayCourseDetails();
        science.displayCourseDetails();
    }
}

// Represents a School (Aggregation: A school has students)
class School {
    private String name;
    private ArrayList<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displaySchoolDetails() {
        System.out.println("\nSchool: " + name);
        System.out.println("Students:");
        for (Student student : students) {
            student.displayStudentDetails();
        }
    }
}

// Represents a Student (Many-to-Many: Students enroll in multiple courses)
class Student {
    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enrollInCourse(Course course) {
        courses.add(course);
        course.addStudent(this); // Bidirectional Relationship
    }

    public void displayStudentDetails() {
        System.out.println("\nStudent: " + name);
        System.out.println("Enrolled in Courses:");
        for (Course course : courses) {
            System.out.println(" - " + course.getCourseName());
        }
    }

    public String getName() {
        return name;
    }
}

// Represents a Course (Many-to-Many: Courses have multiple students)
class Course {
    private String courseName;
    private ArrayList<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayCourseDetails() {
        System.out.println("\nCourse: " + courseName);
        System.out.println("Enrolled Students:");
        for (Student student : enrolledStudents) {
            System.out.println(" - " + student.getName()); // Fixed: Using getter instead of direct access
        }
    }
}
