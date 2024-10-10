package operators;

public class ArithmeticOperatorsExample {

	public static void main(String[] args) {
		
		int num1 = 100;
		int num2 = 50;
		
		System.out.println("Addition : " + (num1 + num2));
		System.out.println("Subtraction : " + (num1 - num2));
		System.out.println("Multiplication : " + (num1 * num2));
		System.out.println("Division : " + (num1 / num2));
		System.out.println("Remainder : " + (num1 % num2));
		
		// Since num1 = 100, we know that num1++ means num1 gets incremented by 1 but num1 gets printed first 
		// and then the incrementation happens giving us 101 but not printed
		// then ++num1 means from the post increment, we have 101 then adding 1 more to it, thus printing 102
		System.out.println("Post Increment : " + (num1++));
		System.out.println("Pre Increment : " + (++num1));
		
		// Since num1 = 102 from the previous lines, num1-- gets decremented by 1 but num1 gets printed first
		// and then the decrementation happens, giving us 101 but not printed
		// then --num1 means from the post decrement, we have 101 then subtracting 1 more to it, thus printing 100
		System.out.println("Post Decrement : " + (num1--));
		System.out.println("Pre Decrement : " + (--num1));
	}
	
}
