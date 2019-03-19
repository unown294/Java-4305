public class account2{
	
	private String name;
	//instance variable
	
	//constructor
	//it initializes name with parameter name
	
	public account2(String name){
	//the name of the constructor and the name of the class must be the same (otherwise it returns error)
		
		this.name = name;
		
	}
	
	//set method
	public void setName(String name){
		
		this.name = name;
		
	}
	
	//get method
	
	public String getName(){
		
		return name;
		
	}
}//End class