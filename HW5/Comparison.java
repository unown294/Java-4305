import java.util.Scanner;

public class Comparison{
	public static void main(String [] args){
		
		// Base instances variables
		int characterNumbers = 0; //Numbers of characters used in regionMatches Selection
		int index = 0;			  // The Index value used to in RegionMatches selection
		
		//Scanner object
		Scanner in = new Scanner(System.in);
		
		//First string input
		System.out.println("Please enter first string:");
		String first = in.nextLine();
		
		//Second string input
		System.out.println("Please enter second string:");
		String second = in.nextLine();
		
		//Number of characters being checked
		System.out.println("Please enter number of characters:");
		characterNumbers = in.nextInt();
		
		//Index length for both first and second string regionMatches
		System.out.println("Please enter starting index:");
		index = in.nextInt();
		
		//RegionMatches
		if(first.regionMatches(true,index,second,index,characterNumbers) == true){
			System.out.println("The strings selection is equal");
		}
		else{
			System.out.println("The string selection are not equal");
		}
		
	}
}