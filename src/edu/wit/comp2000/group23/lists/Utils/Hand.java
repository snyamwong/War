package edu.wit.comp2000.group23.lists.Utils;

import java.util.ArrayList;

public class Hand extends Pile {

	private ArrayList<Card> hand; // The cards in the hand.
	private int id;
	private static int idNext = 0;

	/**
	 * Creates empty hand.
	 */

	public Hand() {
		this.hand = new ArrayList<Card>();
	}

	/**
	 * Remove all cards from the hand, leaving it empty.
	 */
	public void clear() {
		this.hand.clear();
	}

	/**
	 * Add a card to the hand. It is added at the end of the current hand.
	 * 
	 * @param c
	 *            the non-null card to be added.
	 * @throws NullPointerException
	 *             if the parameter c is null.
	 */
	public void add(Card c) {
		if (c == null)
			throw new NullPointerException("Can't add a null card to a hand.");
		this.hand.add(c);
	}

	public String toString() {
		String cardPile = "";
		for (Card c : this.hand) {
			cardPile += c + " ";
		}
		return cardPile;
	}

	/**
	 * Returns the number of cards in the hand.
	 */
	@Override
	public int getLength() {
		return this.hand.size();
	}

	@Override
	public Card remove(int position) {
		return this.hand.remove(position);
	}

	@Override
	public boolean isEmpty() {
		return this.hand.isEmpty();
	}
}