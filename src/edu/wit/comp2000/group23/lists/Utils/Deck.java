package edu.wit.comp2000.group23.lists.Utils;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Random;

import edu.wit.comp2000.group23.lists.Enums.SUIT;
import edu.wit.comp2000.group23.lists.Exceptions.EmptyDeckException;

public class Deck extends Pile{
	private ArrayList<Card> cards;
	private int id;
	private int top;

	private static int idNext = 0;

	/**
	 * Generates a new general purpose Deck of Bicycle playing cards
	 */
	public Deck() {
		this.cards = new ArrayList<Card>();
		this.id = Deck.idNext;
		this.top = 0;
		Deck.idNext++;

		this.generateDeck();
	}

	/**
	 * Instantiates Card objects for every Card and adds to Deck
	 * 
	 * @param cards
	 */
	private void generateDeck() {
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j < 14; j++) {
				this.cards.add(new Card(j, SUIT.ordinalOf(i)));
			}
		}
	}

	/**
	 * Shuffles the Deck of Cards
	 */
	public void shuffle() {
		Collections.shuffle(this.cards);
		
		/*Card[] deck = (Card[]) this.cards.toArray();
		
		//Efficient Fisher-Yates shuffle
		int index;
		Card temp;
	    Random random = new Random();
	    
	    for (int i = deck.length - 1; i > 0; i--)
	    {
	    	index = random.nextInt(i + 1);
	    	
	        temp = deck[index];
	        deck[index] = deck[i];
	        deck[i] = temp;
	    }*/
	    
		//Clear the existing deck of cards and add back in shuffled order
		/*this.cards.clear();
		for(Card c : deck){
			this.cards.add(c);
		}*/
	}

	/**
	 * Deals a single Card from the top of the Deck
	 * 
	 * @return
	 * @throws EmptyDeckException
	 */
	public Card deal() throws EmptyDeckException {
		if (!this.isEmpty()) {
			this.top++;
			return this.cards.remove(this.top - 1);
		} else {
			throw new EmptyDeckException();
		}
	}

	/**
	 * Gets the ID of the Deck
	 * 
	 * @return
	 */
	public int getID() {
		return this.id;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isEmpty(){
		return this.cards.isEmpty();
	}
	
	/**
	 * Returns compact, formatted String representation of the deck
	 */
	@Override
	public String toString(){
		String deckString = "";
		for(int i = 0; i < this.cards.size(); i++){
			deckString += "[" + Card.toStringFormatted(this.cards.get(i)) + "] ";
		}
		
		return deckString;
	}

}
