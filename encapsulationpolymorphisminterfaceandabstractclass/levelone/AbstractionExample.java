package com.bridgelabz.encapsulationpolymorphisminterfaceandabstractclass.levelone;

public class AbstractionExample {
    public static void main(String[] args){
        Calculate c = new Circle(10);

        c.calculateArea();

        c.calculateCircumference();
    }
}

abstract class Calculate{
    public abstract void calculateArea();
    public abstract void calculateCircumference();

}

class Circle extends Calculate{
    int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public void calculateArea(){
        System.out.println(" Area: " + 3.14 * radius * radius);
    }

    public void calculateCircumference(){
        System.out.println(" circumference: " + 2 * 3.14 * radius);
    }
}
