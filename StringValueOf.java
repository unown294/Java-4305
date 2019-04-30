public class StringValueOf{
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
		Object objectRef1 = null;
		
		System.out.printf("\nValue of charArray: %s\n", String.valueOf(charArray));
		//Converts them into string objectRef
		
		System.out.printf("value of boolean: %s\n", String.valueOf(booleanValue));
		//Converts them into string objectRef
		
		System.out.printf("The second value of charArray: %s\n", String.valueOf(charArray, 1, 1));
		System.out.printf("Value of null: %s\n", String.valueOf(objectRef1));
		
		System.out.println(integerValue);
		System.out.println(longValue);
		System.out.println(objectRef);
				
	}
}