public class StringConstructor{
	public static void main(String [] args){
		
		char [] charArray = {'b','i','r','t','h',' ','d','a','y'};
		
		//String Objects
		String s = new String("Hello");
		String s1 = new String ();
		String s2 = new String (s);
		String s3 = new String (charArray);
		String s4 = new String (charArray, 6, 3); //Takes the 6th position and take 3 letters after including the 6th index position
		
		System.out.printf("s1=%s\ns2=%s\ns3=%s\ns4=%s\n", s1, s2, s3, s4);
		
	}
	
}