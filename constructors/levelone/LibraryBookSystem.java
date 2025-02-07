
package com.bridgelabz.constructors.levelone;

public class LibraryBookSystem {
    public static void main(String[] args){
        BookBorrow book = new BookBorrow("The Story Of my Life", "Helen Keller", 69);
        book.displayDetails();

        System.out.println(""); // gap for formatting

        book.borrowBook();

        System.out.println("");// gap for formatting

        book.displayDetails();
    }
}
class BookBorrow {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    public BookBorrow() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
        this.isAvailable = true;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, " + title + " is currently unavailable.");
        }
    }

    public void displayDetails(){
        System.out.println("title: " + title);
        System.out.println("author: " + author);
        System.out.println("price: " + price);
        System.out.println("isAvailable: " + isAvailable);
    }

    public BookBorrow(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

}
