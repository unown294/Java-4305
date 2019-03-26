//Example of overloaded method

public class Time2{
	
	private int hour;	//0-23
	private int minute;	//0-59
	private int second;	//0-59
	
	//New object examples
	//Time2 mytime = new Time2();
	//Time2 mytime = new Time2(15);
	//Time2 mytime = new Time2(15,15);
	//Time2 mytime = new Time2(15,15,15);
	
/**Constructors**/
	
	//default constructor - no argument constructor
	public Time2(){
		this(0,0,0);
	}
	
	public Time2(int hour){								//if only hour is sent
		this(hour, 0, 0);
	}
	
	public Time2(int hour, int minute){					//if only hour and minute are sent
		this(hour, minute, 0);
		//constructor delegation
	}
	
	//constructor
	public Time2(int hour, int minute, int second){		//if all values are sent and filled
		
		//validate hour
		if(hour < 0 || hour >=24){
			throw new IllegalArgumentException("hour must be between 0 & 23");
		}
		
		//validate minute
		if(minute<0 || minute>=60){
			throw new IllegalArgumentException("minute must be between 0 & 59");
		}
		
		//validate second
		if(second<0 || second >=60){
			throw new IllegalArgumentException("second must be between 0 & 59");
		}
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		
	}
	
	public Time2 (Time2 time){
		this(time.hour, time.minute, time.second);
		//hour, minute, and second are instance variable of object, time.
	}
	
/** Set methods **/
	
	public void setTime(int hour, int minute, int second){
		
		//validate hour
		if(hour < 0 || hour >=24){
			throw new IllegalArgumentException("hour must be between 0 & 23");
		}
		
		//validate minute
		if(minute<0 || minute>=60){
			throw new IllegalArgumentException("minute must be between 0 & 59");
		}
		
		//validate second
		if(second<0 || second >=60){
			throw new IllegalArgumentException("second must be between 0 & 59");
		}
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		
	}//end of setTime method

	public void setHour(int hour){
		
		//validate hour
		if(hour < 0 || hour >=24){
			throw new IllegalArgumentException("hour must be between 0 & 23");
		}
		
		this.hour = hour;
	}
	
	public void setMinute(int minute){
		
		//validate minute
		if(minute<0 || minute>=60){
			throw new IllegalArgumentException("minute must be between 0 & 59");
		}
		
		this.minute = minute;
	}
	
	public void setSecond(int second){
		
		//validate second
		if(second<0 || second >=60){
			throw new IllegalArgumentException("second must be between 0 & 59");
		}
		
		this.second = second;
	}
	
/** Get Methods **/

	public int getHour(){
		return hour;
	}
	
	public int getMinute(){
		return minute;
	}
	
	public int getSecond(){
		return second;
	}
	
	
	//Universal time format HH:MM:SS
	public String toUniversalTime(){
		
		return String.format("%02d:%02d:%02d",getHour(),getMinute(),getSecond());
	}
	
	//standard time format H:MM:SS
	public String toString(){
		
		return String.format("%d:%02d:%02d %s",(getHour()==0 || getHour()==12) ? 12: getHour()%12, getMinute(), getSecond(), (getHour()<12 ? "AM":"PM"));
												//			HOUR LOGIC															    AM or PM LOGIC
	
	}
}//end of class