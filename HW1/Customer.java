public class Customer{
	private String First_name;
	private String Last_name;
	private double creditAmount;
	
	// Constructor
	public Customer(String First_name, String Last_name, double creditAmount){
		this.First_name = First_name;
		
		this.Last_name = Last_name;
		
		//Validates the credit amount
		if(creditAmount > 0.0){
			this.creditAmount = creditAmount;
		}
	}
	
	// Allows for changes to the First name object variable
	public void setFirst_Name(String First_name){
		this.First_name = First_name;
	}
	
	// Allows for changes to the Last name object variable
	public void setLast_Name(String Last_name){
		this.Last_name = Last_name;
	}
	
	// Allows for changes to the Credit ammount object variable
	public void setCreditAmount(double creditAmount){
		if(creditAmount > 0.0){
			this.creditAmount = creditAmount;
		}
	}
	
	// Gets the object First name variable for any program calling for it
	public String getFirst_Name(){
		return First_name;
	}
	
	// Gets the object Last name variable for any program calling for it
	public String getLast_Name(){
		return Last_name;
	}
	
	// Gets the object Credit Amount variable for any program calling for it
	public double getCreditAmount(){
		return creditAmount;
	}
	
}//End of class