package week05Lab;

public class Card { //class called card to represent a standard playing card
	
	//Fields
	private String name;
	private String suit;
	private int value;
	
	public Card(String name, String suit, int value) {
		this.name = name;
		this.suit = suit;
		this.value = value; //for comparing against other cards
	}
	
	
	//Methods
	public void describe() {
		System.out.println("This card is a/an " + name + " of " + suit + ", worth " + value + " points.");
	}
	
	
	@Override //overriding so the cards print normally. Otherwise you get something like Card@3d4eac69. See describe method comments in Deck class
	public String toString() {
		return name + " of " + suit + " (Value: " + value + ")";
	}
	
	
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	
	
	
	

} //end of class
