package edu.wit.comp2000.group23.lists;
import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

import edu.wit.comp2000.group23.lists.Enums.SUIT;

public class Deck {
	private ArrayList<Card> cards;
	private int id;
	private static int idNext = 0;

	/**
	 * Generates a new general purpose Deck of Bicycle playing cards
	 */
	public Deck(){
		this.cards = new ArrayList<Card>();
		this.id = Deck.idNext;
		Deck.idNext++;
		
		generateDeck(this.cards);
	}
	
	/**
	 * Instantiates Card objects for every Card and adds to Deck
	 * @param cards
	 */
	private void generateDeck(ArrayList<Card> cards){
		for(int i = 0; i < 4; i++){
			for(int j = 1; j < 14; j++){
				this.cards.add(new Card(j, SUIT.ordinalOf(i)));
			}
		}
	}
	
	/**
	 * Shuffles the Deck of Cards
	 */
	public void shuffle(){
		Card[] deck = (Card[]) this.cards.toArray();
		Stack<Card> stack = new Stack<>();
		Random r = new Random();
		
		for(int i = 0; i < deck.length; i++){
			int cardsToShuffle = deck.length;
			int next = (int) Math.floor((double)r.nextInt(cardsToShuffle));
			
			stack.add(deck[next]);
		}
		
		this.cards.clear();
		for(Card c : stack){
			this.cards.add(c);
		}
	}
	
	/**
	 * Deals a single Card from the top of the Deck
	 * @return
	 */
	public Card deal(){
		return null;
	}
	
	/**
	 * Gets the ID of the Deck
	 * @return
	 */
	public int getID(){
		return this.id;
	}
	
	
}
