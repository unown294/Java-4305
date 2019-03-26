public class Date{
	
	private int month;	//between 1 - 12
	private int day;	//between 1 - 31
	private int year;	//any year
	
	private static final int [] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //Length of 13, Index of 12
	
	//constructor
	public Date(int month, int day, int year){
		
		//validate month
		if(month<=0 || month>12){
			throw new IllegalArgumentException("Month must be between 0-12");
		}
		
		//validate day
		if(day<=0 || day > daysPerMonth[month] && !(month==2 && day==29)){
			throw new IllegalArgumentException("Days exceeded for the month selected");
		}
		
		//validate leap year
		//1. The year is evenly divisible by 4 - Leap year
		//2. If the year can be divided by 100 - its not a leap year unless the year is also divisible by 400
		//Ex: 1988 - its divisible by 4 but cant be divided by 400
		
		if(month==2 && day==29 && !(year%400==0 || (year%4 == 0 && year%100 != 0))){
			throw new IllegalArgumentException("Day is out of range for the specificed month");
		}
		
		this.month = month;
		this.day = day;
		this.year = year;
	}

	public void setDate(int month, int day, int year){
			
		//validate month
		if(month<=0 || month>12){
			throw new IllegalArgumentException("Month must be between 0-12");
		}
		
		//validate day
		if(day<=0 || day > daysPerMonth[month] && !(month==2 && day==29)){
			throw new IllegalArgumentException("Days must be between 0 & %d", daysPerMonth[month]);
		}
				
		//validate leap year
		//1. The year is evenly divisible by 4 - Leap year
		//2. If the year can be divided by 100 - its not a leap year unless the year is also divisible by 400
		//Ex: 1988 - its divisible by 4 but cant be divided by 400
		
		if(month==2 && day==29 && !(year%400==0 || (year%4 == 0 && year%100 != 0))){
			throw new IllegalArgumentException("Day is out of range for the specificed month");
		}
		
		this.month = month;
		this.day = day;
		this.year = year;
	}

	public String toString(){
		return String.format("%d/%d/%d", month, day, year);
	}
}