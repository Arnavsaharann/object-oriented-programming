package com.bridgelabz.encapsulationpolymorphisminterfaceandabstractclass.levelone;

import java.util.ArrayList;

public class RideHailingApplication {
    public static void main(String[] args) {
        ArrayList<Vehicel> vehicles = new ArrayList<>();

        Vehicel maruti = new Cars("abcd", "Arnav Saharan", 15, "chennai", 50);
        Vehicel splendor = new Bikes("qdpa", "Mayank Pal", 7.5, "chennai", 28);
        Vehicel auto = new Auto("nkml", "Arpit Sagar", 6, "chennai", 10);

        vehicles.add(maruti);
        vehicles.add(splendor);
        vehicles.add(auto);


        for(Vehicel vehicle : vehicles){
            vehicle.getVehicleDetails();
            if(vehicle instanceof GPS){
                System.out.println("the current location of the vehicle as per GPS is: " + ((GPS) vehicle).getCurrentLocation());
            }
            System.out.println();
        }
    }

}
abstract class Vehicel{
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicel(String vehicleId, String driverName, double ratePerKm){
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare();

    public void getVehicleDetails(){
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("driverName : " + driverName);
        System.out.println("rate Per Km : " + ratePerKm);
    }

    public double getRatePerKm() {
        return ratePerKm;
    }
}

interface GPS{
    String getCurrentLocation();
    void updateLocation(String location);
}

class Cars extends Vehicel implements GPS{
    private String location;
    private int distance;

    public Cars(String vehicleId, String driverName, double ratePerKm, String location, int distance){
        super(vehicleId,driverName,ratePerKm);
        this.location = location;
        this.distance = distance;
    }

    public double calculateFare(){
        return distance * getRatePerKm();
    }

    public String getCurrentLocation(){
        return location;
    }

    public void updateLocation(String location){
        this.location = location;
    }
}

class Bikes extends Vehicel implements GPS{
    private String location;
    private int distance;

    public Bikes(String vehicleId, String driverName, double ratePerKm, String location, int distance){
        super(vehicleId,driverName,ratePerKm);
        this.location = location;
        this.distance = distance;
    }

    public double calculateFare(){
        return distance * getRatePerKm();
    }

    public String getCurrentLocation(){
        return location;
    }

    public void updateLocation(String location){
        this.location = location;
    }
}

class Auto extends Vehicel implements GPS{
    private String location;
    private int distance;

    public Auto(String vehicleId, String driverName, double ratePerKm, String location, int distance){
        super(vehicleId,driverName,ratePerKm);
        this.location = location;
        this.distance = distance;
    }

    public double calculateFare(){
        return distance * getRatePerKm();
    }

    public String getCurrentLocation(){
        return location;
    }

    public void updateLocation(String location){
        this.location = location;
    }
}





