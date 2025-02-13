package com.bridgelabz.objectmodeling.levelone;

import java.util.ArrayList;

public class UniversitySystem {
    public static void main(String[] args){
        University university = new University("SRM"); // creating object of university


        DepartmentOfUniversity dept1 = new DepartmentOfUniversity("NWC"); // creating department object
        DepartmentOfUniversity dept2 = new DepartmentOfUniversity("C-TECH"); // creating department object

        university.addDepartment(dept1); // Adding department to university
        university.addDepartment(dept2); // Adding department to university

        Faculty faculty1 = new Faculty("Radhika"); // creating faculty object
        Faculty faculty2 = new Faculty("Meenakshi"); // creating faculty object
        Faculty faculty3 = new Faculty("Venkatesh"); // creating faculty object


        dept1.addFaculty(faculty1); // Adding faculty to department
        dept1.addFaculty(faculty2); // Adding faculty to department
        dept2.addFaculty(faculty3); // Adding faculty to department



        university.displayFacultyDetails(); // displaying details of university
    }
}
class University{
    private String universityName;
    private ArrayList<DepartmentOfUniversity> departments;

    public University(String universityName){
        this.universityName = universityName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(DepartmentOfUniversity department){
        departments.add(department);
    }

    public void displayFacultyDetails(){
        System.out.println("University name is: " + universityName);
        for(DepartmentOfUniversity department : departments){
            department.displayDepartmentDetails();
        }
    }

    // Composition - department completely depends on University
    public void deleteUniversity() {
        System.out.println(" University " + universityName + " deleted. All departments removed.");
        departments.clear();
    }
}

 class Faculty{
     private String facultyName;

     public Faculty(String facultyName) {
         this.facultyName = facultyName;
     }

     public void displayFacultyDetails() {
         System.out.println(" - Faculty: " + facultyName);
     }
 }

 class DepartmentOfUniversity{
     private String departmentName;
     private ArrayList<Faculty> facultys;

     public DepartmentOfUniversity(String departmentName){
         this.departmentName = departmentName;
         this.facultys = new ArrayList<>();
     }

     public void addFaculty(Faculty faculty){
         facultys.add(faculty);
     }

     public void displayDepartmentDetails(){
         System.out.println("the deaprtment is: " + departmentName);
         for(Faculty faculty : facultys){
             faculty.displayFacultyDetails();
         }
     }

 }