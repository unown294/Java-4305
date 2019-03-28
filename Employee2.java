public class Employee2{
	private String firstName;
	private String lastName;
	private Date hireDate;
	private Date birthDate;
	
	public Employee2 (String firstName, String lastName, Date hireDate, Date birthDate){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.hireDate = hireDate;
		this.birthDate = birthDate;
		
	}
	
	public String toString(){
		
		return String.format("%s, %s hired: %s Birthday: %s", lastName, firstName, hireDate, birthDate);
		//for hireDate and birthDate, java  implicitly call toString method from class Date
	}
}