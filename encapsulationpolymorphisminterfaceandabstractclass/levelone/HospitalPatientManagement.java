package com.bridgelabz.encapsulationpolymorphisminterfaceandabstractclass.levelone;

import java.util.ArrayList;

public class HospitalPatientManagement {
    public static void main(String[] args){
        InPatient inpatient1 = new InPatient(101, "John Doe", 45, 2000, 5);
        OutPatient outpatient1 = new OutPatient(202, "Jane Smith", 30, 500, 1);

        ArrayList<Patient> patientList = new ArrayList<>();
        patientList.add(inpatient1);
        patientList.add(outpatient1);

        for(Patient patient : patientList){
            patient.getPatientDetails();
            System.out.println("Total Bill: ₹" + patient.calculateBill() + "\n");
        }


        inpatient1.addRecord("Admitted for surgery");
        inpatient1.addRecord("Prescribed painkillers");


        outpatient1.addRecord("Consulted for headache");
        outpatient1.addRecord("Prescribed migraine medication");

        System.out.println("Displaying medical records:");
        if (inpatient1 instanceof MedicalRecord) {
            inpatient1.viewRecords();
        }

        if (outpatient1 instanceof MedicalRecord) {
            outpatient1.viewRecords();
        }
    }
}

abstract class Patient{
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age){
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();


    public void getPatientDetails(){
        System.out.println("Patient ID: " + patientId);
        System.out.println("name : " + name);
        System.out.println("age : " + age);
    }

    public String getName() {
        return name;
    }

    public int getPatientId() {
        return patientId;
    }
}

interface MedicalRecord{
    void addRecord(String illness);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord{
    private double dailyCharge;
    private int daysAdmitted;
    private ArrayList<String> records = new ArrayList<>();

    public InPatient(int patientId, String name, int age, double dailyCharge, int daysAdmitted) {
        super(patientId, name, age);
        this.dailyCharge = dailyCharge;
        this.daysAdmitted = daysAdmitted;
    }

    public double calculateBill() {
        return dailyCharge * daysAdmitted;
    }

    public void addRecord(String record) {
        records.add(record);
        System.out.println("Record added for " + getName());
    }

    /*
    @Override
    public void viewRecords() {
        System.out.println("Medical Records for " + getName() + ":");
        for (String record : records) {  //  Explicitly iterates through the list
            System.out.println("- " + record); //  Custom formatting
        }
    }

    */

    /*
         This method prints the entire `records` ArrayList using `toString()`
         Java automatically calls `ArrayList.toString()`, which:
         Iterates through the list internally.
         Converts each element to a string.
         Formats the output as: [Record1, Record2, Record3].
         This does not allow custom formatting (each record prints in a single line inside brackets).

     */

    public void viewRecords() {
        System.out.println("Medical Records for " + getName() + ": " + records);
    }



}


class OutPatient extends Patient implements MedicalRecord{
    private double dailyCharge;
    private int daysAdmitted;
    private ArrayList<String> records = new ArrayList<>();

    public OutPatient(int patientId, String name, int age, double dailyCharge, int daysAdmitted) {
        super(patientId, name, age);
        this.dailyCharge = dailyCharge;
        this.daysAdmitted = daysAdmitted;
    }

    public double calculateBill() {
        return dailyCharge * daysAdmitted;
    }

    public void addRecord(String record) {
        records.add(record);
        System.out.println("Record added for " + getName());
    }

    public void viewRecords() {
        System.out.println("Medical Records for " + getName() + ": " + records);
    }
}
