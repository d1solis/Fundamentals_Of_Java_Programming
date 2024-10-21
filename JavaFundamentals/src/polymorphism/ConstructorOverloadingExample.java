package polymorphism;

//Class called Student
class Student {
	
	// Data Members
	int studentID;
	String studentName;
	int studentAge;
	
	// We create the constructor manually and initialize the values manually
	// It is also considered a default constructor because it does not require any arguments
	public Student() {
		this.studentID = 100;
		this.studentName = "Unknown";
		this.studentAge = 18;
	}
	
	// We create our own parameterized constructor (int, String, int)
	// This is considered constructor overloading since the parameters are the same as the initial 
	// Data Members above. It has different parameter list than the one below v
	public Student(int studentID, String studentName, int studentAge) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}
	
	// We create our own parameterized constructor (int, int, String)
	// This is considered constructor overloading since the parameters are the same as the initial 
	// Data Members above. It has different parameter list than the one above ^
	public Student(int studentID, int studentAge, String studentName) {
		this.studentID = studentID;
		this.studentAge = studentAge;
		this.studentName = studentName;
	}
	
	// Member Function
	// displayDetails() is essentially a method
	public void displayDetails() {
		System.out.println("Student ID: " + studentID);
		System.out.println("Student Name: " + studentName);
		System.out.println("Student Age: " + studentAge);
		System.out.println();
	}
}

public class ConstructorOverloadingExample {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.displayDetails();
		
		System.out.println("--------------");
		
		Student student1 = new Student(101, 28, "Rashad");
		student1.displayDetails();
		
		System.out.println("--------------");
		
		Student student2 = new Student(102, "Dalila", 22);
		student2.displayDetails();
		
		System.out.println("--------------");
	}
	
}
