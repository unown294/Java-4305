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
		
		return baseSalary + super.earnings();
		
	}
	
	@Override //Needs to be written to every method that needs to be overrided
	public String toString(){
		
		/*	Another way to write it
		return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f", 
		"base-salaried employee", getFirstName(), getLastName(),
		"Social Security Number", getSocialSecurityNumber(),
		"grossSales", getGrossSales(), "commissionRate", getCommissionRate(),
		"baseSalary", baseSalary);
		*/
		
		return String.format("%s \n%s\n%s: %.2f", "Base Salaried", super.toString(), "Base Salary", getBaseSalary());
	
	}
}//end of class