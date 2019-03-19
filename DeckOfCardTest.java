public class DeckOfCardTest{
	public static void main(String [] args){
		DeckOfCards mydeck = new DeckOfCards();
		mydeck.shuffle();
		
		for (int i = 1; i<= 52; i++){
			System.out.printf("%-19s", mydeck.dealCard());
			
			if(i%4 == 0){
				System.out.println();
			}
		}
		
	}
}