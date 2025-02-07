package com.bridgelabz.constructors.levelone;

public class HotelBookingSystem {
    public static void main(String[] args){
        HotelBooking defaultBooking = new HotelBooking();
        System.out.println("Default Booking:");
        defaultBooking.displayBooking();

        System.out.println();

        HotelBooking customBooking = new HotelBooking("Arnav Saharan", "Deluxe", 3);
        System.out.println("Custom Booking:");
        customBooking.displayBooking();

        System.out.println();

        HotelBooking copiedBooking = new HotelBooking(customBooking);
        System.out.println("Copied Booking:");
        copiedBooking.displayBooking();

    }
}

class HotelBooking{
    private String guestName;
    private String roomType;
    private int nights;

    // default constructor
    public HotelBooking() {
        this.guestName = "";
        this.roomType = "";
        this.nights = 0;
    }
    // ✅ Parameterized Constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    // copy constructor
    public HotelBooking(HotelBooking otherBooking) {
        this.guestName = otherBooking.guestName;
        this.roomType = otherBooking.roomType;
        this.nights = otherBooking.nights;
    }

    // method to display booking details
    public void displayBooking() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
}
