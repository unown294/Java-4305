public class PayrollSystemTest{
	public static void main(String [] args){
	
		//First object
		SalariedEmployee salariedEmployee = new SalariedEmployee("Bob", "Jamason", "222-11-3333", 500);
		
		//Second object
		CommissionEmployee2 commissionEmployee = new CommissionEmployee2("Sue", "Jones", "111-22-3333", 10000, 0.06);
		
		//Third Object
		BasePlusCommissionEmployee3 basePlusCommissionEmployee = new BasePlusCommissionEmployee3("Bob", "Lewis", "444-44-4444", 5000, 0.04, 300);
		
		//individually calling earnings method for each one
		System.out.printf("%s: %.2f\n", "SalariedEmployee Earnings", salariedEmployee.earnings());
		System.out.printf("%s: %.2f\n", "CommissionEmployee2 Earnings", commissionEmployee.earnings());
		System.out.printf("%s: %.2f\n", "BasePlusCommissionEmployee3 Earnings", basePlusCommissionEmployee.earnings());
		
		//Polymorphically - The way its written it can only store Employee3 objects
		Employee3 [] employees = new Employee3 [3];
		
		//Storing the objects
		employees [0] = salariedEmployee;
		employees [1] = commissionEmployee;
		employees [2] = basePlusCommissionEmployee;
		
		for(Employee3 currentEmployee: employees){
			//******************************************************//
			//					Order of For loop					//
			//******************************************************//
			//employees will return the first element				//
			//currentEmployee will be salariedEmployee				//
			//														//
			//employees will return the second element				//
			//currentEmployee == commissionEmployee					//
			//														//
			//employees will return the third element				//
			//currentEmployee == basePlusCommissionEmployee			//
			//******************************************************//
			
			System.out.println(currentEmployee);
			//It will invoke the toString method for each object
			//currentEmployee.toString();
			
			//Increase base salary of each basePlusCommissionEmployee object by 10%
			
			//If the object is an instance of the class BasePlusCommissionEmployee3
			if(currentEmployee instanceof BasePlusCommissionEmployee3){
				
				//In order for this to work you need to downcast cast.
				//Reason: as you can't import a super class object to a subclass object
				BasePlusCommissionEmployee3 employee = (BasePlusCommissionEmployee3) currentEmployee;
				
				//Increments the Base Salary by 10%
				employee.setBaseSalary(1.10 * employee.getBaseSalary());
				
				System.out.printf("New Base salary with 10%% increase is: %.2f\n", employee.getBaseSalary());
			}//end of if
			
			System.out.printf("earned %.2f\n\n", currentEmployee.earnings());
		}//end of for loop
		
		for(int i = 0; i < employees.length; i++){
			
			System.out.printf("Employee [%d] is a %s\n", i, employees[i].getClass().getName());
			
		}//End of for loop
	}
}