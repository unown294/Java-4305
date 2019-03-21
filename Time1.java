public class Time1{
	private int hour; 	//0 - 23
	private int minute; //0 - 59
	private int second; //0 - 59
	
	//no-arguement check
		
	public void setTime (int hour, int minute, int second){
		
		//validate hour, minute, and second values
		if(hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60){
			
			throw new IllegalArgumentException ("Hour, Minute, and/or Second was out of the normal range");
			
		}//end of if
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		
	}//end of constructor
	
	//convert to String in universal time format (HH:MM:SS)
	
	public String toUniversalString(){
		
		return String.format("%02d:%02d:%02d", hour, minute, second);
		//0 is a flag value
		//hour = 1 , 01
		//minute = 5, 05
		//minute = 15, 15
				
	}//end of method
	
	
	//convert to String in Standard Time format (H:MM:SS AM or PM)
	public String toStandardTimeString(){
		
		return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12: hour%12), minute, second, (hour < 12 ? "AM" : "PM"));
		//First boolean logic: if the hour is equal to 0 or 12 then print 12, otherwise print the remaind of hours/12
		//second boolean logic: If the hour is less than 12 print "AM", else print "PM"
		
	}
}