package com.bridgelabz.constructors.levelone;

public class Book {
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }


    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("\nTitle: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    // Main method to test the constructors
    public static void main(String[] args) {
        Book defaultBook = new Book();
        defaultBook.displayDetails();


        Book customBook = new Book("Angle's and Demons", "Dan Brown", 15.99);
        customBook.displayDetails();
    }
}
