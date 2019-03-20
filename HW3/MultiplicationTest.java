//Imports the scanner tool
import java.util.Scanner;

public class MultiplicationTest{
	public static void main(String [] args){
		int x = 0;								 //For while centinal value
		boolean correct = true;					 //Used to indicate and start the Multiplication test
		
		//creates scanner object
		Scanner in = new Scanner(System.in);
	
		//While loop for the execution of the test
		while(x != -1){
			
			//Generates a question from the multiplication file and ask for an answer
			if(correct == true){
				Multiplication.CreateQuestion();
				correct = false;
			}
			System.out.printf("Enter your answer (-1 to exit): ");
			x = in.nextInt();
			
			//checks user response for correctness
			correct = Multiplication.CheckResponse(x);
					
			if(correct == true){
				System.out.println("Very Good");
			}
			else if(correct == false && x != -1){
				System.out.println("No. Please try again.");
			}
			else{
				//Used to not print any statements for the sake of exiting
			}
		}//End of while
	}//end of main
}//End of class