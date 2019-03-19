public class MaximumTest{
	public static void main(String [] args){
		
		//We do not need to create an object from the class MaximumFInder to
		//call the method maximum, because its a static method
		//MaximumFinder myobject = new MaximumFinder(); - is not needed 
			
		//A static method calls another static method in another class
		//so call the method: thenameofclass.thenameofmethod
			
		double mymaximum = MaximumFinder.maximum(10.1, 12.2, 15.5);
		
		System.out.printf("Maximum number is %.2f\n", mymaximum);
		
	}
}