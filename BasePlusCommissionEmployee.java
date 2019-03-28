public class BasePlusCommissionEmployee extends CommissionEmployee{		
	
	//CommissionEmployee - superclass
	//BasePlusCommissionEmployee - subclass
	
	private double baseSalary;
	
	//constructor
	//cannot inherit constructor from superclass
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary){
		
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		//we are calling the constructor from the superclass CommissionEmployee
		
		if(baseSalary < 0.0){
			
			throw new IllegalArgumentException("baseSalary must be >=0.0");
			
		}
		
		this.baseSalary = baseSalary;
		
	}//End of constructor
	
	public void setBaseSalary(double baseSalary){
		
		if(baseSalary < 0.0){
			
			throw new IllegalArgumentException("baseSalary must be >=0.0");
			
		}
		
		this.baseSalary = baseSalary;
	}
	
	public double getBaseSalary(){
		return baseSalary;
	}
	
	@Override
	public double earnings(){
		
		return (commissionRate * grossSales) + baseSalary;
		
	}
	
	@Override //Needs to be written to every method that needs to be overrided
	public String toString(){
		
		return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f", 
		"base-salaried employee", firstName, lastName,
		"Social Security Number", socialSecurityNumber,
		"grossSales", grossSales, "commissionRate", commissionRate,
		"baseSalary", baseSalary);
	
	}
}//end of class