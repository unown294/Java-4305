public class StringDifferentMethod{
	public static void main(String [] args){
		
		String s1 = "hello";
		String s2 = "GOODBYE";
		String s3 = "   spaces   ";
		
		//replace method
		System.out.printf("Replacements: %s\n", s1.replace('l','L'));
		
		//Upper and lower case methods
		System.out.printf("Uppercase: %s\n", s1.toUpperCase());
		System.out.printf("Lowercase: %s\n", s2.toLowerCase());
		
		//Trim method
		System.out.printf("Trim: %s\n", s3.trim());
		
		//toCharArray
		char [] charArray = s1.toCharArray();
		
		for(char character : charArray){
			
			System.out.println(character);
			
		}
		System.out.println(); //Blank space for later modifications
	}
}