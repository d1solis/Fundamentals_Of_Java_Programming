package conditions;

public class IfStatementExample {

	public static void main(String[] args) {
		
		boolean isAuthenticated = true;
		
		if(isAuthenticated) {
			System.out.println("Logged in.");
		}
		
		if(!isAuthenticated) {
			System.out.println("Not logged in.");
		}
		
	}
	
}
