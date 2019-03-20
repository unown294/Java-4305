//Imports the Secure Random tool
import java.security.SecureRandom;

public class Multiplication{
	//Creates a SecureRandom Object
	static SecureRandom random_int = new SecureRandom();
	
	// Used to create an answer from the two random values selected. It is the value that is returned
	public static int z = 0;
	
	//Constructor 
	public static void CreateQuestion(){
		int x = random_int.nextInt(20);
		int y = random_int.nextInt(20);
		z = x * y;
		
		//Generates the question based on the random numbers created
		System.out.printf("\nHow much is %d times %d?\n", x, y);
	}//End of CreateQuestion
	
	public static boolean CheckResponse(int t){
		//By defualt the answer is false
		boolean correctness = false;
		
		//Test if the value sent over is correct 
		if(t != z){
			correctness = false;
		}
		else{
			correctness = true;
		}
		
		//returns whether or not the value is correct
		return correctness;
	}//End of checkResponses
}//End of class