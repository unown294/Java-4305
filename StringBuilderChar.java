public class StringBuilderChar{
	public static void main (String [] args){
		
		StringBuilder buffer = new StringBuilder("hello there");
		
		System.out.printf("character at 0:%s\ncharacter at 4:%s\n", buffer.charAt(0), buffer.charAt(4));
		
		char [] charArray = new char [buffer.length()];
		buffer.getChars(0, buffer.length(), charArray, 0);
		
		for(char character: charArray){
			System.out.println(character);
		}
		
		buffer.setCharAt(0,'H');
		System.out.printf("My buffer is '%s'\n", buffer);
		
		buffer.reverse();
		System.out.printf("My reversed buffer is '%s'\n",buffer);
	}
}