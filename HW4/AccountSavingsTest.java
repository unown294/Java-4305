public class AccountSavingsTest{
	public static void main (String [] args){
		
		//editable interest value that will
		double interest_rate = .04;
		int month = 11;				//This value determines how many month interest is accrued
		
		//Creates the objects
		AccountSavings account1 = new AccountSavings(2000);
		AccountSavings account2 = new AccountSavings(3000);
		
		//modifyInterestRate the static instance in the class AccountSavings
		AccountSavings.modifyInterestRate(interest_rate);
		
		//Used to make the print statements
		for(int i = 0; i <= month; i++){
			
			//Only prints at the start to print the headers, balance header and base values
			if(i == 0){
				System.out.println();	//Used for spacing
				System.out.printf("Monthly balances for one year at %.2f\n", interest_rate);
				System.out.println("Balances:");
				System.out.printf("\t\t%s\t%s", "Account1", "Account2");
				System.out.printf("\nBase \t\t%s \t %s", account1.toString(), account2.toString());
			}
			
			//Forces the accounts to update there interest rates increases
			//the increase is based on the value that is given to the int month
			//in the for loop
			account1.calculateMonthlyInterest();
			account2.calculateMonthlyInterest();
			
			//Calls the toString method and prints the results
			System.out.printf("\nMonth %d: \t%s \t %s", i + 1, account1.toString(), account2.toString()); 
		}
	}
}