public class Programmer extends Worker{
	
	//variables for this class
	private String language;
	
	//Constructor
	public Programmer(String firstName, String lastName, int id, String language){
		
		super(firstName, lastName, id);
		
		this.language = language;
	}
	
/** Other methods for this class **/
	
	public void installComputer (String operatingSystem){
		
		System.out.println(getFirstName() + getLastName()
							+ " is installing " + operatingSystem);

	}
	
	@Override
	public void viewWorker(){
		
		super.viewWorker();
		System.out.println("Programming languages: " + language);
		
	}

}//end of class