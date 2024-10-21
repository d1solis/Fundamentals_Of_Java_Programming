package oops;

class Person{
	
	// Private data members require getter and setter methods
	private String firstName;
	private String lastName;
	private int age;
	
	// Getter and Setter for First name
	public String getFirstName() {		// Getter Method (only reads from object to class)
		return this.firstName;
	}
	public void setFirstName(String firstName) {		// Setter Method (only writes from object to class)
		this.firstName = firstName;
	}
	
	// Getter and Setter for Last name
	public String getLastName() {
		return this.lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	// Getter and Setter for Age
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		if(age >= 18) {
			this.age = age;
		}
		else {
			System.out.println("Invalid Age!");
		}
	}
}

public class EncapsulationExample {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.setFirstName("Rashad");
		System.out.println(person.getFirstName());
		
		person.setLastName("Hassan");
		System.out.println(person.getLastName());
		
		person.setAge(28);
		System.out.println(person.getAge());
	}
	
}
