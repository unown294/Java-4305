//Import of all necessary utiltiies
import java.util.Scanner;

public class Numbers{
	public static void main(String [] args){
		
		//list of variable that need to be intialized to be used later
		int positive_outputs = 0;
		int negative_outputs = 0;
		int zero_numbers = 0;
		int even_numbers = 0;
		int odd_numbers = 0;
		
		//New Scanner going under the variable "in"
		Scanner in = new Scanner(System.in);
		
		//First input number
		System.out.printf("Please enter the first number: ");
		int number1 = in.nextInt();
		
		//Second Input number
		System.out.printf("Please enter the second number: ");
		int number2 = in.nextInt();
		
		//Third input number
		System.out.printf("Please enter the third number: ");
		int number3 = in.nextInt();
		
		//Does the math that is necessary to see if the number is odd or even
		int even_test1 = number1 % 2;
		int even_test2 = number2 % 2;
		int even_test3 = number3 % 2;
		
		//Are there positive outputs
		if(number1 > 0){
			positive_outputs++;
		}
		if(number2 > 0){
			positive_outputs++;
		}
		if(number3 > 0){
			positive_outputs++;
		}
		
		//Are there negative outputs
		if(number1 < 0){
			negative_outputs++;
		}
		if(number2 < 0){
			negative_outputs++;
		}
		if(number3 < 0){
			negative_outputs++;
		}
		
		//Are there zero numbers
		if(number1 == 0){
			zero_numbers++;
		}
		if(number2 == 0){
			zero_numbers++;
		}
		if(number3 == 0){
			zero_numbers++;
		}
		
		//Are the numbers even
		if(even_test1 == 0){
			even_numbers++;
		}
		if(even_test2 == 0){
			even_numbers++;
		}
		if(even_test3 == 0){
			even_numbers++;
		}
		
		//Are the numbers odd
		if(even_test1 != 0){
			odd_numbers++;
		}
		if(even_test2 != 0){
			odd_numbers++;
		}
		if(even_test3 != 0){
			odd_numbers++;
		}
		
		System.out.printf("%nThe inputs are %d, %d, and %d", number1, number2, number3);
		System.out.printf("%nThe number of positive inputs is %d", positive_outputs);
		System.out.printf("%nThe number of negative inputs is %d", negative_outputs);
		System.out.printf("%nThe number of zero inputs is %d", zero_numbers);
		System.out.printf("%nThe number of even inputs is %d", even_numbers);
		System.out.printf("%nThe number of odd inputs is %d", odd_numbers);
	
	}//End of main
}//End of class