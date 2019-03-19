public class MultiDimensionalArray{
	
	public static void main(String [] args){
		// int [<insert row amount>][<insert column amount>] example_array = <insert data>
		
		
		//Example 1
		int [][] myarray = {{1,2,3},
							{4,5,6}};
		/*
		1 2 3
		4 5 6
		*/
		//myarray[0][0] = 1
		//myarray[1][2] = 6
		
		
		//example 2
		int [][] myarray1 = {{1,2},
						{3},
						{4,5,6}};
		/*	OUTPUT WILL BE:
			1 2
			3
			4 5 6
		*/
		
		//example 3
		int [][] myarray2 = new int [2][2];
		
		/*	OUTPUT WILL BE
		_ _
		_ _
		
		*/
		
		//example 4
		int [][] myarray3 = new int [2][];
		myarray3[0] = new int [5];			//Creates 5 columns for row 0
		myarray3[1] = new int [3];			//Creates 3 columns for row 1
		
		outputArray(myarray);
		outputArray(myarray1);
		outputArray(myarray2);
		outputArray(myarray3);
		
	}
	
	public static void outputArray(int [][] myarray){
		//Print values
		for(int x = 0; x < myarray.length; x++){			//Does Row
			for(int y = 0; y < myarray[x].length; y++){		//Does Columns
				
				System.out.printf("%d ", myarray[x][y]);
				
			}
			System.out.println();
		}
		System.out.println();
	}
}