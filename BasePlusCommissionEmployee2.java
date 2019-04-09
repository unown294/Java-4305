public class BasePlusCommissionEmployee2 extends CommissionEmployee2{
	
	//instance variables
	private double baseSalary;
	
	//Constructor
	public BasePlusCommissionEmployee2(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary){
		
		//Calling the CommissionEmployee2 constructor
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		
		//validation check
		if(baseSalary < 0.0){
			throw new IllegalArgumentException("Base Salary must be > 0.0");
		}
		
		this.baseSalary = baseSalary;
	}
	
/** Set methods **/
	
	public void setBaseSalary(double baseSalary){
		//validation check
		if(baseSalary < 0.0){
			throw new IllegalArgumentException("Base Salary must be > 0.0");
		}
		
		this.baseSalary = baseSalary;
	}
	
/** Get Method **/
	
	public double getBaseSalary(){
		return baseSalary;
	}
	
/** Override Methods **/

	@Override
	public double earnings(){
		
		return getBaseSalary() + super.earnings();
		
	}

	@Override
	public String toString(){
		
		return String.format("%s %s, %s: %.2f", "Base-salaried", super.toString(), "Base Salary", getBaseSalary());
		
	}
}