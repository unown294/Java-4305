public class DoWhileTest{
	public static void main(String [] args){
		int counter = 1;
		
		do{
			System.out.printf("counter is %d%n", counter);
			counter++;
			
		}while(counter <= 20);
		
		
		//DoWhile loop 2
		int counter1 = 100;
		
		do{
			System.out.printf("Counter is %d%n", counter1);
			counter1--;
		
		}while(counter1 > 1);
	}
}