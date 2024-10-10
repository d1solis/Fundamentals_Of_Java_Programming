package conditions;

import java.util.Scanner;

public class SwitchStatementExample {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Admin - Gets full access");
		System.out.println("Subadmin - Gets access to create/delete courses");
		System.out.println("Testprep - Gets access to create/delete tests");
		System.out.println("User - Gets access to consume content");
		System.out.println("Enter your choice: ");
		
		String user = scnr.nextLine();
		
		switch(user) {
		case "admin":
			System.out.println("Gets full access");
			break;
		
		case "subadmin":
			System.out.println("Gets access to create/delete courses");
			break;
		
		case "testprep":
			System.out.println("Gets access to create/delete tests");
			break;
			
		case "user":
			System.out.println("Gets access to consume content");
			break;
			
		default:
			System.out.println("You are a trial user");
			break;
		}
		
	}
	
	
}
