package com.bridgelabz.staticinstancefinalkeywords.levelone;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient.setHospitalName("Apollo Hospital");

        Patient patient1 = new Patient("Arnav Saharan", 25, "Flu", 1001);
        Patient patient2 = new Patient("Mayank", 30, "Fever", 1002);

        Patient.displayHospitalName();
        System.out.println();

        patient1.displayPatientDetails();
        System.out.println();
        patient2.displayPatientDetails();
        System.out.println();

        Patient.getTotalPatients();
    }
}

class Patient {
    private static String hospitalName;
    private static int totalPatients = 0;

    private String name;
    private int age;
    private String ailment;
    private final int patientID; // Unique ID that cannot be modified

    // Static method to set hospital name
    public static void setHospitalName(String name) {
        hospitalName = name;
    }

    // Static method to display hospital name
    public static void displayHospitalName() {
        System.out.println("Hospital Name: " + hospitalName);
    }

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    // Display Patient Details with instanceof check
    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Patient ID: " + patientID);
        } else {
            System.out.println("Invalid Patient Object");
        }
    }
}
