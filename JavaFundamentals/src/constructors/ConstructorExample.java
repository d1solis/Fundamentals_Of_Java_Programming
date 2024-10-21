package constructors;

// Class called Student
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
	
	// We create our own parameterized constructor
	public Student(int sID, String sName, int sAge) {
		this.studentID = sID;
		this.studentName = sName;
		this.studentAge = sAge;
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

public class ConstructorExample {

	public static void main(String[] args) {
		// Creating an object of Class Student
		Student student = new Student();	// Student student -> Statement that declares a reference variable
											// new Student(); -> Creates a new object
											// Student(); -> Indicates which constructor should be called. 
												// ( Here we are manually creating it, called public Student() )
		student.displayDetails();	// Upon being ran, we are given default values
									// Student ID: 0, Student Name: null, Student Age: 0
									// This is because we have the default constructor which does not require arguments 
									// However, once we manually create public Student(), and run, we initialize the values and they change!
		
		// You can create a new object of the same class but now with parameters
		Student student1 = new Student(101, "Rashad Hassan", 28);
		student1.displayDetails();
		
		Student student2 = new Student(102, "Dalila Solis", 22);
		student2.displayDetails();

	}
	
	/**
	 * This would be considered constructor overloading if the parameters are the same 
	 * as the initial Data Members from above. However, we will just create our own
	 * parameterized constructor below using different named parameters. It's easier
	 * and less likely to be confusing.
	 * @param studentID
	 * @param studentName
	 * @param studentAge
	 * 
	 * public Student(int studentID, String stringName, int studentName){
	 * 		this.studentID = studentID;
	 * 		this.studentName = studentName;
	 * 		this.studentAge = studentAge;
	 * }
	 */
	
}
