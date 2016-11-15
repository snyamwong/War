package edu.wit.comp2000.group23.lists.Utils;

import java.util.ArrayList;
import java.util.Collections;

public class Pile{
	
	private ArrayList<Card> cards;
	private int id;
	private static int idNext = 0;
	
	/**
	 * Constructor for Pile
	 */
	public Pile(){
		this.cards = new ArrayList<Card>();
		this.id = idNext;
		idNext++;
	}
	
	/**
	 * shuffle uses Collections.sort
	 */
	public void shuffle(){
		Collections.shuffle(cards);
	}
	
	@Override
	/**
	 * toString() for Pile
	 */
	public String toString(){
		String cardPile = "";
		for(Card c : this.cards){
			cardPile += c + " ";
		}
		return cardPile + " " + id;
	}
	
	/**
	 * add card to pile's ArrayList
	 * @param c
	 */
	public void add(Card c){
		this.cards.add(c);
	}
	
	/**
	 * remove card from the list from Pile
	 * @param position
	 * @return
	 */
	public Card remove(int position){
		return this.cards.remove(position);
	}
	
	/**
	 * get length for Pile
	 * @return
	 */
	public int getLength(){
		return this.cards.size();
	}
}
