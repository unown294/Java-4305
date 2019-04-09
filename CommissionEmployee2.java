public class CommissionEmployee2 extends Employee3{
	
	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee2(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate){
		
		//calls Employee3 constructor
		super(firstName, lastName, socialSecurityNumber);
		
		if(grossSales < 0.0){
			throw new IllegalArgumentException("grossSales must be >=0.0");
		}
		
		this.grossSales = grossSales;
		
		if(commissionRate <=0.0 || commissionRate>=1.0){
			throw new IllegalArgumentException("commissionRate must be >0.0 and <1.0");
		}
		
		this.commissionRate = commissionRate;
	}
	
/** Get Methods **/
	
	public double getGrossSales(){
		return grossSales;
	}
	
	public double getCommissionRate(){
		return commissionRate;
	}
	
/** Override methods **/
	
	@Override
	public double earnings(){
		return getCommissionRate()*getGrossSales();
	}
	
	@Override
	public String toString(){
		
		return String.format("%s: %s\n%s: %.2f, %s: %.2f", "commission employee", super.toString(), "grossSales", getGrossSales(), "commissionRate", getCommissionRate());
	}
}