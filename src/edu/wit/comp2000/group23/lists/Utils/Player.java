package edu.wit.comp2000.group23.lists.Utils;

import java.util.ArrayList;

public class Player {

	// 2 to 4 players, can't have three
	private int playerID;
	private Hand hand;
	private Pile pile;
	private Pile spoils;
	private Card currentCard;

	/**
	 * constructor for player
	 * 
	 * @param playerID
	 * @param hand
	 */
	public Player(int playerID, Hand hand, Pile pile) {
		this.playerID = playerID;
		this.hand = hand;
		this.pile = pile;
		this.spoils = new Pile();
	}

	/**
	 * getter method for player's hand
	 * 
	 * @return
	 */
	public Hand getHand() {
		return this.hand;
	}

	/**
	 * add to the player's hand
	 * 
	 * @param c
	 */
	public void addToHand(Card c) {
		this.hand.add(c);
	}

	/**
	 * getter method for player's id
	 * 
	 * @return
	 */
	public int getplayerID() {
		return this.playerID;
	}

	/**
	 * getter method for current card
	 * 
	 * @return
	 */
	public Card getCurrentCard() {
		return this.currentCard;
	}

	/**
	 * getter method for the player's spoils during war
	 * 
	 * @return
	 */
	public Pile getSpoils() {
		return this.spoils;
	}
	
	/**
	 * mutator method for current card
	 */
	public void setCurrentCard(Card c) {
		this.currentCard = c;
	}
	
	/**
	 * draws card once if hand is empty automatically addPileToHand
	 * 
	 * @return Card
	 */

	public void drawsCard() {
		// when the player's hand isn't empty
		if (!this.hand.isEmpty()) {
			this.setCurrentCard(this.hand.remove(hand.getLength() - 1));
		}
		// when the player's hand is empty
		else {
			this.addPileToHand();
			this.setCurrentCard(this.hand.remove(hand.getLength() - 1));
		}
	}

	/**
	 * Draws card three or less times during war
	 * 
	 * @return
	 */
	public void drawsWarCard() {
		int position = hand.getLength() - 1;
		int counter = 0;
		//if the player's hand isn't empty
		if (hand.getLength() != 0) {
			spoils.clear();
			while ((hand.getLength()) != 0 && (counter != 4)) {
				Card c = this.hand.remove(position);
				this.spoils.add(c);
				this.setCurrentCard(c);
				position--;
				counter++;
			}
		}
		//if the player's hand is empty
		else {
			addPileToHand();
			position = hand.getLength() - 1;
			spoils.clear();
			while ((hand.getLength() != 0) && (counter != 4)) {
				Card c = this.hand.remove(position);
				this.spoils.add(c);
				this.setCurrentCard(c);
				position--;
				counter++;
			}
		}
	}

	/**
	 * add pile to hand, also shuffles pile
	 */
	public void addPileToHand() {
		this.pile.shuffle();

		for (int i = 0; i < this.pile.getLength(); i++) {
			this.hand.add(this.pile.remove(i));
		}
	}

	/**
	 * (Maybe change to boolean later)?
	 * 
	 * Takes the player's currentCard, and puts it into a pile
	 */
	public void putCardInPile() {
		this.pile.add(this.currentCard);
	}

	@Override
	/**
	 * toString method returns String
	 */
	public String toString() {
		return "Player's playerID: " + this.getplayerID() + 
				"\nPlayer's hand: " + this.getHand() +
				"\nPlayer's current card: " + this.getCurrentCard();
	}
}
