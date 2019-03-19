import java.util.Scanner;

public class AccountTest{
	public static void main (String [] args){
		
		Scanner in = new Scanner(System.in);
		
		account myAccount = new account();
		//Create an account object from the class account
		//by useing the object, myAccount, we can access to use set and get methodes
		//in the class account
		
		System.out.printf("Intial name is %s%n%n", myAccount.getName());
		
		System.out.println("Please enter an account name: ");
		// ask for a name
		
		String theName = in.nextLine(); //Read a string value
		
		myAccount.setName(theName); // Assigns the new name
		
		System.out.printf("New name is %s%n%n",myAccount.getName());
	}
}