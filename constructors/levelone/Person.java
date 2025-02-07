package com.bridgelabz.constructors.levelone;

public class Person {
    private String name;
    private int age;


    // default constructor
    public Person(){
        this("NULL",0);
    }

    // parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // copy constructor
    public Person(Person obj){
        this.name = obj.name;
        this.age = obj.age;
    }

    public void display(){
        System.out.println("the name is: " + name + "   age is : " + age );
    }


    public static void main(String[] args){
        Person person1 = new Person("mayank",21);
        person1.display();

        Person person2 = new Person(person1);
        person2.display();
    }
}
