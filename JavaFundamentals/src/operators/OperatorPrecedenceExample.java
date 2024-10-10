package operators;

public class OperatorPrecedenceExample {

	public static void main(String[] args) {
		
		int num1 = 50, num2 = 100, num3 = 30;
		
		// Order of precedence: * and / have higher precedence than + but * and / are of same precedence so 
		// we proceed from Left to Right when computing. So num2 * num3 then the total of that / 10 then
		// the total of that + num1. So result should be 350.
		int result = num1 + num2 * num3 / 10;
		
		System.out.println(result);
		
	}
	
}
