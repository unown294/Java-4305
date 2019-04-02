public class Worker{
	
	private String firstName;
	private String lastName;
	private int id;
	
	//Constructor
	public Worker (String firstName, String lastName, int id){
		
		this.firstName = firstName; 
		this.lastName = lastName;
		this.id = id;
		
	}
	
/** Set methods **/
	
	public void setFirstName(String firstName){		
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
/** Get methods **/
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public int getId(){
		return id;
	}
	
/** Other methods for this class **/
	
	public void viewWorker(){
		
		System.out.println("Worker Details");
		System.out.println("First name:" + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("ID: " + id);
		
	}
}//end of class