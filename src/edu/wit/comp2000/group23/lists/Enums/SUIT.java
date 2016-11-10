package edu.wit.comp2000.group23.lists.Enums;

public enum SUIT {
	Hearts, Diamonds, Clubs, Spades, Invalid;

	public static SUIT ordinalOf(int o) {
		if (o == 0) {
			return SUIT.Hearts;
		} else if (o == 1) {
			return SUIT.Diamonds;
		} else if (o == 2) {
			return SUIT.Clubs;
		} else if (o == 3) {
			return SUIT.Spades;
		} else {
			return SUIT.Invalid;
		}
	}
}
