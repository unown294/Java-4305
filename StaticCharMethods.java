import java.util.Scanner;

public class StaticCharMethods{
	public static void main (String [] args){
		
		//new scanner object
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a character and press Enter");
		String input = in.next();
			//The .next() method looks for spaces in the response. Good for char seperation
			//The .nextLine() method retains the entire line
		
		char c = input.charAt(0);
		
		System.out.printf("is defined method for Char c: %b\n", Character.isDefined(c));
			//Whether it is defined in the unicode character set
		
		System.out.printf("is digit: %b\n", Character.isDigit(c));
			//Whether it is a digit in the unicode character set
			
		System.out.println("All values were tested at char 'c', index 0");
		System.out.printf("is first character in a Java identifier: %b\n", Character.isJavaIdentifierStart(c));
		System.out.printf("is letter: %b\n", Character.isLetter(c));
		System.out.printf("is lower case: %b\n", Character.isLowerCase(c));
		System.out.printf("is upper case: %b\n", Character.isUpperCase(c));
		System.out.printf("is to upper case: %s\n", Character.toUpperCase(c));
		System.out.printf("is to lower case: %s\n", Character.toLowerCase(c));
		
	/** Print Radix methods **/
		
		System.out.println();
		System.out.println("To be fair I have no clue how this works at the moment");
		System.out.println();
		System.out.println("Please enter a radix");
		
		//convert the value in different number systems
		//base 10, base 2, base 8
		
		int radix = in.nextInt();
		
		//get choice
		System.out.printf("Please chose one: \n1--%s\n2--%s\n",
						  "convert digit to character",
						  "convert character to digit");
						  
		int choice = in.nextInt();
		
		switch(choice){
			case 1:
				System.out.println("Enter a digit: ");
				int digit = in.nextInt();
				System.out.printf("Convert digit to character: %s\n", Character.forDigit(digit, radix));
				break;
			
			case 2:
				System.out.println("Enter a character: ");
				char character = in.next().charAt(0);
				System.out.printf("Convert character to digit: %s\n", Character.digit(character, radix));
				break;
				
			default:
				System.out.println("Invalid choice: no further execution");
		}
		
		
	}
}