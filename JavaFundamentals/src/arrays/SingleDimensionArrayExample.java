package arrays;

public class SingleDimensionArrayExample {

	public static void main(String[] args) {
		
		// Declaring an array:
			//int[] marks = new int [5];
		
		// OR, declaring it like this:
			// int[] marks = new int[5];
		
		// Initializing an array:
			//int[] marks = new int[] {10, 20, 30, 40, 50}
		
		// Declare and assign:
			int[] marks = new int[5];
			marks[0] = 100;
			marks[1] = 60;
			marks[2] = 78;
			marks[3] = 80;
			marks[4] = 98;
			
				// For-loop
				for(int i = 0; i < marks.length; i++) {
					System.out.println(marks[i]);
				}
				
				System.out.println("-----------------------");
				
				// For-each loop, AKA Enhanced for-loop
				for(int value : marks) {
					System.out.println(value);
				}
	}
}
