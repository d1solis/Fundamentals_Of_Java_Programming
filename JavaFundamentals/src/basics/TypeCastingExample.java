package basics;

public class TypeCastingExample {
	
	public static void main(String[] args) {
		
		int integerVal = 100;
		
		// Implicit Type Casting conversion from int to long
		long longVal = integerVal;
		
		// Implicit Type Casting conversion from long to double
		double doubleVal = longVal;
		
		System.out.println(integerVal);
		System.out.println(longVal);
		System.out.println(doubleVal);
		
		
		
		
		double newDoubleVal = 200.56;
		
		// Explicit Type Casting conversion from double to int
		int newIntegerVal = (int) newDoubleVal;
		
		// Explicit Type Casting conversion from int to byte
		byte byteVal = (byte) newIntegerVal;
		
		System.out.println(newDoubleVal);
		System.out.println(newIntegerVal);
		System.out.println(byteVal);
		
	}
}
