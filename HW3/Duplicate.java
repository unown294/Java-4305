import java.util.Scanner;

public class Duplicate{
	public static void main(String [] args){
		//creates a scanner object
		Scanner in = new Scanner(System.in);
		
		int[] test_array = new int[6];	//Generates a basic array
		int test_value = 0;				//Used as a temporary value for storing input before commiting it to the array
		int positional = 0; 			//Used for Indexing the data in order
		boolean is_duplicate = false;	//Used to test if the value has been duplicated. Doesnt check if specifically been duplicated
		
		while(true){
			//Breaks and ends the loop if the value or length of the indexer(Positioner) exceeds the length of the array
			if(positional > test_array.length - 1){
				break;
			}
			
			//Takes the input of the data from the user
			System.out.printf("Enter number: ");
			test_value = in.nextInt();
			
			//Checks for duplicate data and if the data is between 20 and 200
			if(test_value >= 20 && test_value <= 200){
				
				//Checks for the Duplication of any number
				for(int x = 0; x <= positional; x++){
					if(test_value == test_array[0] || test_value == test_array[1] || test_value == test_array[2] || test_value == test_array[3] || test_value == test_array[4] || test_value == test_array[5]){
						is_duplicate = true;
						break;
					}
					else if(test_value != test_array[0] || test_value != test_array[1] || test_value != test_array[2] || test_value != test_array[3] || test_value != test_array[4] || test_value != test_array[5]){	 	//If the value isnt in the array
						is_duplicate = false;
						break;
					}
				}
				
				//Determines if the value was duplicated or not based on false or true
				if(is_duplicate == true){
					System.out.printf("%d has already been entered\n",test_value);
				}
				else if(is_duplicate == false){
					test_array[positional] = test_value;
					positional++; 						//Increases the positional to add it to 
				}
				
			}
			else{
				System.out.println("Please enter a number between 20 & 200");
			}
			
			
			//Prints the array after each end of the loop
			for(int x = 0; x <= positional - 1; x++){
				System.out.printf("%d ",test_array[x]);
			}
			System.out.println();			//Used move to the next line after printing
		}//End of while			
		
		//Indicates that the loop is over and is exiting
		System.out.println("System exiting...");	
		
	}//End of main
}//End of class