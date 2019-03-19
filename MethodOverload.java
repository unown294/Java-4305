//method overloading
//Java Distinguishes overloaded method by their signatures
//method signature:
//the order of the parameters
//the number of the parameters//type of the parameters
//not return type of a method

import java.util.Scanner;

public class MethodOverload{
	public static void main(String [] args){
		
		System.out.printf("Square of int 7 is %d\n", square(7));
		System.out.printf("Square of double 7.5 is %f\n", square(7.5));
		
	}//end of main
	
	public static int square(int intValue){
		System.out.printf("\nCalled square with int arguments: %d\n", intValue);
		return intValue*intValue;
	}//end of square
	
	public static double square(double doubleValue){
		System.out.printf("\nCalled square with double argument: %f\n", doubleValue);
		return doubleValue*doubleValue;
	}//end of square
	
}//end of class