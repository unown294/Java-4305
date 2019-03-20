//Imports the scanner tool
import java.util.Scanner;

public class MyTest{
	public static void main(String [] args){		
		//All the values that needed to be intialized before the while loop
		int correct_answers = 0;	//Keeps tracks of how many questions gotten right
		int response1 = -1;			//Response set to -1 to ensure the value isnt selected prior
		int response2 = -1;			//Response set to -1 to ensure the value isnt selected prior
		int response3 = -1;			//Response set to -1 to ensure the value isnt selected prior
		boolean test_again = true;	//This value is true to initiate the testing, but is decided at the end of the loop to be true or false
		
		//Creates the scanner object
		Scanner in = new Scanner(System.in);
		
		//While loop that continues so long as test_again is true
		while(test_again){			
			//Prints the Beginning intro statement for the test
			System.out.println("");
			System.out.println("Welcome to Java Programming Test");
			System.out.println("This test includes 3 questions");
			System.out.println("Each question includes 4 choices");
			System.out.println("");
			
			//Tracks the amount of correct answers for the results later
			correct_answers = 0;
			
			//Question 1 Logic
			System.out.printf("Q1 : Which of the following is not a Java primitive type? \n1-Char 2-Byte 3-Real 4-Double (0 to exit the test)\nAnswer: ");
			response1 = in.nextInt();
			
			if(response1 == 0){
				break;
			}
			else if(response1 == 2){
				correct_answers++;
				System.out.println("Answer is correct");
			}
			else{
				System.out.println("Answer is wrong");
			}
			
			//Question 2 Logic
			System.out.printf("\nQ2: The format specifier _______ is a placeholder for an int value.\n1-%%d 2-%%f 3-%%s 4-%%b (0 to exit the test)\nAnswer: ");
			response2 = in.nextInt();
			
			if(response2 == 0){
				break;
			}
			else if(response2 == 1){
				correct_answers++;
				System.out.println("Answer is correct");
			}
			else{
				System.out.println("Answer is wrong");
			}
			
			//Question 3 logic
			System.out.printf("\nQ3: To exit out of a loop completely and resume the flow of control at the next statement after the loop, use a ______.\n1-continue 2-break 3-return 4-any of the above (0 to exit the test)\nAnswer: ");
			response3 = in.nextInt();
			
			if(response3 == 0){
				break;
			}
			else if(response3 == 2){
				correct_answers++;
				System.out.println("Answer is correct");
			}
			else{
				System.out.println("Answer is wrong");
			}
			
			//Needed to space the last question from the Results
			System.out.println();
			
			//Prints the Test results based on the amount of questions they got correct
			switch(correct_answers){
				case 1:		//1 Correct
					System.out.println("It is time to start to learning Java");
					break;
				case 2:		//2 Correct
					System.out.println("Very good");
					break;
				case 3:		//3 Correct
					System.out.println("Excellent");
					break;
				default:	//0 Correct
					System.out.println("It is time to start to learning Java");
					break;
			}
			
			System.out.println(); //Spacer to seperate the results
			
			//Check if you want to take test again
			System.out.printf("Do you want to take the test again (True or False):");
			test_again = in.nextBoolean();
			
			//If the test ins't wanting to be taken again this will be displayed
			if(test_again == false){
				System.out.println("Bye Bye");
			}
		}//End of while
	}//End of main
}//End of class