public class Time2Test{
	
	public static void main(String [] args){
		
		//Creating new objects
		Time2 t1 = new Time2();			//Calling default constructor, Output: 00:00:00
		Time2 t2 = new Time2(2);		//2:00:00
		Time2 t3 = new Time2(21,34);	//21:34:00
		Time2 t4 = new Time2(12,25,42);	//12:25:42
		Time2 t5 = new Time2(t4);		//12:25:42	Supplying an object to the constructor
		
		displayTime("t1: all default arguements", t1);
		displayTime("t2: hour specified", t2);
		displayTime("t3: hour and minute specified", t3);
		displayTime("t4: hour, minute, and second specified", t4);
		displayTime("t5: Time2 object specified", t5);
		
		//Intentional to test error check or validation checking
		try{
			
			Time2 t6 = new Time2(27,74,99);
		
		}
		catch(IllegalArgumentException e){
			
			System.out.printf("%s", e.getMessage());	//gets the Throw message sent by the Time2 file
			
		}
		
	}//end main
	
	public static void displayTime(String header, Time2 t){
		
		System.out.printf("%s\n %s\n %s\n", header, t.toUniversalTime(), t.toString());
		System.out.println();
	}//end of method
	
}//end of class