public class StringIndexMethod{
	public static void main(String [] args){
		
		/**Instance variables**/
		String letters = "abcdefghijklmnabcdefghijklmn";
		//28 letters
		//0-27 index
		String s1 = "Happy ";
		String s2 = "Birthday";
		
		/** indexOf **/
		System.out.printf("c is located at index %d\n", letters.indexOf('c'));
		System.out.printf("a is located at index %d\n", letters.indexOf('a', 1));
		System.out.printf("z is located at index %d\n", letters.indexOf('z'));
		System.out.printf("def is located at index %d\n", letters.indexOf("def"));
		
		/** lastIndexOf **/
		System.out.printf("c is located at index %d\n", letters.lastIndexOf('c'));
		System.out.printf("a is located at index %d\n", letters.lastIndexOf('a', 25));
		
		/** Substrings **/
		System.out.printf("substring: %s\n", letters.substring(20));
		System.out.printf("substring: %s\n", letters.substring(3,6));
		
		/** Concatination **/
		System.out.printf("concatenation: %s", s1.concat(s2));
	}
}