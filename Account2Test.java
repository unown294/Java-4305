public class Account2Test{
	
	public static void main(String [] args){
		String x = "Henry";
		
		account2 myAccount1 = new account2 (x);
		//We need to supply the name for the constructor in the class, account2
		//you must supply a name otherwise it will crash or error
		
		account2 myAccount2 = new account2 ("Brad");
		
		System.out.printf("myAccount1 name is %s%n",myAccount1.getName());
		System.out.printf("myAccount2 name is %s%n",myAccount2.getName());
	}//end of main method
}//end of class