public class Person{
	
	//Instance variables
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private String state;
	
	//Constructor
	public Person(String firstName, String lastName, String socialSecurityNumber, String state){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.state = state;
		
	}
	
/** Get Methods **/
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public String getSocialSecurityNumber(){
		return socialSecurityNumber;
	}
	
	public String getState(){
		return state;
	}
	
/** toString() method **/

	@Override
	public String toString(){
	
		//Returns in the following format
		/* 	
			Name: First & Last Name
			Social Security Number: Value of socialSecurityNumber
			State: value of state
		*/
		
		return String.format("%s: %s %s\n%s: %s\n%s: %s",
							 "Name", firstName, lastName, 
							 "Social Security Number", socialSecurityNumber,
							 "State", state);
	
	}
}