import java.security.SecureRandom;

public class RollDice{
	public static void main(String [] args){
		SecureRandom myrandom = new SecureRandom();
		
		int frequency1 = 0;
		int frequency2 = 0;
		int frequency3 = 0;
		int frequency4 = 0;
		int frequency5 = 0;
		int frequency6 = 0;
		
		for(int i = 1; i<6000000; i++){
			
			int face = 1 + myrandom.nextInt(6); //1,2,3,4,5,6
			
			switch(face){
				case 1:
					frequency1++;
					break;
				case 2:
					frequency2++;
					break;
				case 3:
					frequency3++;
					break;
				case 4:
					frequency4++;
					break;
				case 5:
					frequency5++;
					break;
				case 6:
					frequency6++;
					break;
				default:
					System.out.println("An unknown error has occured. This possibly due to the value being outside the bounds of the Cases being tested");
					break;
			}//End of Switch
		}//End of main
		
		System.out.println("\nFace\tFrequency"); //Header for table
		System.out.printf("1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n",frequency1,frequency2,frequency3,frequency4,frequency5,frequency6);
	}
}