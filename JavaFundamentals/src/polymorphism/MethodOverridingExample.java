package polymorphism;

// Base class called Person
class Person {
    String name;
    int age;
    
    // Parameterized constructor for Person class to initialize name and age (doesn't have a return type)
    public Person(String name, int age) {
        this.name = name;  // 'this' refers to the current object's name field
        this.age = age;  // 'this' refers to the current object's age field
    }
    
    // Method to print the details of the Person object (has a return type)
    public void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

// Derived class Employee that extends Person (inherits Person's properties and methods)
class Employee extends Person {
    String designation;
    float salary;
    
    // Parameterized constructor for Employee class
    public Employee(String name, int age, String designation, float salary) {
        super(name, age);	// Call to the superclass constructor (Person) to initialize name and age
        this.designation = designation;  // Initialize designation for Employee
        this.salary = salary;  // Initialize salary for Employee
    }
    
    // Method overriding: This method overrides the print() method of Person class
    @Override
    public void print() {
        super.print();  // Call the print() method from the Person class to display name and age
        System.out.println("Designation: " + this.designation);  // Print the designation
        System.out.println("Salary: " + this.salary);  // Print the salary
    }
}

public class MethodOverridingExample {

    public static void main(String[] args) {
        
        // Creating an Employee object using the Employee constructor
        Employee employee = new Employee("Dalila", 23, "Manager", 50000);
        
        // Calling the overridden print() method to display the employee's details
        employee.print();  // This will print name, age, designation, and salary

    }

}
