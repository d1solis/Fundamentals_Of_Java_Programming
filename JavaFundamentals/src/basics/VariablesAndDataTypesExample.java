package basics;

import java.util.Date;
import java.awt.*;

public class VariablesAndDataTypesExample {
	
	public static void main(String[] args) {
		
		//Primitive data types:
		
		byte age = 23;
		long viewsCount = 1_112_345_678;
		float price = 234.56F;
		char gender = 'M';
		boolean isValid = true;
		
		System.out.println(age);
		System.out.println(viewsCount);
		System.out.println(price);
		System.out.println(gender);
		System.out.println(isValid);
		
		
		//Non-primitive data types:
		
		String name = "Dalila";
		System.out.println(name);
		
		Date now = new Date();
		System.out.println(now);
		
		Point point1 = new Point(10, 20);
		Point point2 = point1;
		System.out.println(point1.x + " : " + point1.y);
		System.out.println(point2.x + " : " + point2.y);
		point1.y = 25;
		System.out.println(point1.x + " : " + point1.y);
		System.out.println(point2.x + " : " + point2.y);
	}
}
