package edu.wit.comp2000.group23.lists.Utils;

import java.util.ArrayList;

public class Hand extends Pile{
	
	private ArrayList<Card> hand;   // The cards in the hand.
	private int id;
	private ArrayList<Card> cards;
	private static int idNext = 0;
    /**
     * Creates empty hand.
     */
	public void Pile(){
		this.cards = new ArrayList<Card>();
		this.id = idNext;
		idNext++;
	}

	public Hand() {
        hand = new ArrayList<Card>();	
    }

    /**
     * Remove all cards from the hand, leaving it empty.
     */
    public void clear() {
        hand.clear();
    }
    /**
     * Add a card to the hand.  It is added at the end of the current hand.
     * @param c the non-null card to be added.
     * @throws NullPointerException if the parameter c is null.
     */
    public void addCard(Card c) {
        if (c == null)
            throw new NullPointerException("Can't add a null card to a hand.");
        hand.add(c);
    }
   
    public String toString(){
		String cardPile = "";
		for(Card c : this.cards){
			cardPile += c + " ";
		}
		return cardPile + "Hand ID: " + id;
	}
    /**
     * Returns the number of cards in the hand.
     */
    public int getCardCount() {
        return hand.size();
}
}

