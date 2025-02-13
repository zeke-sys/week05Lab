package week05Lab;

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
		
		System.out.println("\n- Question 1: Card Class\n");
		// Add your code here to instantiate a Card
		
		Card card = new Card("Eight", "Hearts", 8);
	
		
		
		// Call the describe method on the newly instantiated card.
		
		card.describe();
		
		
		System.out.println("\n- Question 2: Deck Class");
	    // Add your code here to instantiate a Deck
		
		Deck deck = new Deck();
	    
	    // Call the describe method on the newly instantiated deck.
		
		deck.describe();
		
		// 3. Deck shuffle() Method:
		// Add a shuffle method within the Deck Class
		System.out.println("\nQuestion 3: Deck shuffle() method");
				
		// Test your method here
				
				
				
		// Call the describe method on the newly shuffled deck.

		
		
		
		
		
		

	} //end of main

} //end of class
