package com.bridgelabz.constructors.levelone;

public class VehicleRegistration {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Arnav", "Ground Force One");
        Vehicle v2 = new Vehicle("Mayank", "auto");

        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
        System.out.println();

        // Updating registration fee (shared among all vehicles)
        Vehicle.updateRegistrationFee(5000);

        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
    }
}

class Vehicle{
    private String ownerName;
    private String vehicleType;
    private static int registrationFee = 3000; // Fixed initial value

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public static void updateRegistrationFee(int newFee) {
        registrationFee = newFee;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
    }
}