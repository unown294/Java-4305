public class invoice{
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;
	
	public invoice(String partNumber, String partDescription, int quantity, double pricePerItem){
		//local variables		
		this.partNumber = partNumber;
		//instance variable = local variable;
		
		this.partDescription = partDescription;
		
		if(quantity > 0){
			this.quantity = quantity;
		}
		
		if(pricePerItem > 0.0){
			this.pricePerItem = pricePerItem;
		}
	}
	
	public void setPpartNumber(String partNumber){
		
		this.partNumber = partNumber;
	}
	
	public void setPartDescription(String partDescription){
		
		this.partDescription = partDescription;
	}
	
	public void setQuantity(int quantity){
		if(quantity > 0){
			this.quantity = quantity;
		}
		if(quantity <= 0){
			this.quantity = 0;
		}
	}
	
	public void set_pricePerItem(double pricePerItem){
		if(pricePerItem > 0){
			this.pricePerItem = pricePerItem;
		}
		if(pricePerItem <= 0){
			this.pricePerItem = 0;
		}
	}
	
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
	
	//Calculates the invoice amount
	public double ammount(){
		return getQuantity() * getPricePerItem();
	}
}