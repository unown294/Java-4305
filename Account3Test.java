import java.util.Scanner;

public class Account3Test{
	
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		
		//Retrieves the name from the user
		System.out.println("Please enter the name of the account: ");
		String x = in.nextLine();
		
		//retrieves the balance from the user
		System.out.println("Please enter the balance of the account: ");
		double money = in.nextDouble();
		
		//creates the object in for the program
		account3 myAccount1 = new account3 (x, money);
		
		//Displays the initial values or entered value
		System.out.printf("Account1 name is %s%nAccount1 balance is $%.2f%n", myAccount1.getName(), myAccount1.getBalance());
		
		//Depositing
		System.out.println("Please enter the desired amount to deposit: $");
		double t = in.nextDouble();
		
		if(t > 0.0){
			myAccount1.deposit(t);
			System.out.printf("%.2f is being added to your balance%n", t);
		}
		else{
			System.out.printf("Our system detected an error and cannot allow %.2f to be deposited", t);
		}
		
		//new balance
		System.out.printf("%s new balance is $%.2f%n", myAccount1.getName(), myAccount1.getBalance());
	}
}