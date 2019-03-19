import java.util.Scanner;

public class atm{
	public static void main(String [] args){
		Scanner in = new Scanner (System.in);
		
		double balance = 1000;
		
		String options = "1. View Balance\n" + 
						 "2. Withdraw Money\n" +
						 "3. Deposit money\n" +
						 "Type q to exit";
		
		boolean x = true;
		
		while(x == true){
			System.out.println(options);
			System.out.println("Please Select and option: ");
			
			String response = in.next();
			
			if(response.equals("1")){
				//View Balance
				System.out.printf("Your current balance is $%.2f\n\n", balance);
			}
			
			else if(response.equals("2")){
				//Withdraw money
				
				System.out.println("How much money do you wish to withdraw: ");
				double withdraw = in.nextDouble();
				
				if(withdraw <= balance){
					balance = balance - withdraw;
					System.out.printf("$%.2f has been drawn from the account. You now have $%.2f in your account.\n\n", withdraw, balance);
				}
				else{
					System.out.printf("The withdraw amount of $%.2f exceeds the amount in your account. Cancelling transaction...\n\n", withdraw);
				}
			}
			
			else if(response.equals("3")){
				//Deposit money
				
				System.out.println("Please enter the amount you wish the deposit: ");
				double deposit = in.nextDouble();
				
				balance = balance + deposit;
				
				System.out.printf("The new balance of the account is now $%.2f\n\n", balance);
			}
			
			else if(response.equals("q")){
				//exits program
				
				System.out.println("Program is exiting...");
				break; //terminates the loop
			}
			
			else{
				System.out.printf("Please enter a valid answer from the table listed.\n\n");
			}
		}
	}
}