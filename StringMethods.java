public class StringMethods{
	public static void main (String [] args){
		
		String s1 = "Hello there"; //A String reference
		
		char [] charArray = new char[5];
		
		//length
		System.out.printf("Length of s1 is %d\n", s1.length());
		
		//Display reversed string
		for(int i = s1.length() - 1; i>= 0; i--){
			System.out.printf("%c", s1.charAt(i));
		}
		
		//Copying characters
		s1.getChars(0,5,charArray,0);
		System.out.println();
		
		for(char characters: charArray){
			System.out.println(characters);
		}
	}
}