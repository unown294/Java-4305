public class Manager extends Worker{
	
	//variables for this class
	private int numberOfPeople;
	
	//Constructor
	public Manager(String firstName, String lastName, int id, int numberOfPeople){
		
		super(firstName, lastName, id);
		
		this.numberOfPeople = numberOfPeople;
	}
	
/** Other methods in this class **/
	
	public void increaseSalary(int salary){
		
		System.out.println(getFirstName() + ' ' + getLastName() + ' is increasing salary by the amount of' + salary);
		
	}
	
	@Override
	public void viewWorker(){
		
		super.viewWorker();
		System.out.println("Manager is responsible for " + numberOfPeople + " workers");

	}	
}