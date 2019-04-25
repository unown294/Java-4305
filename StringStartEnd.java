public class StringStartEnd{
	
	public static void main(String [] args){
		
		String [] strings = {"started",  "starting", "ended", "ending"};
		
		for(String string: strings){
			
			if(string.startsWith("st")){
				System.out.printf("%s starts with 'st'.\n", string);
			}
			
			else{
				System.out.printf("%s does not start with 'st'.\n", string);
			}
		}
		
		System.out.println();
		
		for(String string: strings){
			
			if(string.endsWith("ed")){
				System.out.printf("%s ends with 'ed'.\n", string);
			}
			
			else{
				System.out.printf("%s does not end with 'ed'.\n",string);
			}
		}
	}
}