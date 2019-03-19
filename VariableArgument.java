public class VariableArgument{
	
	public static double average(double ... numbers){
		//The ... means that it has an unspecified amount of double values being sent
		//Each argument must be the same type
		
		double total = 0.0;
		
		for(double d: numbers){
			total = total + d;
		}
		
		return total/numbers.length;
		//Returns the average
	}//end of Average method
	
	public static void main(String [] args){
		double d1 = 10.0;
		double d2 = 20.0;
		double d3 = 30.0;
		double d4 = 40.0;
		
		System.out.printf("Average of d1 and d2 is %.1f", average(d1,d2));
		System.out.printf("\nAverage of d1, d2, and d3 is %.1f", average(d1,d2,d3));
		System.out.printf("\nAverage of d1, d2, d3, and d4 is %.1f", average(d1,d2,d3,d4));
		
	}//end of main
}//end of class