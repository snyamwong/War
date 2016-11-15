package edu.wit.comp2000.group23.lists.Utils;

import java.util.ArrayList;

public class Hand extends Pile{
	
	private ArrayList<Card> hand;   // The cards in the hand.

    /**
     * Creates empty hand.
     */
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
   

    /**
     * Returns the number of cards in the hand.
     */
    public int getCardCount() {
        return hand.size();
}
}
