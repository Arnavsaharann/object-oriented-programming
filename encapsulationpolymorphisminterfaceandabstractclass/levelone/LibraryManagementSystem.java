package com.bridgelabz.encapsulationpolymorphisminterfaceandabstractclass.levelone;

import java.util.ArrayList;

public class LibraryManagementSystem {
    public static void main(String[] args){
        ArrayList<LibraryItem>libraryItems = new ArrayList<>();

        LibraryItem book = new Book(101, "Harry Potter", "J.K. Rowling");
        LibraryItem magazine = new Book(101, "Harry Potter", "J.K. Rowling");
        LibraryItem dvd = new Book(101, "Harry Potter", "J.K. Rowling");

        libraryItems.add(book);
        libraryItems.add(magazine);
        libraryItems.add(dvd);


        /*

        if getLoanDuration() wasnt a part of the abstract class we would have to downcast each object and call its method getLoanDuration.

        for (LibraryItem item : libraryItems) {
            item.getItemDetails();

            if (item instanceof Book) {
                System.out.println("Loan Duration: " + ((Book) item).getLoanDuration() + " days\n");
            } else if (item instanceof Magazine) {
                System.out.println("Loan Duration: " + ((Magazine) item).getLoanDuration() + " days\n");
            } else if (item instanceof DVD) {
                System.out.println("Loan Duration: " + ((DVD) item).getLoanDuration() + " days\n");
            }
        }
         */


        for(LibraryItem item : libraryItems){
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
        }
    }
}

abstract class LibraryItem{
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author){
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public abstract int getLoanDuration();

    public void getItemDetails(){
        System.out.println("Item ID: " + itemId);
        System.out.println("title: " + title);
        System.out.println("author: " + author);
    }
}

interface Reservable{
    void reserveItem();
    boolean checkAvailability();
}


class Book extends LibraryItem implements Reservable{
    private boolean isAvailable = true;

    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    public void reserveItem(){
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book reserved");
        }else{
            System.out.println("Book already reserved");
        }
    }

    public boolean checkAvailability(){
        return isAvailable;
    }

    public int getLoanDuration(){
        return 21; // books can be borrowed for 21 days at max
    }
}

class Magazine extends LibraryItem implements Reservable{
    private boolean isAvailable = true;

    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 7;
    }

    public void reserveItem(){
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book reserved");
        }else{
            System.out.println("Book already reserved");
        }
    }

    public boolean checkAvailability(){
        return isAvailable;
    }
}

class DVD extends LibraryItem implements Reservable{
    private boolean isAvailable = true;

    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 2;
    }

    public void reserveItem(){
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book reserved");
        }else{
            System.out.println("Book already reserved");
        }
    }

    public boolean checkAvailability(){
        return isAvailable;
    }
}
