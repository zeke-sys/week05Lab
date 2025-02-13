package week05Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		} //end of for loop
	} //end of constructor
	
	
	//Deck Shuffle Method
	//The Collections class consists exclusively of static methods that operate on or return collections (Java provided).
	public void shuffle() {
		Collections.shuffle(cards); //Randomly permutes the specified list using a default source of randomness
	}
	
	//Draw card from Deck
	
	public Card drawCard() {
		return cards.isEmpty() ? null : cards.remove(0); //if the list contains elements, remove the first card
	}
	
	//Method that takes an int as a parameter (representing the number of players for a game)
	//and returns a Map<String, List<Card>> that represents each player
	//(i.e., "Player 1", "Player 2", etc.) and their cards).
	//This method creates a new instance of Deck, shuffle it, and deal the cards out to the "players" in the Map
	
	public Map<String, List<Card>> dealCards(int numPlayers) {
		if (numPlayers < 1) {
			throw new IllegalArgumentException("Number of players must be at least 1."); //making sure the right input is entered
		}
		
		shuffle(); //shuffling before dealing
		Map<String, List<Card>> playerHands = new HashMap<>();
		
		//initialize player hands
		for(int i=1; i<=numPlayers; i++) {
			playerHands.put("Player " + i, new ArrayList<>());
		}
		
		int playerIndex = 1;
		
		while (!cards.isEmpty()) {
			String player = "Player " + playerIndex;
			playerHands.get(player).add(drawCard()); //Deal a card to current player
			playerIndex = (playerIndex % numPlayers) + 1; //Move to the next player
		}
		
		return playerHands;
		
	} //end of method
	
	
	//Describe method
	//In this describe method, the override annotation toSpring() was added to the Card class so
	//we wouldn't have to use card.getName() and card.getSuit(), etc. 
	//Cleaner and more reusable code
	public void describe() {
		System.out.println("\nThis deck has 52 cards, as follows:\n");
		for (Card card: cards) {
		System.out.println(card);
		}
	}
	
	

} //end of class
