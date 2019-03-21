import java.util.Arrays;

public class ArraysClass{
	
	public static void main(String [] args){
		
		//Sort array
		double [] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
		
		Arrays.sort(doubleArray);
		//Sorts is a static method in the class Arrays
		//Also sorts arrays by the data values
		
		for(double mydouble: doubleArray){
			
			System.out.printf("%.1f ", mydouble);
			
		}
		
		
		
		//Fill elements
		int [] filledArray = new int [10];
		
		Arrays.fill(filledArray, 7);
		//Call a static method "Fill" from the Arrays class
		
		displayArray(filledArray, "filledArray");
		//Displays the array
		
		
		
		//Copy elements
		int[] intArray = {1,2,3,4,5};
		int[] copyArray = new int [intArray.length];
		
		System.arraycopy(intArray, 0, copyArray, 0, intArray.length);
		//System.arraycopy(<array you want to copy>, <indexer of the array being copied>, <where you want the data to go>, <destination indexer>, <value to stop at>);
		//arraycopy is a Static method in the System class
		
		displayArray(intArray, "intArray");
		displayArray(copyArray, "copyArray");
		
		
		//Equality
		boolean result = Arrays.equals(intArray, copyArray);
		System.out.printf("\n\nintArray %s copyArray\n", (result ? "==": "!="));
		//(result ? "==": "!=") means that if its true then it prints "==" else it prints "!="
		
	}//end of main
	
	public static void displayArray(int [] array, String description){
		
		System.out.printf("\n%s: ", description);
		
		for(int value: array){
			
			System.out.printf("%d ", value);
			
		}//end of loop
		
	}//end of method
}//end of class