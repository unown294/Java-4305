public class AccountSavings{
	private double savingsBalance;
	private static double annualInterestRate = 4;
	
	//Constructor
	public AccountSavings(double savingsBalance){
		
		if(savingsBalance <= 0.0){
			throw new IllegalArgumentException("Balance must be greater than 0.0");
		}
		
		this.savingsBalance = savingsBalance;
	}
	
	public void calculateMonthlyInterest(){
		
		//Adds the accrued interest earned over a period of one month
		this.savingsBalance = savingsBalance + ((savingsBalance * annualInterestRate)/12);
	}
	
	//Modifys the interest rate as well as checking the interest rate
	public static void modifyInterestRate(double annualInterestRate){
		
		if(annualInterestRate < 0.0 || annualInterestRate > 1.0){
			throw new IllegalArgumentException("The annualInterestRate must be between 0.0 and 1.0");
		}
		
		AccountSavings.annualInterestRate = annualInterestRate;
	}
	
	//Override of the toString Object method
	@Override
	public String toString(){
		
		return String.format("$%.2f", savingsBalance);
		
	}
}