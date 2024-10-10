package loops;

import java.util.Scanner;

public class FizzBuzzProgram {
	
	/**
	 * FizzBuzz with Conditions and Loops
	 * FizzBuzz is a simple game in which when your turn comes, you need to say the next number. Here are the rules:
	 * 		If number is divisible by 3, then you need to say "Fizz".
	 * 		If number is divisible by 5, then you need to say "Buzz".
	 * 		If number is divisible by 3 & 5 both, then you need to say "FizzBuzz".
	 * 		Else you just need to say "Next number".
	 * Example: If there are 20 kids, the number will be printed as below: 
	 *			1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz
	 */

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int num = scnr.nextInt();	// Get user input
		
		for(int i = 0; i <= num; i++) {
			if(i%3 == 0 && i%5 == 0) {		// if num is divisible by both 3 and 5
				System.out.println("FizzBuzz ");
			}
			else if(i%5 == 0) {				// if num is divisible by 5
				System.out.println("Buzz ");
			}
			else if(i%3 == 0) {				// if num is divisible by 3
				System.out.println("Fizz ");
			}
			else {
				System.out.println(i + " ");
			}
		}
	}
	
}
