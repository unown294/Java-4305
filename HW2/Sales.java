import java.util.Scanner;

public class Sales{
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		
		//Fixed Values
		double Blueb_muff_price = 2.98;		 //Blueberry muffin Price
		double Choc_muffin_price = 4.50;     //Chocolate Chip Muffin Price
		double Banana_muffin_price = 9.98;	 //Banana muffin Price
		
		//Needed to be intialized for use in the loop
		int x = -1;
		double muffin_sales_sum = 0;	//Sum of all muffin sold
		int Blue_muff_sold = 0;			//Blueberry muffins sold
		int Choc_muffin_sold = 0;		//Chocolate muffin sold
		int Banana_muff_sold = 0;		//Banana Muffin Sold
		
		while(x != 0){
			System.out.printf("Enter muffin number (1-3 or 0 to stop): ");
			x = in.nextInt();
			
			if(x == 1 || x== 2 || x==3 || x==0)
			switch(x){
				case 0:
					//Calculates the sum of all muffins sold and exit case
					muffin_sales_sum = (double) Blue_muff_sold * Blueb_muff_price + Choc_muffin_price * Choc_muffin_sold + Banana_muffin_price * Banana_muff_sold;
					
					System.out.printf("\nTotal retail value of all muffins sold is: $%,.2f\n", muffin_sales_sum);
					
					break;
				case 1:
					System.out.printf("Enter quantity of blueberry muffins sold: ");
					Blue_muff_sold += in.nextInt();
					
					break;
				case 2:
					System.out.printf("Enter quantity of chocolate muffins sold: ");
					Choc_muffin_sold += in.nextInt();
					
					break;
				case 3:
					System.out.printf("Enter quantity of banana muffins sold: ");
					Banana_muff_sold += in.nextInt();
					
					break;
				default:
					//Do nothing hehehehehe
					System.out.printf("Oh look an error occured, tell my boss somethings wrong");
					break;
			}
			
			else{
				System.out.println("Muffin number must be between 1 and 3 or 0 to stop");
			}
		}
	}
}