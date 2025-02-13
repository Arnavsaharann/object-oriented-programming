package com.bridgelabz.Inheritance.levelone;

public class LibraryManagement {
    public static void main(String[] args) {
        Author author1 = new Author("Sigma BOI", 2024, "Mayank", "NOT A SIGMA BOY");
        Author author2 = new Author("Angles and demons", 2005, "Dan Brown", "Science Fiction writer");
        author2.displayDetails();
        author1.displayDetails();

    }
}

class Book{
    protected  String title;
    protected  int publicationYear;

    public Book(String title, int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayDetails(){
        System.out.println("the title is: " + title);
        System.out.println("the publicationYear is: " + publicationYear);
    }
}

class Author extends Book{
    private  String name;
    private  String bio;

    public Author(String title, int publicationYear,String name,String bio){
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Call Book's displayInfo()
        System.out.println("Author Name: " + name);
        System.out.println("Bio: " + bio);
        System.out.println();

    }
}