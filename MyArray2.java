public class MyArray2{
	public static void main(String [] args){
		
		final int array_length = 10;
		int [] array = new int[array_length];
		//The length is the array length variable. But the same could be accomplished with array list
		
		for(int x = 0; x < array.length; x++){
			array[x] = 2+2*x;
		}
		
		System.out.printf("%s%8s\n", "Index", "Value");
		
		for(int x = 0; x < array.length; x++){
			System.out.printf("%5d%8d\n", x, array[x]);
		}
	}
}