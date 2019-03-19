import java.util.Scanner;

public class InvoiceTest{
	
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		
		//retrive the part name
		System.out.println("Please enter the part number of the product: ");
		String partNumber = in.nextLine();
		
		//retrives part description
		System.out.println("Please describe the part number: ");
		String partDescription = in.nextLine();
		
		//retrive quantity desired
		System.out.println("How many of this part do you want to order?: ");
		int quantity = in.nextInt();
		
		//retrive the price per part
		System.out.println("Please enter the price per part: ");
		double pricePerItem = in.nextDouble();
		
		//Creates the object
		invoice invoice1 = new invoice(partNumber,partDescription,quantity,pricePerItem);
		
		System.out.printf("An order for %s, which is %s, with a quantity of %d, and a price of $%.2f", invoice1.getPartNumber(),invoice1.getPartDescription(),invoice1.getQuantity(),invoice1.getPricePerItem());
		System.out.printf("%nThe total price of the order will be $%.2f", invoice1.ammount());
	}
	
}