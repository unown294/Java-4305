public class account{
	
	private String name;
	//Only methods in this class can access this instance variable
	//Instance Variable
	
	public void setName(String name){
		//Void - the method will not return anything
		
		this.name = name; // this. is the instance variable while the name to the right of the equal sign is the local variable
		
	}
	
	public String getName(){
		return name;
	}
	
	
}//end class