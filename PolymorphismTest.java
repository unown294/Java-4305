public class PolymorphismTest{
	public static void main (String [] args){
		
	//Super class constructor
		CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jonnes", "111-22-3333", 10000, .06);
		
	//Sub-class constructor
		BasePlusCommissionEmployee baseplusCommissionEmployee = new BasePlusCommissionEmployee("Suzie", "Baines", "111-22-3333", 10000, .06, 300);
		
	//Super class toString() method
		System.out.printf("%s %s\n\n", "commissionEmployee", commissionEmployee.toString());

	//Sub-class toString() method
		System.out.printf("%s %s\n\n", "baseplusCommissionEmployee", baseplusCommissionEmployee.toString());
		
	//Polymorphism with commissionEmployee2 being the example
		CommissionEmployee commissionEmployee2 = baseplusCommissionEmployee;
		
	/**Quiz question is will this work**/
	/**will this work and if yes or no why**/
		BasePlusCommissionEmployee myobject = commissionEmployee;
	
	//calling the toString() method from the subclass as the object commissionEmployee2 is a Sub-class object
		System.out.printf("%s %s\n\n", "commissionEmployee2", commissionEmployee2.toString());
	}
}