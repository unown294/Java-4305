public class Multiplication{
	public static void main(String [] args){
		
		for(int x = 1; x <= 20; x++){
			for(int y = 1; y <= 20; y++){
				int z = x * y;
				
				System.out.printf("%4d",z);
			}
			
			System.out.printf("\n");
		}
	}
}

