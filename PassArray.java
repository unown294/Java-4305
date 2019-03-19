public class PassArray{
	public static void main (String [] args){
		
		int [] myArray1 = {1, 2, 3, 4, 5};
		
		//display original values
		
		//enhanced for iteration
		
		//alternative
		
		/** 		
		for(int x = 0; x < myArray1.length; x++){
		
			System.out.printf("%d", myArray1[x]);

		}//end of this loop
		**/
		
		
		for(int myvalue: myArray1){
		//myvalue = 1 , Retrieved from the myArray
		//myvalue = 2 , Retrieved from the myArray
		
			System.out.printf("%d ", myvalue);
			
		}
		
		modifyArray(myArray1);
		//this method will recieve the copy of the array
		
		//modified values
		for(int myvalue: myArray1){
			
			System.out.printf("%d ",myvalue);
			
		}
		
		//Disply original value of myArray1[3]
		System.out.printf("\nOriginal value of myArray1[3] is %d", myArray1[3]);
		
		//we are passing the copy of the element
		//pass by value
		
		//Pass by reference - the method receives the original value
		modifyElements(myArray1[3]);
		
		//display modified value of myArray1[3]
		System.out.printf("\nmodified value of myArray1[3] is %d", myArray1[3]);
		
	}//end of main method
	
	
	public static void modifyArray(int [] myArray){		 //Multiply each element of an array by 2
		//Modifys the array to increase it by 2
		for(int x = 0; x < myArray.length; x++){
		
			myArray[x] = myArray[x] * 2;

		}
	}//end of modifyArray / method
	
	public static void modifyElements(int element){
		
		element = element * 2;
		
		System.out.printf("\nValue of the element in modifyElement is %d\n", element);
	}//end of modifyElement / method
}