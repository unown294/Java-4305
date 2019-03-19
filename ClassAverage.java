import java.util.Scanner;

public class ClassAverage{
	public static void main(String [] args){
		int gradeCounter = 1; 	//counter - control variable
		int total = 0;			//Total grades		
		
		//Scanner object
		Scanner in = new Scanner(System.in);
		
		//counter-controlled while loop
		
		while(gradeCounter <= 10){
			
			//Gathers the grades of each student
			System.out.printf("[%d]Enter your grade: ",gradeCounter);
			int grade = in.nextInt();

			//Gathers the sum of the grade over time
			total = total + grade;
			
			//Increases the counter by 1
			gradeCounter++;
			
		}// end of the loop
		
		//Gets the average of 10 students grades for the class
		double average = total / 10; 
		
		//Displays the results
		System.out.printf("The total for the class grade was %d", total);
		System.out.printf("The average for the class is %.0f", average);
	}
}