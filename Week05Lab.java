package week05Lab;

import java.util.List;
import java.util.Map;

public class Week05Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * A standard deck of playing cards has 52 cards as specified below
		 * i. There are 4 suits: Clubs, Diamonds, Hearts, & Spades
		 * 
		 * ii. Each suit has 13 cards: Two, Three, Four, Five, Six, Seven,
		 * Eight, Nine, Ten, Jack, Queen, King & Ace
		 * 
		 * iii. Comparing Cards: When comparing two cards, Ace
		 * is high and Two is low. To make this easy, a Two will have a value of 2, a
		 * Three will have a value of 3, ... and an Ace will have a value of 14.
		 */
		
		// 1. Card Class:
		// Create a class called Card to represent a standard playing card.
		// Fields: The Card class should have the following fields:
		// a. name field
		// b. suit field
		// c. value field for comparing against other cards.
		//
		// Methods: This class can have any useful method.
		// a. describe() to display the card information to the Console.
		// b. Getters & Setters
		
		System.out.println("\n- Question 1: Card Class\n");
		// Add your code here to instantiate a Card
		
		Card card = new Card("Eight", "Hearts", 8);
	
		
		
		// Call the describe method on the newly instantiated card.
		
		card.describe();

		// 2. Deck Class:
		// Create a class called Deck.
		// Fields: This class should have a list of Card field called cards
		// that will hold all the cards in the deck.
		// List<Card> cards = new ArrayList<Card>();
		//
		// Constructor: The constructor for the Deck Class should
		// instantiate all 52 standard playing cards and add them to the cards list.
		//
		// Methods:
		// a. describe() to describe the deck to the Console --
		// print out all of the cards in the deck.
		
		System.out.println("\n- Question 2: Deck Class");
	    // Add your code here to instantiate a Deck
		
		Deck deck = new Deck();
	    
	    // Call the describe method on the newly instantiated deck.
		
		deck.describe();
		
		// 3. Deck shuffle() Method:
		// Add a shuffle method within the Deck Class
		System.out.println("\nQuestion 3: Deck shuffle() method");
				
		// Test your method here
		
		deck.shuffle();
				
						
		// Call the describe method on the newly shuffled deck.
		
		System.out.println("\nThe newly shuffled deck: ");
		deck.describe();
		
		
		// 4. Deck draw() Method:
		// Add a draw method within the Deck Class
		System.out.println("\nQuestion 4: Deck draw() method");
		
		// Test your method here
		
		System.out.println("\nDrawing one card of the top: ");
		
		System.out.println(deck.drawCard());
		
		
		// 5. Create Game Board:
		// Create and test a method that takes an int as a parameter (representing the
		// number of players for a game) and returns a Map<String, List<Card>>
		// that represents each player (i.e., "Player 1", "Player 2", etc..)
		// and their cards.
		//
		// The method should create a new instance of Deck, shuffle it,
		// and deal the cards out to the "players" in the Map.
		
		System.out.println("\nQuestion 5: Create Game\n");
		
		// Call your method here
		
		Deck deck1 = new Deck();
		
		Map<String, List<Card>> hands = deck1.dealCards(4); //deal to 4 players
		
		//printing each player's hand
		for (Map.Entry<String, List<Card>> entry : hands.entrySet()) {
			System.out.println(entry.getKey() + "'s hand:");
			for (Card card1: entry.getValue()) {
				System.out.println(" " + card1);
			}
			
			System.out.println();
			
		} //end of loop
		
		
		
		
		

		
		
		
				
				
		
		
		

	} //end of main

} //end of class
