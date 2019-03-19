import java.security.SecureRandom;

public class DeckOfCards{
	private static final SecureRandom randomNumber = new SecureRandom();
	private static final int Number_of_Cards = 52;
	private Card [] deck = new Card[Number_of_Cards];
	private int currentCard = 0;
	
	//Constructor
	public DeckOfCards(){
		String [] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"}; 
		//Length of 13
		//Index is 0 to 12
		
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		//length is 4
		//index is 0 to 3
		
		for(int i = 0; i<deck.length; i++){
			deck[i] = new Card(faces[i%13], suits[i/13]);
			// i%13 - result in values always between 0 & 12
			// i/13 - results in values always between 0 & 3
			// i=25
			// 25%13 = 12, face[12] = king
			// 25/13 = 1, suits[1] = Diamonds
		
		}//end for loop
	}
	
	public void shuffle(){
		currentCard = 0;
		
		for(int i = 0; i < deck.length; i++){
			int second = randomNumber.nextInt(Number_of_Cards);
			//Will generate numbers between 0 and 51
			
			Card temp = deck[i];
			deck[i] = deck[second];
			deck [second] = temp;
			
		}
	}
	
	public Card dealCard(){
		if(currentCard < deck.length){
			return deck[currentCard++];
		}
		else{
			return null;
		}
	}
		
}