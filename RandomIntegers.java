import java.security.SecureRandom;
//import java.util.Random;

public class RandomIntegers{
	public static void main(String [] args){
		
		SecureRandom myrandom = new SecureRandom();
		//Will call a non-static method
		//Will need to create an object from the class SecureRandom
		
		for(int i = 1; i<=20; i++){
			
			//int face = myrandom.nextInt(6); //Generate a random number ranging from (0,1,2,3,4,5)
			int face = 1 + myrandom.nextInt(6);
			//1 is a shifting value (1,2,3,4,5,6)
			
			System.out.printf("Number is: %d\n", face);
		}
		
	}
}