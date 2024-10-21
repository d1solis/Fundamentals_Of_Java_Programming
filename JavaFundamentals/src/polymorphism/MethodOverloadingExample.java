package polymorphism;

// Class containing overloaded methods for addition
class Calculation {
    
    // Overloaded method for adding two integers
    public static int addition(int num1, int num2) {
        return num1 + num2;
    }
    
    // Overloaded method for adding three integers
    public static int addition(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    
    // Overloaded method for adding two float values
    public static float addition(float num1, float num2) {
        return num1 + num2;
    }
    
    // Overloaded method for adding an integer and a float
    public static float addition(int num1, float num2) {
        return num1 + num2;
    }
    
    // Overloaded method for adding a float and an integer
    public static float addition(float num1, int num2) {
        return num1 + num2;
    }
}

public class MethodOverloadingExample {

    public static void main(String[] args) {
        
        // Calls the addition(int, int) method
        System.out.println(Calculation.addition(100, 200));  // Output: 300
        
        // Calls the addition(int, int, int) method
        System.out.println(Calculation.addition(100, 200, 300));  // Output: 600
        
        // Calls the addition(float, float) method
        System.out.println(Calculation.addition(100.50F, 200.30F));  // Output: 300.8
        
        // Calls the addition(int, float) method
        System.out.println(Calculation.addition(100, 200.40F));  // Output: 300.4
        
        // Calls the addition(float, int) method
        System.out.println(Calculation.addition(100.39F, 200));  // Output: 300.39
        
    }
    
    // This example demonstrates method overloading, which allows multiple methods to have the same name
    // but with different parameters (type, number, or both).
    // Overloading is a form of compile-time polymorphism, where the correct method is chosen by the compiler
    // based on the method signature (parameter types and count).
}
