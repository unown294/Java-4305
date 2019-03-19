import java.util.Scanner;

public class login{
	public static void main(String [] args){
		//Login information
		String username = "Test";
		String password = "4444";
		int tries = 3;
		boolean username_t = false;
		boolean password_t = false;
		
		Scanner in = new Scanner(System.in);
		
		while(true){
			//Checks to see if you have anymore tries left
			if(tries == 0){
				System.out.println("Out of tries, account has been suspended until unlocked");
				break;
			}
			
			//Retrieves the desired username to login with
			System.out.printf("Username: ");
			String input_username = in.next();
			
			//Retrieves the login information for the password
			System.out.printf("Password: ");
			String input_password = in.next();
			
			//Checks the inputs to see if it exists
			if(input_username.equals(username)){
				username_t = true;
			}
			else{
				username_t = false;
			}
			
			//Checks the password for it being correct
			if(input_password.equals(password)){
				password_t = true;
			}
			else{
				password_t = false;
			}
			
			//Prints the results
			if(username_t == false && password_t == false){
				tries--;
				System.out.printf("Both username and password were incorrect, you have %d more tries\n", tries);
			}
			else if(username_t == false && password_t == true){
				tries--;
				System.out.printf("The username was incorrect, but a valid password was detected. You have %d more tries\n",tries);
			}
			else if(username_t == true && password_t == false){
				tries--;
				System.out.printf("The username was valid but an invalid password was detected. You have %d more tries\n", tries);
			}
			else if(username_t == true && password_t == true){
				System.out.printf("\nLogin successful\n");
				break;
			}
			else{
				System.out.printf("Well this was unexpected. This shouldnt be seen and if seen please let the programmer know");
			}
			
		}
	}
}