package edu.wit.comp2000.group23.lists.Utils;

import edu.wit.comp2000.group23.lists.Enums.SUIT;

public class Card {
	private int value;
	private SUIT suit;

	/**
	 * Instantiates a new Card with a given value and suit
	 * 
	 * @param v
	 * @param s
	 */
	public Card(int v, SUIT s) {
		this.value = v;
		this.suit = s;
	}

	/**
	 * Gets the value of the referenced card
	 * 
	 * @return int value
	 */
	public int getValue() {
		return this.value;
	}

	/**
	 * Gets the SUIT of the referenced card
	 * 
	 * @return Enum SUIT
	 */
	public SUIT getSuit() {
		return this.suit;
	}

	/**
	 * Returns the pretty Royalty name of the given value if necessary
	 * 
	 * @param value
	 * @return String pretty Royalty name
	 */
	public String getRoyaltyName(int value) {
		if (value >= 2 && value <= 10) {
			return "" + value;
		} else if (value == 1) {
			return "Ace";
		} else if (value == 11) {
			return "Jack";
		} else if (value == 12) {
			return "Queen";
		} else if (value == 13) {
			return "King";
		} else {
			return "Invalid";
		}
	}

	/**
	 * Returns the string representation of the referenced card Example: 6 of
	 * Hearts, Jack of Spades, 9 of Diamonds
	 */
	@Override
	public String toString() {
		return this.getRoyaltyName(this.value) + " of " + this.suit.name();
	}

	/**
	 * Returns formatted, shortened string representation of the referenced card
	 * Example: QD, JS, 4C, 9H
	 * 
	 * @param c
	 * @return
	 */
	public static String toStringFormatted(Card c) {
		String cardString = "";

		if (c.getValue() == 1 || c.getValue() == 11 || c.getValue() == 12 || c.getValue() == 13) {
			cardString += c.getRoyaltyName(c.value).substring(0, 1);
		} else {
			cardString += c.getValue();
		}

		cardString += c.getSuit().name().substring(0, 1);

		return cardString;
	}
}
