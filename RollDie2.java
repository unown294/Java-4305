import java.security.SecureRandom;

public class RollDie2{
	public static void main(String [] args){
		SecureRandom myrandom = new SecureRandom();
		
		int [] frequency = new int [7];
		//0, 1, 2, 3, 4, 5, 6
		
		for(int roll = 0; roll < 60000000; roll++){
			++frequency[1+ myrandom.nextInt(6)];
			//Counts the ammount of times the dice lands on the specific face value.
			//Stores the value in an array for use in the next for loop
		}
		
		for(int face = 1; face < frequency.length; face++){
			System.out.printf("%4d%10d\n", face, frequency[face]);
		}
		
	}
}