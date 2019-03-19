/*
- selection statements
- if statement - single selections statement
if student's grade is greater than 60 then display "Passed"
*/
import java.util.Scanner;

public class selectionStatement{
	public static void main(String [] args){
		//single selection statement
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the desired grade: ");
		double grade = in.nextDouble();
		
		if(grade >= 60){
			System.out.print("Passed");
		}
		
		//double selection statement
		double grade1 = 55;
		
		if(grade1 >= 60 && grade1 < 70){
			System.out.print("Passed");
			System.out.print("Grade: D");
		}
		else if(grade >= 70 && grade < 80){
			System.out.print("Passed");
			System.out.print("Grade: C");
		}
		else if(grade >= 80 && grade < 90){
			System.out.print("Passed");
			System.out.print("Grade: B");
		}
		else if(grade >= 90 && grade <= 100){
			System.out.print("Passed");
			System.out.print("Grade: A");
		}
		else{
			System.out.print("Failed");
			System.out.print("Grade: F");
		}
	}
}