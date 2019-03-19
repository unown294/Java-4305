import java.util.Scanner;

public class welcome2 {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your first integer: ");
		int number1 = in.nextInt();
		
		System.out.print("Enter your second integer: ");
		int number2 = in.nextInt();
		
		int sum = number1 + number2;
		
		System.out.printf("Sum is: %d", sum);
	}
}