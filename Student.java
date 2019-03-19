public class Student{
	
	//Instance variable
	private String name;
	private double average;
	
	//Constructor
	public Student(String name, double average){
		
		//Assigning the name instance
		this.name = name;
		
		//Validate average and assign the value to the average instance
		if(average > 0.0){
			if(average <= 100.0){
				this.average = average;
			}
		}
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAverage(double average){
		//Validate average and assign the value to the average instance
		if(average > 0.0){
			if(average <= 100.0){
				this.average = average;
			}
		}
	}
	
	public String getName(){
		return name;
	}
	
	public double getAverage(){
		return average;
	}
	
	public String letterGrade(){
		String letterGrade="";
		//local variable
		
		if(average >= 90){
			letterGrade = "A";
		}
		else if(average >= 80){
			letterGrade = "B";
		}
		else if(average >= 70){
			letterGrade = "C";
		}
		else if(average >= 60){
			letterGrade = "D"
		}
		else{
			letterGrade = "F";
		}
		
		//returns the variable to the program that calls for it
		return letterGrade;
	}
}