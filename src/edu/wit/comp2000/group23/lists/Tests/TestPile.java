package edu.wit.comp2000.group23.lists.Tests;

import org.junit.Assert;
import org.junit.Test;

import edu.wit.comp2000.group23.lists.Enums.SUIT;
import edu.wit.comp2000.group23.lists.Utils.Card;
import edu.wit.comp2000.group23.lists.Utils.Pile;

public class TestPile {
	@Test
	public void testGetLengthAndAdd(){
		Pile pile = new Pile();
		Card c1 = new Card(1, SUIT.Clubs);
		Card c2 = new Card(2, SUIT.Clubs);
		pile.add(c1);
		pile.add(c2);
		int length = pile.getLength();
		Assert.assertEquals(2, length);
	}
	
	@Test
	public void testToString(){
		Pile pile = new Pile();
		Card c1 = new Card(1, SUIT.Clubs);
		Card c2 = new Card(2, SUIT.Clubs);
		pile.add(c1);
		pile.add(c2);
		String expected = "Ace of Clubs 2 of Clubs Pile ID: 0";
		Assert.assertEquals(expected, pile.toString());
	}
	
	@Test
	public void testRemoveAndisEmpty(){
		Pile pile = new Pile();
		Card c1 = new Card(1, SUIT.Clubs);
		Card c2 = new Card(2, SUIT.Clubs);
		pile.add(c1);
		pile.add(c2);
		pile.remove(1);
		pile.remove(0);
		Assert.assertEquals(true, pile.isEmpty());
	}
}
