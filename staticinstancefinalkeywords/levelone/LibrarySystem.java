package com.bridgelabz.staticinstancefinalkeywords.levelone;

public class LibrarySystem {
    public static void main(String[] args) {
        // Setting Library Name Before Creating Books
        Book.setLibraryName("National Library");  //  Setting library name before adding books

        // Creating Books
        Book book1 = new Book("The Alchemist", "Paulo Coelho", 1234567890L);
        Book book2 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 9876543210L);

        // Display Library Name
        Book.displayLibraryName();
        System.out.println(); // Line break
        // Display Book Details
        book1.displayBookDetails();
        System.out.println(); // Line break
        book2.displayBookDetails();
    }
}
class Book {
    private static String libraryName; //  Static variable (shared by all books)
    private String title;
    private String author;
    private final long isbn; //  Final variable (cannot change once assigned)

    //  Static method to set library name
    public static void setLibraryName(String name) {
        libraryName = name;
    }

    //  Static method to display library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    //  Constructor using `this` to initialize attributes
    public Book(String title, String author, long isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    //  Display Book Details (Uses instanceof check)
    public void displayBookDetails() {
        if (this instanceof Book) { //  Ensures it's a Book object before displaying
            System.out.println("Library Name: " + libraryName);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Invalid Book Object");
        }
    }
}