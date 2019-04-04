public abstract class Employee3{
	
	//abstract classes for which you never intend to create objects
	//they are only used as a superclass in inheritance hierarchy
	
	//they are incomplete
	
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	
	//Constructor
	public Employee3(String firstName, String lastName, String socialSecurityNumber){
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
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
	
/** Override methods **/
	
	@Override //From class objects
	public String toString(){
		
		return String.format("%s %s \nSocial Scurity Number: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
	
	}
	
/** Abstract Methods **/
	
	public abstract double earnings();
	//if there is an abstract method, such as the one above, in the super class
	//the subclass needs to override them in all classes below it in the hierarchy
	
	//we need the type of an employee
	
}