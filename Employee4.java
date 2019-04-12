public abstract class Employee4 implements Payable{
		
/***************/
/** Instances **/
/***************/	
	
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	
/*****************/
/** Constructor **/
/*****************/

	public Employee4 (String firstName, String lastName, String socialSecurityNumber){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		
	}
	
/****************/
/** Get Method **/
/****************/

	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public String getSocialSecurityNumber(){
		return socialSecurityNumber;
	}
	
/**********************/
/** Override Methods **/
/**********************/
	
	@Override
	public String toString(){
		
		return String.format("%s: %s %s %s", "Employee", getFirstName(),getLastName(), getSocialSecurityNumber());
		
	}
	
	@Override
	public double getPaymentAmount(){
		
		return earnings();
		
	}
	
	public abstract double earnings();
}