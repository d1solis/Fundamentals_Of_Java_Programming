package loops;

public class ForEachLoopExample {

	public static void main(String[] args) {
		
		String friendsNames[] = {"Dalila", "Hazell", "Rashad", "Milo"};
		
		// Standard For-Loop 
		// Helps in iterating or traversing the elements rather than working on the index
		// Can be traversed in reversed direction
		for (int i = 0; i < friendsNames.length; i++) {
			System.out.println(friendsNames[i]);
			
		}
		
		System.out.println(" ");
		// For-Loops and For-Each-Loops are good depending on the circumstance
		
		// For-Each Loop AKA Enhanced For-Loop
		// Not appropriate when you want to modify the array, just helps in traversing your iterating
		// Do not keep track of the index and only iterates in the forward direction
		for(String name : friendsNames) {
			System.out.println(name);
		}
		
	}
	
}
