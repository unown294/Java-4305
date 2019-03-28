public class Employee2Test{
	
	public static void main(String [] args){
		Date birth = new Date(7, 24, 1949);
		Date hire = new Date (3, 12, 1988);
		//this is called class composition
		
		Employee2 myemployee = new Employee2("Henry", "Jamason", hire, birth);
		
		System.out.println(myemployee);
		
	}//end of main

}//end of class