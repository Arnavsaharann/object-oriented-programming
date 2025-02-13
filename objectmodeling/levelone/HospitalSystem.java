package com.bridgelabz.objectmodeling.levelone;

import java.util.ArrayList;

//  Main Class for Hospital System
public class HospitalSystem {
    public static void main(String[] args) {
        //  Creating Hospital
        Hospital hospital = new Hospital("City Hospital");

        //  Creating Doctors
        Doctor doctor1 = new Doctor("Dr. Gupta", "Cardiologist");
        Doctor doctor2 = new Doctor("Dr. Ramesh", "Neurologist");

        //  Creating Patients
        Patient patient1 = new Patient("Arnav", 25);
        Patient patient2 = new Patient("Mayank", 30);

        //  Patients Consulting Doctors
        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient1);

        //  Adding Doctors and Patients to Hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        //  Displaying Details
        hospital.displayHospitalDetails();
        doctor1.displayDoctorDetails();
        doctor2.displayDoctorDetails();
        patient1.displayPatientDetails();
        patient2.displayPatientDetails();
    }
}

//  Hospital Class (Manages Doctors and Patients)
class Hospital {
    private String hospitalName;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void displayHospitalDetails() {
        System.out.println("\nHospital: " + hospitalName);
        System.out.println("Doctors Available:");
        for (Doctor doctor : doctors) {
            System.out.println(" - " + doctor.getDoctorName() + " (" + doctor.getSpecialization() + ")");
        }
        System.out.println("Registered Patients:");
        for (Patient patient : patients) {
            System.out.println(" - " + patient.getPatientName());
        }
    }
}

//  Doctor Class (Can Consult Multiple Patients)
class Doctor {
    private String doctorName;
    private String specialization;
    private ArrayList<Patient> consultedPatients;

    public Doctor(String doctorName, String specialization) {
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.consultedPatients = new ArrayList<>();
    }

    public void consult(Patient patient) {
        consultedPatients.add(patient);
        patient.addConsultation(this); //  Association - Patients and Doctors interact
        System.out.println(doctorName + " consulted " + patient.getPatientName());
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void displayDoctorDetails() {
        System.out.println("\nDoctor: " + doctorName + " (" + specialization + ")");
        System.out.println("Consulted Patients:");
        for (Patient patient : consultedPatients) {
            System.out.println(" - " + patient.getPatientName());
        }
    }
}

//  Patient Class (Can Consult Multiple Doctors)
class Patient {
    private String patientName;
    private int age;
    private ArrayList<Doctor> consultedDoctors;

    public Patient(String patientName, int age) {
        this.patientName = patientName;
        this.age = age;
        this.consultedDoctors = new ArrayList<>();
    }

    public void addConsultation(Doctor doctor) {
        consultedDoctors.add(doctor);
    }

    public String getPatientName() {
        return patientName;
    }

    public void displayPatientDetails() {
        System.out.println("\nPatient: " + patientName + ", Age: " + age);
        System.out.println("Consulted Doctors:");
        for (Doctor doctor : consultedDoctors) {
            System.out.println(" - " + doctor.getDoctorName() + " (" + doctor.getSpecialization() + ")");
        }
    }
}
