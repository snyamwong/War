package edu.wit.comp2000.group23.lists.Utils;

import java.util.ArrayList;

public class Player{
	
	//2 to 4 players, can't have three
	private int playerID;
	private Hand hand;
	private ArrayList<Card> pile;
	private Card currentCard;
	
	/**
	 * constructor for player
	 * @param playerID
	 * @param hand
	 */
	public Player(int playerID, Hand hand){
		this.playerID = playerID;
		this.hand = hand;
	}
	
	/**
	 * getter method for player's hand
	 * @return
	 */
	public Hand getHand(){
		return this.hand;
	}
	
	/**
	 * getter method for player's id
	 * @return
	 */
	public int getplayerID(){
		return this.playerID;
	}
	
	/**
	 * Player draws a card from Hand
	 * (Hand is a stack so method SHOULD be pop)
	 * @return Card 
	 */
	public Card drawsCard(){
		//return this.hand.pop();
		return null;
	}
	
	/**
	 * (Maybe change to boolean later)?
	 *  
	 *  Takes the player's currentCard, and puts it into a pile 
	 */
	public void putCardInPile(){
		this.pile.add(this.currentCard);
	}
	
	@Override
	/**
	 * toString method
	 * returns String 
	 */
	public String toString(){
		return "Player's playerID: " + this.getplayerID() + "\nPlayer's hand: " + this.getHand();
	}
}
