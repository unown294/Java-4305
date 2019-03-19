public class Scope{
	
	private static int x = 1; //Accessable to all methods of this class
	
	public static void main(String [] args){
		int x = 5; //Local Variable
		
		System.out.printf("\nMain x on entering method Main is %d\n", x);
		++x;
		System.out.printf("\nMain x on leaving method Main is %d\n", x);
		
		useLocalVariable(); 	//Calls for the method useLocalVariable
		useField();				//Calls for the method useField
	}
	
	public static void useLocalVariable(){
		int x = 25;
		
		System.out.printf("\nLocal x on entering method useLocalVariable is %d\n", x);
		++x;
		System.out.printf("\nLocal x before exiting method useLocalVariable is %d\n", x);
		
	}// End of useLocalVariable Method
	
	public static void useField(){
		System.out.printf("\nField x on entering method useField is %d\n", x);
		++x;
		System.out.printf("\nField x on entering method useField is %d\n", x);
	}
}