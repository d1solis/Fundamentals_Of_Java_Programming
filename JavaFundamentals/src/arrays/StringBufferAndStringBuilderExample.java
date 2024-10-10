package arrays;

public class StringBufferAndStringBuilderExample {

	public static void main(String[] args) {
	
		long startTime = System.nanoTime();
		
		StringBuffer buffer = new StringBuffer("Hello ");
		System.out.println(buffer.capacity());
		//buffer.append("World");
		//System.out.println(buffer);
		for(int i = 0; i < 10000; i++) {
			buffer.append("World");
		}
		System.out.println("Time taken by StringBuffer: " + (System.nanoTime() - startTime));
		
		StringBuilder builder = new StringBuilder("Hello ");
		System.out.println(builder.capacity());
		//builder.append("World");
		//System.out.println(builder);
		for(int i = 0; i < 10000; i++) {
			builder.append("World");
		}
		System.out.println("Time taken by StringBuilder: " + (System.nanoTime() - startTime));
	}
	
	// The output for this should be that StringBuilder is FASTER than StringBuffer
	// The video example I think for this is incorrect or something with my JVM?
}
