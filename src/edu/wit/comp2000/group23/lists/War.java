package edu.wit.comp2000.group23.lists;

import edu.wit.comp2000.group23.lists.Utils.Deck;

public class War {

	public static void main(String[] args) {
			Deck d = new Deck();
			
			System.out.println(d.toString());
			d.shuffle();			
			System.out.println(d.toString());			
	}

}
