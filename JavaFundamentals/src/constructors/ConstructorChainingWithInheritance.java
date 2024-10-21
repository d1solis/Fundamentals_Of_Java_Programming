package constructors;

// Person class
class Person {
	String name;
	
	// Person class constructor that initializes name with default "Dalila"
	public Person() {
		System.out.println("Person Class Constructor Invoked.");
		name = "Dalila";
	}
	public Person(String name) {
		System.out.println("Person Class Paramterized Constructor Invoked.");
		this.name = name;
	}
}

// Person class is being inherited inside Employee
class Employee extends Person {
	String designation;
	public Employee() {
		System.out.println("Employee Class Constructor Invoked.");
		designation = "Manager";
	}
	public Employee(String designation) {
		super("Hazell");
		System.out.println("Employee Class Paramterized Constructor Invoked.");
		this.designation = designation;
	}
	
}

public class ConstructorChainingWithInheritance {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		
		Employee employee1 = new Employee("Senior Manager");
	}
	
}
