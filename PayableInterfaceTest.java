public class PayableInterfaceTest{
	public static void main(String [] args){
		
		//interface array
		Payable [] payableobjects = new Payable [] {
			
			new Invoice2("DC22", "A Bolt", 2, 30.23),
			new Invoice2("3213", "tire", 4, 37.25),
			new SalariedEmployee2("Henry", "Roman", "333-22-1312", 800.00),
			new SalariedEmployee2("Lisa", "Barnes", "222-22-2222", 100.00),
			
		};
		
		//polymorphically testing each variables
		for(Payable currentPayable: payableobjects){
			
			System.out.printf("\n%s \n Payment due: %.2f", currentPayable.toString(), currentPayable.getPaymentAmount());
			
		}
	}
}