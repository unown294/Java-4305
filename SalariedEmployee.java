public class SalariedEmployee extends Employee3{
	
	private double weeklySalary;
	
	//constructor
	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary){
		
		super(firstName, lastName, socialSecurityNumber);
		
		if(weeklySalary < 0.0){
			
			throw new IllegalArgumentException("weeklySalary must be >=0.0");
			
		}
		
		this.weeklySalary = weeklySalary;
	}
	
	public double getWeeklySalary(){
		
		return weeklySalary;
	
	}
	
	@Override
	public String toString(){
		return String.format("Salaried employee: %s\n%s: %.2f", super.toString(), "weeklySalary", getWeeklySalary());
	}
	
	@Override //Must be overriden due to abstractness in Employee3
	public double earnings(){
		return weeklySalary;
	}
}//end of class