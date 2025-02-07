package com.bridgelabz.constructors.levelone;

public class OnlineCourseManagement {
    public static void main(String[] args){
        Course c1 = new Course("EGD", 1);
        Course c2 = new Course("JAVA", 1);

        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
        System.out.println();

        Course.updateInstituteName("SRM");

        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();


    }
}

class Course{
    private String courseName;
    private int duration;
    private static String instituteName = "NOT DEFINED";

    public Course(String courseName, int duration){
        this.courseName = courseName;
        this.duration = duration;
    }

    public static void updateInstituteName(String name){
        instituteName =  name;
    }

    public void displayCourseDetails(){
        System.out.println("courseName: " + courseName);
        System.out.println("duration: " + duration);
        System.out.println("instituteName: " + instituteName);
    }
}
