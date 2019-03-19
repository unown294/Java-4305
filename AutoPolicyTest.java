import java.util.Scanner;

public class AutoPolicyTest{
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);

		System.out.printf("Please enter the Account number for the policy: ");
		int policy_number = in.nextInt();
		
		System.out.printf("Please enter the Make and Model for Policy: ");
		String make_and_model = in.next();
		
		System.out.printf("Please enter the state the vehicle is registered in: ");
		String state = in.next();
		
		AutoPolicy policy = new AutoPolicy(policy_number, make_and_model, state);
		
		System.out.printf("%s: %d%n%s: %s%n%s: %s%n",
		"Account Number", policy.getAccountNumber(), "Make and Model", policy.getMakeAndModel(), "State", policy.getState());
		
	}
}