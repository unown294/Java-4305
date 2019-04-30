import java.util.Scanner;

public class TokenTest{
	public static void main(String [] args){
		
		//New Scanner object
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a sentence and press Enter: ");
		String sentence = in.nextLine();
		
		String [] tokens = sentence.split("\t");
			//Space, tab, new line, carriage return
		
		System.out.printf("Number of elements %d\n", tokens.length);
		
		for(String token: tokens){
			System.out.println(token);
		}
	}
}