package com.bridgelabz.constructors.levelone;


public class Circle {
    private double radius;
    /*
    Constructor chaining is a technique in Java where one constructor calls another
    constructor of the same class to avoid redundant code and improve reusability.
    */

    // Default Constructor
    public Circle(){
        this(1.0);
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to Diplay the radius
    public void displayRadius() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        defaultCircle.displayRadius();

        Circle customCircle = new Circle(5.5);
        customCircle.displayRadius();
    }

}
