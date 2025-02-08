package com.bridgelabz.staticinstancefinalkeywords.levelone;

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        // Setting initial registration fee
        Vehicle.updateRegistrationFee(5000);

        Vehicle vehicle1 = new Vehicle("Arnav Saharan", "Car", 1010);
        Vehicle vehicle2 = new Vehicle("Mayank", "Bike", 2020);

        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
        System.out.println();
    }
}

class Vehicle {
    private static double registrationFee;
    private String ownerName;
    private String vehicleType;
    private final int registrationNumber; // Unique ID that cannot be changed

    // Static method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public Vehicle(String ownerName, String vehicleType, int registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Display Vehicle Details with instanceof check
    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        } else {
            System.out.println("Invalid Vehicle Object");
        }
    }
}
