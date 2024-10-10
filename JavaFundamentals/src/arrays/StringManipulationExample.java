package arrays;

public class StringManipulationExample {

	public static void main(String[] args) {
		
		// Using String literal
		String str1 = "Hello ";
		System.out.println(str1);
		
		// Using String Object
		String str2 = new String("World");
		System.out.println(str2);
		
		// Concatenating String literal and String object
		String str3 = str1 + str2;
		System.out.println(str3);
		
		System.out.println();
		
		// String Methods
		System.out.println("Length of string: " + str3.length());
		System.out.println("Character at index: " + str3.charAt(0));
		System.out.println("Concatenate two strings: " + str1.concat(str2));
		System.out.println("String from the two indexes: " + str3.substring(0, 5));
		System.out.println("Checks if two strings are equal: " + str1.equals(str2));
		System.out.println("Checks whether string contains substring: " + str3.contains("Hello"));
		System.out.println("Makes string lowercase: " + str3.toLowerCase());
		System.out.println("Makes string uppercase: " + str3.toUpperCase());
		System.out.println("Removes any leading and trailing whitespace: " + str3.trim());
		
	}
	
}
