//Claculating Compound interest
//our formula in a = p(1+r)^n
//p is the original amount - 1000
//r is the interest rate - 0.05
//n is the number of years - 10
//a is the amount on deposit at the end of the Nth years

import java.util.Scanner;

public class Interest{
	public static void main (String [] args){
		double p = 1000;
		double r = 0.05;
		double total = 0;
		
		//New Scanner
		Scanner in = new Scanner(System.in);
		System.out.printf("Please enter the amount you wish to deposit as compound amount: ");
		double a = in.nextDouble();
		
		System.out.printf("%s%20%s%n", "Year", "Ammount on Deposit");
		
		for(int n = 0; n <= 10; n++){
			a = p * Math.pow(1.0+r, n);
			
			total = total + a;
			
			System.out.printf("%4d%,20.2f%n", n, total);
		}
		
		System.out.printf("After 10 years the amount that is accumulated is $%,20.2f%n", total);
	}
}