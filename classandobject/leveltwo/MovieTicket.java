package com.bridgelabz.classandobject.leveltwo;

public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;

    // Constructor to initialize movie ticket details
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.isBooked = false; // Initially, the ticket is not booked
    }

    // Method to book a ticket (assign seat and update price)
    public void bookTicket(String seatNumber, double price) {
        if (!isBooked) {
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("Ticket booked successfully for " + movieName);
        } else {
            System.out.println("Error: Ticket is already booked!");
        }
    }

    // Method to display ticket details
    public void displayTicket() {
        if (isBooked) {
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Ticket Price: $" + price);
        } else {
            System.out.println("Ticket not booked yet.");
        }
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Inception");

        ticket.displayTicket(); // Should indicate ticket is not booked

        ticket.bookTicket("A10", 12.50); // Booking the ticket
        ticket.displayTicket(); // Should display ticket details

        ticket.bookTicket("B15", 15.00); // Trying to book again (should fail)
    }

}
