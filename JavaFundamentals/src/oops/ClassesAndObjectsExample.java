package oops;

import java.util.Scanner;

// Class called Student
class Student {
	
	// Data Members
	int studentID;
	String studentName;
	int studentAge;
	Scanner scnr = new Scanner(System.in);
	
	// Member Function
	// acceptDetails() and displayDetails() are essentially methods
	public void acceptDetails() {
		System.out.println("Enter Student ID: ");
		studentID = scnr.nextInt();		// Take user input
		System.out.println("Enter Student Name: ");
		studentName = scnr.next();		// Take user input
		System.out.println("Enter Student Age: ");
		studentAge = scnr.nextInt();	// Take user input
	}
	
	public void displayDetails() {
		System.out.println("Student ID: " + studentID);
		System.out.println("Student Name: " + studentName);
		System.out.println("Student Age: " + studentAge);
		System.out.println();
	}
}

public class ClassesAndObjectsExample {

	public static void main(String[] args) {
		
		// Creating an object of Class Student
		Student student = new Student();
		student.acceptDetails();
		student.displayDetails();
		
		// You can create a new object of the same class
		Student student1 = new Student();
		student1.acceptDetails();
		student1.displayDetails();
	}
	
}
