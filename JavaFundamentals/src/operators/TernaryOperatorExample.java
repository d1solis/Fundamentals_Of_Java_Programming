package operators;

public class TernaryOperatorExample {

	public static void main(String[] args) {
		
		boolean isAuthenticated = true;
		
		if(isAuthenticated) {
			System.out.println("You are logged-in successfully.");
		}else {
			System.out.println("You are not logged-in.");
		}
		
		//Ternary Operator consists of '?' (basically the short-hand version of writing the if-else statement above)
		String result = (isAuthenticated) ? "LoggedIn" : "Not LoggedIn";
		System.out.println(result);
		
	}
	
}
