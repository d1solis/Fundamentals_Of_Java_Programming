package polymorphism;

// Interface IABCBank with a default method and two abstract methods
interface IABCBank {
    // Default method with a predefined implementation
    default void welcome() {
        System.out.println("Welcome to ABC Bank!");
    }
    
    // Abstract methods (to be implemented by implementing classes)
    void openAccount();
    void closeAccount();
}

// Interface IBankAccount with abstract methods for bank operations
interface IBankAccount {
    // Abstract methods (to be implemented by implementing classes)
    void deposit();
    void withdraw();
    void balance();
}

// Concrete class Saving that implements both IBankAccount and IABCBank interfaces
class Saving implements IBankAccount, IABCBank {

    // Implementing the openAccount() method from IABCBank interface
    @Override
    public void openAccount() {
        System.out.println("Open Account.");
    }

    // Implementing the closeAccount() method from IABCBank interface
    @Override
    public void closeAccount() {
        System.out.println("Close Account.");
    }

    // Implementing the deposit() method from IBankAccount interface
    @Override
    public void deposit() {
        System.out.println("Deposit in Saving Account.");
    }

    // Implementing the withdraw() method from IBankAccount interface
    @Override
    public void withdraw() {
        System.out.println("Withdraw from Saving Account.");
    }

    // Implementing the balance() method from IBankAccount interface
    @Override
    public void balance() {
        System.out.println("Balance in Saving Account.");
    }
}

// Main class to demonstrate the use of interfaces and their implementation
public class InterfaceExample {

    public static void main(String[] args) {
        
        // Create an instance of the Saving class
        Saving saving = new Saving();
        
        // Call the welcome() method from IABCBank interface (default method)
        saving.welcome();
        
        // Call the deposit, withdraw, and balance methods from IBankAccount interface
        saving.deposit();
        saving.withdraw();
        saving.balance();
        
        // Note: The openAccount() and closeAccount() methods are implemented but not called here.
    }
}

