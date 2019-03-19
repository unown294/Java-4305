public class test4{
	public static void main(String [] args){
		int sum = 0;
		for(int y = 3; y > 1; y--){
			for(int x = 1; x < 3; x++){
				sum = y + x;
				System.out.println(sum);
			}
		}
	}
}