package arrays;

public class MultiDimensionArrayExample {

	public static void main(String[] args) {
		
		// Declaring a multidimensional array:
			// int[][] myArray = new int [Row][Column]
		
		int[][] marks = {				// [3 Rows][5 Columns]
				{67, 76, 87, 89, 98},	// Row 0
				{76, 77, 56, 65, 90},	// Row 1
				{67, 79, 92, 63, 55}	// Row 2
		};
			
		
			for(int i = 0; i < 3; i++) {		// First for loop will iterate over the rows; i
				for(int j = 0; j < 5; j++) {	// Second for loop will iterate over the columns; j
					System.out.print(marks[i][j] + "\t");	// Prints in a table format
				}
				System.out.println();
			}
		
	}
	
}
