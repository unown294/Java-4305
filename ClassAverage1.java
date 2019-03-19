import java.util.Scanner;

public class ClassAverage1{
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		
		int total = 0;
		int gradeCounter = 0; // to calculate the average
		
		//Flag value is -1
		
		System.out.printf("[%d]Enter grade or -1 to quit: ",gradeCounter + 1);
		int grade = in.nextInt();
		
		//sentinel-controlled loop
		while(grade != -1){
			total = total + grade;
			gradeCounter++; 		//Increments gradeCounter by 1
			
			//Gets next value
			System.out.printf("[%d]Enter grade or -1 to quit: ",gradeCounter + 1);
			grade = in.nextInt();
		}
		
		double average = (double) total/gradeCounter;
		//(double) unary cast operator - means it temperary turns Integers into doubles
		//Temperary double
		
		if(gradeCounter > 0){
			System.out.printf("The total of %d grades entered for the class is %d%n",gradeCounter,total);
			System.out.printf("The class average is %.2f", average);
		}
		
		else{
			System.out.print("No grades were entered");
		}
	}
}