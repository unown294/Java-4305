import java.util.Scanner;

public class Time1Test{
	
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		
		//New time object
		Time1 time = new Time1();
		
		//time.hour = 15; 	-errors because hour is private, no access
		
		displayTime("After time object is created", time);
		System.out.println();
		
		System.out.printf("Please enter an hour value between 0-24");
		
		time.setTime(15, 45, 45);
		displayTime("After setTime method is called", time);
		System.out.println();
		
		//This is a tactic to catch errors thrown to allow the program to continue if the error occurs
		try{
			
			time.setTime(99,99,99);
			
		}
		catch(IllegalArgumentException e){
			
			System.out.printf("Exception: %s\n\n", e.getMessage());
			
		}
		
		displayTime("After calling setTime with invalid value", time);
	}//End of main
	
	
	private static void displayTime(String header, Time1 t){	//Used to print Object time values
		
		System.out.printf("%s\nUniverasal Time: %s\nStandard Time: %s\n", header, t.toUniversalString(),t.toStandardTimeString());
		
	}//end of method
}