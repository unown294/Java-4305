import java.util.Scanner;

public class SellingPrice{
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		
		int x = 0;
		int counter = 0;
		int product_sum = 0; //Sum of all the products entered into the loop
		int product_sold_sum = 0; //Sum of all the products sold
		int years = 0;
		double selling_price = 0;
		
		while(x != -1){
			counter++;
			System.out.printf("%d. year sales revenue? (-1 to quit): ", counter);
			x = in.nextInt();
			
			if(x == -1){
				if(years > 0){
					System.out.printf("%d-year total sales revenue is: %d\n", years, product_sum);
					System.out.printf("%d-year total number of products sold is : %d\n", years, product_sold_sum);
				
					//Gets the overall sum selling price
					selling_price = (double) product_sum / product_sold_sum;
				
					System.out.printf("%d-year combined selling price is: %.2f\n", years, selling_price);
				}
				break;
			}
			
			years++;
			
			//Adds the X value to the product sum
			product_sum += x;
			
			System.out.printf("%d. year number of products sold?: ", counter);
			int product_sold = in.nextInt();
			
			//Adds the product_sold value to the sum
			product_sold_sum += product_sold;
			
			//Gets the selling Price
			selling_price = (double) x / product_sold;
			
			System.out.printf("%d. year product selling price is: %.2f\n\n", counter, selling_price);
			
		}
	}
}