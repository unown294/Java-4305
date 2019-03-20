//Imports the scanner tool
import java.util.Scanner;

public class CustomerTest{
	public static void main(String [] args){
		
		//Declares the objects
		Customer customer1 = new Customer("Ezgi","Akar", 150.12);
		Customer customer2 = new Customer("Brad","John",175.13);
		
		//Prints initial values before modifying the credit amount
		System.out.printf("The first customers name is %s %s and credit limit is %.2f %n", customer1.getFirst_Name(), customer1.getLast_Name(), customer1.getCreditAmount());
		System.out.printf("The first customers name is %s %s and credit limit is %.2f %n", customer2.getFirst_Name(), customer2.getLast_Name(), customer2.getCreditAmount());
		
		//Adjust the credit ammount for Customer1
		double new_credit = (customer1.getCreditAmount() * .2) + customer1.getCreditAmount();
		customer1.setCreditAmount(new_credit);
		
		//Adjust the credit ammount for Customer2
		double new_credit2 = (customer2.getCreditAmount() * .2) + customer2.getCreditAmount();
		customer2.setCreditAmount(new_credit2);
		
		//Prints the new values for the credit accounts
		System.out.printf("The first customers name is %s %s and new credit limit is %.2f %n", customer1.getFirst_Name(), customer1.getLast_Name(), customer1.getCreditAmount());
		System.out.printf("The first customers name is %s %s and new credit limit is %.2f %n", customer2.getFirst_Name(), customer2.getLast_Name(), customer2.getCreditAmount());
		
	}//end of main
}//end of class