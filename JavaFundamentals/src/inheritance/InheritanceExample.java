package inheritance;

import java.util.Scanner;

// Base/Parent class called Student
class Student {
    
    // Data members specific to a Student
    int studentID;
    String studentName;
    int studentAge;
    Scanner scnr = new Scanner(System.in);  // Scanner object for user input
    
    // Method to accept details of the student (Member Function)
    public void acceptDetails() {
        System.out.println("Enter Student ID: ");
        studentID = scnr.nextInt();  // Take user input for student ID
        System.out.println("Enter Student Name: ");
        studentName = scnr.next();  // Take user input for student name
        System.out.println("Enter Student Age: ");
        studentAge = scnr.nextInt();  // Take user input for student age
    }
    
    // Method to display details of the student (Member Function)
    public void displayDetails() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + studentAge);
        System.out.println();
    }
}

// Derived/Child class Marks that extends Student (inherits Student properties)
class Marks extends Student {
    
    // Data members specific to Marks
    protected float objectiveMarks;
    protected float subjectiveMarks;
    
    // Overriding the acceptDetails() method to include marks information
    public void acceptDetails() {
        super.acceptDetails();  // Call the acceptDetails() of the parent class Student
        System.out.println("Enter Objective Marks: ");
        objectiveMarks = scnr.nextFloat();  // Take user input for objective marks
        System.out.println("Enter Subjective Marks: ");
        subjectiveMarks = scnr.nextFloat();  // Take user input for subjective marks
    }
    
    // Overriding the displayDetails() method to include marks information
    public void displayDetails() {
        super.displayDetails();  // Call the displayDetails() of the parent class Student
        System.out.println("Objective Marks: " + objectiveMarks);
        System.out.println("Subjective Marks: " + subjectiveMarks);
        System.out.println();
    }
}

// Further derived/child class Sports that extends Marks (inherits Marks properties)
class Sports extends Marks {
    
    // Data member specific to Sports
    protected float score;
    
    // Overriding the acceptDetails() method to include sports score
    public void acceptDetails() {
        super.acceptDetails();  // Call the acceptDetails() of the parent class Marks
        System.out.println("Enter Sports Score: ");
        score = scnr.nextFloat();  // Take user input for sports score
    }
    
    // Overriding the displayDetails() method to include sports score
    public void displayDetails() {
        super.displayDetails();  // Call the displayDetails() of the parent class Marks
        System.out.println("Sports Score: " + score);
        System.out.println();
    }
}

// Further derived/child class Result that extends Sports (inherits Sports properties)
class Result extends Sports {
    
    // Data members specific to Result for calculating total and average
    private float totalMarks, averageMarks;
    
    // Method to calculate and display total and average marks
    void calculate() {
        totalMarks = objectiveMarks + subjectiveMarks + score;  // Sum of all marks
        averageMarks = totalMarks / 3;  // Average of the marks
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
    }
}

// Main class to run the program
public class InheritanceExample {

    public static void main(String[] args) {
    	
    	//Marks marks = new Marks();
		//marks.acceptDetails();
		//marks.displayDetails();
		
		//Sports obj = new Sports();
		//obj.acceptDetails();
		//obj.displayDetails();
        
    	
        // Create an instance of Result class, which has access to all inherited methods
        Result obj = new Result();
        
        // Accept and display details of the student, marks, and sports score
        obj.acceptDetails();
        obj.displayDetails();
        
        // Calculate and display total and average marks
        obj.calculate();
    }
}
