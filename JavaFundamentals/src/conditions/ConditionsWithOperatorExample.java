package conditions;

public class ConditionsWithOperatorExample {

	public static void main(String[] args) {
		
		boolean isLoggedIn = true;
		boolean isEmailVerified = false;
		boolean isCardInfoValid = true;
		
		// If-else Statement with operators
		if(isLoggedIn && isEmailVerified && isCardInfoValid) {
			System.out.println("You are allowed to make a purchase");
		}
		else {
			System.out.println("You are not allowed to make a purchase");
		}
		
		// Basic alternative way without operators
		if(isLoggedIn) {
			if(isEmailVerified) {
				if(isCardInfoValid) {
					System.out.println("You are allowed to make a purchase");
				}
			}
		}
		
	}
	
}
