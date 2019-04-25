public class StringBuilderConstructors{
	public static void main(String [] args){
		
		StringBuilder buffer1 = new StringBuilder();
		//by default capacity of buffer1 = 1
		//StringBuilder buffer1 = " "; is invalid or not possible
		
		StringBuilder buffer2 = new StringBuilder(10);
		//capacity for buffer2 is 10
		
		StringBuilder buffer3 = new StringBuilder("hello");
		//Capacity is number of characters + 16
		//total is 21
		
		StringBuilder buffer4 = new StringBuilder("Hello, how are you?");
		//Capacity exceeded
		
		System.out.printf("Buffer4: %s\nlength=%d\ncapacity=%d\n",
							buffer4.toString(), buffer4.length(), buffer4.capacity());
							
		buffer4.ensureCapacity(75);
		//Capacity will be 75, because 75 is greater than 35
		
		//buffer4.ensureCapacity(10); - the capacity will remain same
		//Because 10 is lower than 35 (19 + 16);
		
		System.out.printf("new capacity is %d\n", buffer4.capacity());
		
		//setLength
		buffer4.setLength(10);
		
		System.out.printf("new length of buffer4 is %d\n", buffer4.length());
	}
}