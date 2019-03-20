import java.util.Scanner;

public class LargestSmallest{
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		
		//Intialized values
		int largest = 0;
		int smallest = 0;
		int x = 0;
		int compare = 0;
		
		while(x < 10){
			x++;
			System.out.printf("[%d] Enter an integer: ", x);
			compare = in.nextInt();
			
			if(x == 1){
				largest = compare;
				smallest = compare;
			}
			
			if(compare > largest){
				largest = compare;
			}
			else if(compare < smallest){
				smallest = compare;
			}
			else{
				//hehe nothing
			}
		}
		System.out.printf("\nLargest Integer: %d\n", largest);
		System.out.printf("Smallest Integer: %d\n", smallest);
	}
}