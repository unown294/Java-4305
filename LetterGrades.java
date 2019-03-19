import java.util.Scanner;

public class LetterGrades{
	public static void main(String [] args){
		
		int total = 0; //sum of grades
			//total is a primitive type
		int gradeCounter = 0; // number of grades entered
		int aCount = 0; //sum of A grades
		int bCount = 0; //sum of B grades
		int cCount = 0; //sum of C grades
		int dCount = 0; //sum of D grades
		int fCount = 0; //sum of F grades
		
		Scanner in = new Scanner(System.in);
		//input is a reference type
		
		System.out.printf("%s%n%s%n %s%n %s%n",
		"Enter the integer grades in range of 0-100",
		"Type the end of file indicator to terminate input: ",
		"On Windows type <cntrl> z then press enter",
		"On Unix/Linux/MacOS type <cntrl> d then press ender");
		
		//loop
		while(in.hasNext()){
			
			//determines whether there is more data to input
			int grade = in.nextInt(); //reads input
			
			//increment the values accordingly
			total = total + grade;
			gradeCounter++;
			
			switch(grade/10){
				case 9:		// grade was between 90
				case 10: 	// and 100, inclusive
				aCount++;
				break; // terminate Switch
				
				case 8:		//grade was between 80 and 89
				bCount++;
				break;
				
				case 7: 	//grade was between 70 and 79
				cCount++;
				break;
				
				case 6:		//grade was between 60 and 69
				dCount++;
				break;
				
				default: 	//grade less than 60, basically defaults to this if all other cases fail
				fCount++;
				break;
			}// end of switch
			
		}//end of while loop
		
	}//end of main method
}//end of class