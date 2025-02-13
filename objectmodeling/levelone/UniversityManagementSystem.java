package com.bridgelabz.objectmodeling.levelone;

import java.util.ArrayList;

public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Creating Students
        UniversityStudent student1 = new UniversityStudent("Arnav");
        UniversityStudent student2 = new UniversityStudent("Mayank");

        // Creating Professors
        Professor professor1 = new Professor("Dr. Sharma");
        Professor professor2 = new Professor("Dr. Mehta");

        // Creating Courses
        UniversityCourse course1 = new UniversityCourse("Data Structures", professor1);
        UniversityCourse course2 = new UniversityCourse("Operating Systems", professor2);

        // Enrolling Students in Courses
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);

        // Assigning Courses to Professors
        professor1.assignCourse(course1);
        professor2.assignCourse(course2);

        // Displaying Details
        student1.displayStudentDetails();
        student2.displayStudentDetails();
        professor1.displayProfessorDetails();
        professor2.displayProfessorDetails();
    }
}

class UniversityStudent {
    private String studentName;
    private ArrayList<UniversityCourse> enrolledCourses;

    public UniversityStudent(String studentName) {
        this.studentName = studentName;
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollCourse(UniversityCourse course) {
        enrolledCourses.add(course);
        course.addStudent(this);
    }

    public void displayStudentDetails() {
        System.out.println("\nStudent: " + studentName);
        System.out.println("Enrolled Courses:");
        for (UniversityCourse course : enrolledCourses) {
            System.out.println(" - " + course.getCourseName());
        }
    }
    public String getStudentName(){
        return studentName;
    }
}

class Professor {
    private String professorName;
    private ArrayList<UniversityCourse> assignedCourses;

    public Professor(String professorName) {
        this.professorName = professorName;
        this.assignedCourses = new ArrayList<>();
    }

    public void assignCourse(UniversityCourse course) {
        assignedCourses.add(course);
    }

    public void displayProfessorDetails() {
        System.out.println("\nProfessor: " + professorName);
        System.out.println("Teaches:");
        for (UniversityCourse course : assignedCourses) {
            System.out.println(" - " + course.getCourseName());
        }
    }

    public String getProfessorName(){
        return professorName;
    }
}

class UniversityCourse {
    private String courseName;
    private Professor professor;
    private ArrayList<UniversityStudent> students;

    public UniversityCourse(String courseName, Professor professor) {
        this.courseName = courseName;
        this.professor = professor;
        this.students = new ArrayList<>();
    }

    public void addStudent(UniversityStudent student) {
        students.add(student);
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayCourseDetails() {
        System.out.println("\nCourse: " + courseName);
        System.out.println("Professor: " + professor.getProfessorName());
        System.out.println("Enrolled Students:");
        for (UniversityStudent student : students) {
            System.out.println(" - " + student.getStudentName());
        }
    }
}
