public class SumArray{
	public static void main(String [] args){
		int [] array = {87, 68, 45, 45, 63, 85};
		int total = 0;
		
		for(int x = 0; x < array.length; x++){
			total += array[x];
		}
		
		System.out.printf("\nTotal of values is %d\n",total);
	}
}