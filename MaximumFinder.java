import java.util.Scanner;

public class MaximumFinder{
	//private String name;
	//private String surname; two instance variable
	//private static int age = 50;
	
	//setName(String name) - instance method
	
	//a static method can directly use a static variable
	//for instance variables, you need to create an object from the given class
	
	//MaximumFinder myfinder = new MaximumFinder("ezgi", "akar");
	//MaximumFinder myfinder2 = new MaximumFinder("ezgi1", "akar1");
	//age will be same for these two objects, because we have only one copy of age
	
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		
		System.out.printf("Enter three Floating-point values seperated by spaces: \n");
		//12.12 16.13 45.36
		
		double number1 = in.nextDouble();
		double number2 = in.nextDouble();
		double number3 = in.nextDouble();
		
		double result = maximum(number1, number2, number3);
		
		System.out.println("Maximum number is " + result);
	}
	
	public static double maximum(double x, double y, double z){
		double maximumValue = x;
		
		if(y > maximumValue){
			maximumValue = y;
		}
		if(z > maximumValue){
			maximumValue = z;
		}
		
		return maximumValue;
	}
}