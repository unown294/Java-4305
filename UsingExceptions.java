public class UsingExceptions{
	public static void main(String [] args){
		
		try{
		
			throwException();
		
		}
		
		catch (Exception e){
			
			System.out.println("Exception handled in main method");
		
		}
		
		doesntThrowException();
		
	}//End of main method
	
	public static void throwException() throws Exception {	//Throws is only used in method as a keyword
		
		try {
			System.out.println("Method throwException");
			
			throw new Exception();
			//generate an exception
			
		}
		
		catch (Exception e){
			
			System.out.println("Exception handled in method throwException");
			throw e; //Rethrow for further exception processing
			
		}
		
		finally{
			
			System.err.println("Finally executed in throwException");
			//Regardless if an error occurs or not the finally will occur if present
			
		}
		
	}//end of throwException
	
	public static void doesntThrowException(){
		
		try{
			
			System.out.println("Method doesntThrowException");
				
		}
		
		catch(Exception e){
			
			System.err.println(e);
			
		}
		
		finally{
			
			System.out.println("The finally method within doesntThrowException has executed");
			
		}
	
	}//end of doesntThrowException
}//end of class