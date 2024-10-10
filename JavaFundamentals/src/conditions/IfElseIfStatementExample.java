package conditions;

public class IfElseIfStatementExample {

	public static void main(String[] args) {
		
		float sellingPrice = 1200, costPrice = 1000;
		
		// If-Else-If Statement 
		if(sellingPrice > costPrice) {
			System.out.println("Profit");
		}
		else if(costPrice > sellingPrice) {
			System.out.println("Loss");
		}
		else {
			System.out.println("No profit No loss");
		}
		
		// Nested If-Else Statement
		if(sellingPrice > costPrice) {
			System.out.println("Profit");
		}
		else {
			if(costPrice > sellingPrice) {
				System.out.println("Loss");
			}
			else {
				System.out.println("No Profit No Loss");
			}
		}
		
	}
	
}
