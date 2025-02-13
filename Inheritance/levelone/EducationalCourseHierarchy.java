package com.bridgelabz.Inheritance.levelone;

public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        PaidOnlineCourse course1 = new PaidOnlineCourse("Java Programming", "6 weeks", "Udemy", true, 2999, 20);
        PaidOnlineCourse course2 = new PaidOnlineCourse("Data Structures & Algorithms", "8 weeks", "Coursera", false, 4999, 15);

        course1.displayDetails();
        course2.displayDetails();
    }
}

class Course {
    protected String courseName;
    protected String duration;

    public Course(String courseName, String duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
    }
}

class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, String duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + isRecorded);
    }
}

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName, String duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount );
        System.out.println();
    }
}
