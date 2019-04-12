//Import list
import java.util.Scanner;
import java.util.InputMismatchException;

public class DivideByZero{
	
	public static int quotient(int numerator, int denominator) throws ArithmeticException{
		//The command "Throws" will throw an ArithmeticException
		
		return numerator / denominator;
		//if denominator is 0, then this method will throw an arithmetic exception
		
	}
	
	public static void main(String [] args){
		
		Scanner in = new Scanner(System.in);
		boolean forloop = true;
		
		do{
			try{
				
				System.out.print("Please enter an integer numerator: ");
				int numerator = in.nextInt();
				
				System.out.print("Please enter an integer denominator: ");
				int denominator = in.nextInt();
				
				int result = quotient(numerator, denominator);
				System.out.println("Result is " + result);
				
				forloop = false;
				//inputs are successful and needs to close
			}
			
			catch(ArithmeticException e){
				
				System.err.printf("Exception: %s\n", e);
				//Error message format
				
				System.out.printf("Zero was supplyed in the denominator which is invalid, please try again\n\n");
				
			}
			
			catch(InputMismatchException e){
				
				System.err.printf("Exception: %s\n", e);
				in.nextLine(); //To prevent errors with scanner
				
				System.out.printf("You must enter integers, try again\n\n");
			}
			
			//catch(ArithmeticException | InputMismatchException)
				//you can catch multiple exception
				//but the result will be the same for them if one were to occur
			
		}while(forloop);
		
	}
}//end of class