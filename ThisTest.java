public class ThisTest{
	
	public static void main(String [] args){
		
		SimpleTime time = new SimpleTime(15,15,15);
		System.out.println(time.buildString());
		
	}//end of main
	
}//end class

class SimpleTime{
	private int hour;
	private int minute;
	private int second;
	
	public SimpleTime(int hour, int minute, int second){
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		
	}
	
	public String buildString(){
		
		return String.format("%24s: %s\n%24s: %s", "this.toUniversalString",
		this.toUniversalString(), "toUniversalString", toUniversalString());
		//in this instance the code is saying this in the background of the program
		//both return the same value
		
	}
	
	public String toUniversalString(){
		
		return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
		//using "this." is not necessary
		
	}
	
}//end of class