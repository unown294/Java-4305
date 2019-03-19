public class account3{
	private String name; //Instance variable
	private double balance; // instance variable
	
	public account3 (String name, double balance){
		
		this.name = name;
		
		//assigns the local values to the instance values
		
		if(balance > 0.0){				//validates the balance then assigns it
			this.balance = balance;
		}
	}
	
	public void setName (String name){
		
		this.name=name;
	}
	
	public void setBalance (double balance){
		
		//validates balance being a numerical value
		if(balance > 0.0){
			this.balance=balance;
		}
	}
	
	public String getName(){
		return name;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void deposit(double depositAmount){
		
		//validate the deposit
		if(depositAmount > 0.0){
			balance = balance + depositAmount;
		}
	}
}//end of class