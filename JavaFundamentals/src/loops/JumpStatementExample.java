package loops;

import java.util.Scanner;

public class JumpStatementExample {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		String input = "";
		
		while(!input.equals("quit")) {
			System.out.println("Enter Message: ");
			input = scnr.nextLine().toLowerCase();	// Get user input
			
			if(input.equals("quit")) {
				break;		// Breaks the execution of the loop itself.
			}
			if(input.equals("pass")) {
				continue;	// Iteration is skipped and user input is not taken. Goes back to the beginning of while loop.
			}
			
			System.out.println("\n");
			System.out.println("Message: " + input);
		}
		
	}
	
}
