import java.util.Scanner;

public class WorkerMain{
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		//Main options used in while loop selection
		String options = "Worker Options...\n" + 
						   "1. Option for programmer\n" +
						   "2. Option for Manager\n" +
						   "Enter q to exit";
		
		//Print out of first while loop options
		System.out.println("*************************");
		System.out.println(options);
		System.out.println("*************************");
		
		while(true){
			System.out.println("Select and option: ");
			String response = in.nextLine();
			
			//Exit statements for first While loop
			if(response.equals("q")){
				
				System.out.println("Exiting...")
				break;
				
			}
			
			//Programmer Object Methods for main class
			else if(response.equals("1")){
				Programmer programmer = new Programmer("Brad", "Bob", 1235, "Java, C++");
				
				String programmerOptions = "Programmer options\n" + 
											"1. Install operating System" +
											"2. View Worker Details" + 
											"Type q to exit programmer options";
				
				//Programmer Options
				System.out.println(programmerOptions);
				
				//Programmer while loop
				while(true){
					System.out.println("Select a programmer option: ");
					String pOption = in.nextLine();
					
					if(pOption.equals("q")){
							System.out.println("Exiting programmer options...")
							break;
					}
					
					//Install operating system method variable selection
					else if(pOption.equals("1")){
						System.out.println("Operating System?");
						String operatingSystem = in.nextLine();
						
						//sends data to the installComputer method in Programmer object
						programmer.installComputer(operatingSystem);
					}
					
					else if(pOption.equals("2")){
						
						//Views worker info from programmer object
						programmer.viewWorker();
					}
					
					else{
						System.out.println("Invalid programmer option");
					}
				}//End of Programmer While loop
			}//End of Programmer Option
			
			else if(response.equals("2"){
								
				
			}//End of else if for Manager response
			
			else{
				System.out.println("Invalid options");
			}
			
		}//end of Main While loop
	}//end of main
}//End of class