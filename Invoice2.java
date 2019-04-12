public class Invoice2 implements Payable{
	//Use implements to include an interface
	//public class Invoice2 implements Payable, Runnable
	//public class Invoice2 extends Payable, Runnable
	//it is not possible, a subclass has only one superclass so we have to use implements
	
/***************/
/** Instances **/
/***************/	
	
	private final String partNumber;
	private final String partDescription;
	private final int quantity;
	private final double pricePerItem;
	
/*****************/
/** Constructor **/
/*****************/
	
	public Invoice2(String partNumber, String partDescription, int quantity, double pricePerItem){
		if(quantity < 0){
			throw new IllegalArgumentException("quantity must be greater than 0");
		}
		
		if(pricePerItem < 0.0){
			throw new IllegalArgumentException("pricePerItem must be greater than 0.0");
			
		}
		
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}
	
/****************/
/** Get Method **/
/****************/
	
	public String getPartNumber(){
		return partNumber;
	}
	
	public String getPartDescription(){
			return partDescription;
	}
	
	public int getQuantity(){
		return quantity;
	}
	public double getPricePerItem(){
		return pricePerItem;
	}
	
/**********************/
/** Override Methods **/
/**********************/
	
	@Override
	//We must Override abstract methods
	public double getPaymentAmount(){
		
		return getQuantity() * getPricePerItem();
		
	}
	
	@Override
	public String toString(){
		
		return String.format("%s: \n%s %s\n%s %s\n%s %d\n%s %.2f",
							  "Invoice", "Part number", getPartNumber(),
							  "Part Description", getPartDescription(),
							  "Quantity", getQuantity(),
							  "Price per Item", getPricePerItem());
	}
}//End of class