package polymorphism;

// Abstract class ABCBank
abstract class ABCBank {
    // Static method to display a message (common to all bank accounts)
    public static void message() {
        System.out.println("Welcome to ABC Bank!" + "\n");
    }
    
    // Abstract methods for opening and closing an account
    abstract void openAccount();
    abstract void closeAccount();
}

// Abstract class BankAccount that extends ABCBank
abstract class BankAccount extends ABCBank {
    // Abstract methods for banking operations (to be implemented by subclasses)
    abstract void deposit();
    abstract void withdraw();
    abstract void balance();
}

// Concrete class SavingAccount that extends BankAccount
class SavingAccount extends BankAccount {
    
    // Implementing abstract method to open a savings account
    @Override
    void openAccount() {
        System.out.println("Open Account.");
    }
    
    // Implementing abstract method to close a savings account
    @Override
    void closeAccount() {
        System.out.println("Close Account.");
    }

    // Implementing method to deposit into a savings account
    @Override
    void deposit() {
        System.out.println("Deposit in Saving Account.");
    }

    // Implementing method to withdraw from a savings account
    @Override
    void withdraw() {
        System.out.println("Withdraw from Saving Account.");
    }

    // Implementing method to check balance in a savings account
    @Override
    void balance() {
        System.out.println("Balance in Saving Account.");
    }
}

// Concrete class CurrentAccount that extends BankAccount
class CurrentAccount extends BankAccount {
    
    // Implementing abstract method to open a current account
    @Override
    void openAccount() {
        System.out.println("Open Account.");
    }
    
    // Implementing abstract method to close a current account
    @Override
    void closeAccount() {
        System.out.println("Close Account.");
    }
    
    // Implementing method to deposit into a current account
    @Override
    void deposit() {
        System.out.println("Deposit in Current Account.");
    }

    // Implementing method to withdraw from a current account
    @Override
    void withdraw() {
        System.out.println("Withdraw from Current Account.");
    }

    // Implementing method to check balance in a current account
    @Override
    void balance() {
        System.out.println("Balance in Current Account.");
    }
}

// Main class to demonstrate the use of abstract classes and method overriding
public class AbstractClassExample {

    public static void main(String[] args) {
        
        // Call static method from ABCBank to display a welcome message
        ABCBank.message();
        
        // Create a SavingAccount object and perform various operations
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.openAccount();
        savingAccount.deposit();
        savingAccount.withdraw();
        savingAccount.balance();
        savingAccount.closeAccount();
        
        System.out.println("-------------------------------");
        
        // Create a CurrentAccount object and perform various operations
        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.openAccount();
        currentAccount.deposit();
        currentAccount.withdraw();
        currentAccount.balance();
        currentAccount.closeAccount();
    }
}