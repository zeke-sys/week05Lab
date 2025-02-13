package week05Lab;

import java.util.ArrayList;
import java.util.List;

public class Deck { //Deck class to have list of card field called cards
	
	private List<Card> cards;
	
	//Constructor
	
	public Deck() {
		cards = new ArrayList<>();
		
		String[] names = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack",
				"Queen", "King", "Ace"};
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

		for (int i = 0; i < names.length; i++) {
			for (String suit : suits) {
					cards.add(new Card(names[i], suit, values[i]));
			}
		}
	} //end of constructor
	
	
	//Describe method
	//In this describe method, the override annotation toSpring() was added to the Card class so
	//we wouldn't have to use card.getName() and card.getSuit(), etc. 
	//Cleaner code
	public void describe() {
		System.out.println("\nThis deck has 52 cards, as follows:\n");
		for (Card card: cards) {
		System.out.println(card);
		}
	}
	
	

} //end of class
