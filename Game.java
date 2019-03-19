//Introducing enum types
//game rules
//you roll two dice. Each dice has six faces (1-6)
//the sum of spots on two upward faces is calculated
//if the sum is 7 or 11, you win
//if sume is 2, 3, or 12, you lose
//if the sum is 4,5,6,7,8,9,or 10 on the first throw, the sum becomes your point.
//to win, you must continue to roll until you make your point
//you lose by rooling a 7 before making your point

import java.security.SecureRandom;

public class Game{
	private static final SecureRandom randomNumber = new SecureRandom();
	//SecureRandom Object
	//Static - all static methods in this class can access this object
	//Final - when it is initialized to any value, this value cannot be changed
	
	//enum types
	private enum Status {CONTINUE, WON, LOST};
	
	//constants
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_ELEVEN = 11;
	private static final int BOX_CARS = 12;
	//Final - values cannot be changed
	//Static - all static methods in this class can access this object
	//private - these variables can be only used in this class
		
	public static void main(String [] args){
		int myPoint = 0;
		Status gameStatus;
		
		int sumofDice = rollDice();
		
		switch(sumofDice){
			case SEVEN:
			case YO_ELEVEN:
				gameStatus = Status.WON;
				break;
			case SNAKE_EYES:
			case TREY:
			case BOX_CARS:
				gameStatus = Status.LOST;
				break;
			default:
				gameStatus = Status.CONTINUE;
				myPoint = sumofDice;
				System.out.printf("Point is %d\n", myPoint);
				break;
		}//End of Switch
		
		while(gameStatus == Status.CONTINUE){
			sumofDice = rollDice();
			
			//determine the results
			
			if(sumofDice == myPoint){
				gameStatus = Status.WON;
			}
			else if(sumofDice == SEVEN || sumofDice == YO_ELEVEN){
				gameStatus = Status.LOST;
			}
		}//End of While
		
		//Display won or lost message
		if(gameStatus == Status.WON){
			System.out.println("Player wins");
		}
		else{
			System.out.println("Player losses");
		}
	}//End of Main
	
	public static int rollDice(){
		int die1 = 1+randomNumber.nextInt(6); 
		//Must have a 1 added as the RandomNumber starts at 0 and goes to 5
		int die2 = 1+randomNumber.nextInt(6);
		int sum = die1 + die2;
		
		System.out.printf("Player rolled %d + %d = %d\n", die1, die2, sum);
		
		return sum;
	}//End of rollDice
}