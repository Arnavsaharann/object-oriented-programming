package com.bridgelabz.classandobject.levelone;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        // Creating an object of Book class
        Book book1 = new Book("Angles and Demons", "Dan Brown", 399.99);
        book1.displayDetails();
    }
}
