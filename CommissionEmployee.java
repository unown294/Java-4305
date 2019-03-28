//Superclass CommissionEmployee

public class CommissionEmployee extends Object{
	//extend
	//object is the superclass of the class, CommissionEmployee
	//each class in Java Extends the class, Object. As a result "extends Object" is not necessary
	
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	
	private double grossSales;
	private double commissionRate;
	
	//Constructor
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate){
		
		//validate grossSales
		if(grossSales < 0.0){
			
			throw new IllegalArgumentException("grossSales must be >= 0.0");
		
		}
		
		//validate commissionRate
		if(commissionRate <= 0.0 || commissionRate >= 1.0){
			
			throw new IllegalArgumentException("commissionRate must be greater than (>)0.0 and less than(<)1.0");
			
		}
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
		
	}
	
/** Set methods **/
	
	public void setGrossSale(double grossSales){
		
		//validate grossSales
		if(grossSales < 0.0){
			
			throw new IllegalArgumentException("grossSales must be >= 0.0");
		
		}
		
		this.grossSales = grossSales;
		
	}
	
	public void setCommissionRate(double commissionRate){
		
		//validate commissionRate
		if(commissionRate <= 0.0 || commissionRate >= 1.0){
			
			throw new IllegalArgumentException("commissionRate must be greater than (>)0.0 and less than(<)1.0");
			
		}
		
		this.commissionRate = commissionRate;
		
	}
	
/** Get Methods **/
	
	public String getLastName(){
		return lastName;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getSocialSecurityNumber(){
		return socialSecurityNumber;
	}
	
	public double getGrossSales(){
		return grossSales;
	}
	
	public double getCommissionRate(){
		return commissionRate;
	}
	
	//Calulate Earnings
	public double earnings(){
		return commissionRate * grossSales;
	}
	
	@Override 
	//Overrides a method name with the same name that is intended
	//Catches mistakes for us
	//we are overriding "toString" method which is in the class "Object"
	//CommissionEmployee extends Object, so it inherets all the methods & instance variables from the superclass "Object";
	//Method signature must be the Same,
	//Meaning the name of the method, number of parameters, parameters types, and order of the parameters must be the same.
	
	public String toString(){
		
		return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
		"commissionEmployee", firstName, lastName, "socialSecurityNumber",	socialSecurityNumber,
		"grossSales", grossSales, "commissionRate", commissionRate);
		
	}
	
}//end of class