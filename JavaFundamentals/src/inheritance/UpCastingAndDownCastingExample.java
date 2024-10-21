package inheritance;

// Base/Parent class named Vehicle
class Vehicle {
    // Method to simulate driving a generic vehicle
    void drive() {
        System.out.println("Driving a vehicle...");
    }
}

// Derived/Child class Car that extends Vehicle
class Car extends Vehicle {
    // Overriding the drive() method to provide specific implementation for a car
    @Override
    void drive() {
        System.out.println("Driving a car.");
    }
    
    // Additional method specific to Car class to simulate speeding up
    void speedUp() {
        System.out.println("Speeding up a car.");
    }
}

public class UpCastingAndDownCastingExample {

    public static void main(String[] args) {
        
        // Upcasting: Assigning a Car object to a Vehicle reference
        Vehicle vehicle1 = new Car();
        vehicle1.drive();  // Calls the overridden drive() method in the Car class

        // Upcasting is implicit and safe since Car "is a" Vehicle.
        
        // Downcasting: Converting the Vehicle reference back to a Car reference
        Vehicle vehicle = new Car();  // Creating a Car object but storing it in a Vehicle reference
        Car car = (Car) vehicle;  // Downcasting explicitly from Vehicle to Car
        car.drive();  // Calls the drive() method in the Car class
        car.speedUp();  // Now able to access speedUp() method specific to the Car class

        // Downcasting must be done explicitly because not all Vehicles are Cars.
        // It can cause a ClassCastException if the actual object type is not a Car.
        
        // Upcasting is secure and can be done implicitly without the need for explicit casting.
    }
}

