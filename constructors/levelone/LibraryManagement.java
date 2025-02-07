package com.bridgelabz.constructors.levelone;

// Main class to test the functionality
public class LibraryManagement {
    public static void main(String[] args) {
        EBook ebook = new EBook(123456, "Java Programming", "Herbert Schildt", "PDF");

        ebook.displayBookDetails();
        System.out.println();

        // Updating author using setter
        ebook.setAuthor("Joshua Bloch");

        // Displaying updated details
        ebook.displayBookDetails();
    }
}

// Base class: Books
class Books {
    public int ISBN; // Public: Accessible anywhere
    protected String title; // Protected: Accessible in subclass
    private String author; // Private: Only accessible through getter/setter


    /*
    if this is not used here then super has to be used since
    then we can call the parametrized constructor of the base class directly from the child class using super ,
    if we decide to do it manually we run into thr issue of no default construct being there in base class to initiallize it
    hence we first should have a default constructor in the base class
    */
    public Books() {
    }

    public Books(int ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public getter for author
    public String getAuthor() {
        return author;
    }

    // Public setter for author
    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass: EBook (inherits from Books)
class EBook extends Books {
    private String format;

    public EBook(int ISBN, String title, String author, String format) {
        //super(ISBN, title, author); //  Would call parent constructor
        this.ISBN = ISBN; //  Directly accessing public variable from Books
        this.title = title; //  Directly accessing protected variable from Books
        this.setAuthor(author); //  Using setter method to access private author
        this.format = format;
    }

    @Override
    public void displayBookDetails() {
        // super.displayBookDetails(); //  Would call parent method
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor()); // ✅ Using getter method since author is private
        System.out.println("Format: " + format);
    }
}
