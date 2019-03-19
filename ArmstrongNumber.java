import java.util.Scanner;

public class ArmstrongNumber{
	public static void main(String [] args){
		Scanner in = new Scanner (System.in);
		
		System.out.println("Please enter your number: ");
		int number = in.nextInt();
		//1634
		
		System.out.println("Please enter number of digits: ");
		int digits = in.nextInt();
		//4
		
		double total = 0;
		int temp = number;
		
		do {
			
			int first_digit = temp %10;
			//returns 4
			
			temp = temp / 10;
			//163
			
			total = total + Math.pow(first_digit, digits);
			//4^4 calculation
		} while (temp > 0);
		
		System.out.printf("The sum of the number entered (%d) is %.0f", number, total);
	}

}