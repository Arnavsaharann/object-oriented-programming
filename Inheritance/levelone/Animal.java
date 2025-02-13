package com.bridgelabz.Inheritance.levelone;

public class Animal {
    private String name;
    private int age;

    public  Animal(String name, int age ){
        this.name = name;
        this.age = age;
    }

    public void makeSound(){
        System.out.println("Animal Speaks");
    }

    public static void main(String[] args){
        Animal dog = new Dog();
        dog.makeSound();

        Dog dog2 = new Dog();
        dog2.makeSound();
    }
}

class Dog extends Animal{

    public Dog(){
        super("bruno",21);
    }
    @Override
    public void makeSound(){
        System.out.println("bruno Speaks");
    }
}

class Cat extends Animal{
    public Cat(){
        super("Khalid kashmiri",21);
    }
    @Override
    public void makeSound(){
        System.out.println("khalid Speaks");
    }
}

class Bird extends Animal{
    public Bird(){
        super("tota singh",21);
    }
    @Override
    public void makeSound(){
        System.out.println("tota Speaks");
    }
}