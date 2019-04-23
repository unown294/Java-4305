public class StringCompare{
	public static void main(String [] args){
		
		String s1 = new String("hello");
		//String Object
		
		String s2 = "goodbye";
		String s3 = "Happy Birthday";
		String s4 = "happy birthday";
		
		//equality
		if(s1.equals("hello")){
		
			System.out.println("s1 equals hello");
		
		}
		else{
			
			System.out.println("s1 doesn't equal hello");
			
		}
		
		//test for equality using ==
		//This isnt checking the value but rather comparing the address in memory
		if(s1 == "hello"){
			
			System.out.println("s1 equals the same object as hello");
			//the use of == is checking the object in memory rather than the contents	
		}
		
		else{
			System.out.println("s1 is not the same object as hello");
		}		
		
		if(s3.equalsIgnoreCase(s4)){
			
			System.out.println("s3 equals s4 with ignore case");
			//the use of == is checking the object in memory rather than the contents	
		}
		
		else{
			System.out.println("s1 is not equal to s4 with case ignored");
		}
		
		//compareTo
		System.out.println("s3.compareTo(s2) is %d", s1.compareTo(s2));
		
		//Testing regionMatches
		if(s3.regionMatches(0, s4, 0, 5)){
			
			System.out.println("First 5 characters of s3 and s4 match");
			
		}
		else{
			
			System.out.println("First 5 characters of s3 and s4 do not match");
			
		}
		
		if(s3.regionMatches(true, 0, s4, 0, 5)){
			
			System.out.println("First 5 characters of s3 and s4 match with case");
			
		}
		else{
			
			System.out.println("first 5 characters of s3 and s4 do not match with case");
		}
		
	}//End of main
}