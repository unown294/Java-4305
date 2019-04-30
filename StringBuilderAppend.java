public class StringBuilderAppend{
	public static void main(String [] args){
		
		//Instances values
		char [] charArray = {'a','b','c','d','e','f'};
		boolean booleanValue = true;
		String myString = "goodbye";
		char characterValue = 'Z';
		int integerValue = 7;
		long longValue = 100000000L;
			//If not using an L, java will treat the value as an integer
			//With the letter L, java treats it as a long
		float floatValue = 2.5f;
			//if not using an F, java will treat this as a double
			//with the letter F, java treats it as a float
		double doubleValue = 33.3333;
		Object objectRef = "hello";
		
		//String Builder
		StringBuilder buffer = new StringBuilder();
		
		//Append module
		buffer.append(objectRef)
		.append(System.getProperty("line.separator"))
		.append(myString)
		.append(System.getProperty("line.separator"))
		.append(integerValue)
		.append(System.getProperty("line.separator"))
		.append(doubleValue)
		.append(System.getProperty("line.separator"))
		.append(floatValue)
		.append(System.getProperty("line.separator"))
		.append(charArray);
			// The .appends build off the original buffer located on line 21
			// This means you dont need to say buffer each time a value is appended until ;
		
		//Print the buffer
		System.out.printf("Buffer contains: \n%s", buffer);
		
	}
}