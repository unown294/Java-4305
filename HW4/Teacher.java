public class Teacher extends Person{
	
	//Instance variables
	private int numberCourse;
	
	//Constructor
	public Teacher(String firstName, String lastName, String socialSecurityNumber, String state,int numberCourse){
		
		//Calls for the constructor in the Super class "Person.java"
		super(firstName,lastName,socialSecurityNumber,state);
		
		this.numberCourse = numberCourse;
	}
	
/** Get Methods **/
	
	public int getNumberCourse(){
		return numberCourse;
	}	
	
/** Override methods **/
	
	@Override	//overrides the toString in Person.java
	public String toString(){
		
		//Calls the toString method from the super class and prints the number of classes as well
		return String.format("%s \n%s: %d\n", super.toString(), "Number of Courses", getNumberCourse());
		
	}
	
}