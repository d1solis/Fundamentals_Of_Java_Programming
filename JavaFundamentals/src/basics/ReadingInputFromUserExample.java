package basics;
import java.util.Scanner;

public class ReadingInputFromUserExample {
	
	public static void main(String args[]) {
		
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = scnr.nextLine();
		
		System.out.print("Enter your age: ");
		int age = scnr.nextInt();
		
		System.out.println("Enter your gender: ");
		char gender = scnr.next().charAt(0);
		
		System.out.println("Enter your contact number: ");
		double contact = scnr.nextDouble();
		
		System.out.println("User Details:");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Gender: " + gender);
		System.out.println("Contact: " + contact);
	}
}
