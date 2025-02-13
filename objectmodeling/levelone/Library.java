package com.bridgelabz.objectmodeling.levelone;

import java.util.ArrayList;

// Represents a Library that contains multiple books
public class Library {
    private String libraryName; // Name of the library
    private ArrayList<Book> books; // List to store books in the library

    // Constructor to initialize the library with a name
    public Library(String libraryName){
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display all books available in the library
    public void displayLibraryBooks() {
        System.out.println("\nLibrary: " + libraryName);
        for (Book book : books) {
            book.displayBookInfo();
        }
    }

    // Main method to demonstrate the Library and Book relationship
    public static void main(String[] args){
        // Creating Book objects
        Book book1 = new Book("abc", "xyz");
        Book book2 = new Book("pqr", "Stw");
        Book book3 = new Book("gja", "hjd");

        // Creating a Library object
        Library myLibrary = new Library("City Library");

        // Adding books to the library
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        myLibrary.addBook(book3);

        // Displaying all books in the library
        myLibrary.displayLibraryBooks();
    }
}

// Represents a Book with title and author
class Book {
    private String title; // Title of the book
    private String author; // Author of the book

    // Constructor to initialize a book with title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method to display book information
    public void displayBookInfo() {
        System.out.println("Book: " + title + " by " + author);
    }
}
